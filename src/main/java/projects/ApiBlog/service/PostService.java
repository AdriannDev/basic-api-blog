package projects.ApiBlog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projects.ApiBlog.dto.PostRequestDTO;
import projects.ApiBlog.dto.PostResponseDTO;
import projects.ApiBlog.model.Post;
import projects.ApiBlog.model.Usuario;
import projects.ApiBlog.repository.PostRepository;
import projects.ApiBlog.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Post crearPost(Long usuarioId, PostRequestDTO postRequest) {
        return usuarioRepository.findById(usuarioId)
                .map(usuarioEncontrado -> {
                    Post post = new Post();
                    post.setTitulo(postRequest.getTitulo());
                    post.setDescripcion(postRequest.getDescripcion());
                    post.setUsuario(usuarioEncontrado);
                    return postRepository.save(post);
                })
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    public List<PostResponseDTO> getAllPosts() {
        return postRepository.findAll()
                .stream()
                .map(post -> new PostResponseDTO(
                        post.getId(),
                        post.getTitulo(),
                        post.getDescripcion(),
                        post.getUsuario()
                ))
                .toList();
    }

    public List<PostResponseDTO> getAllPostsByUsuarioId(Long usuarioId) {
        return postRepository.findByUsuarioId(usuarioId)
                .stream()
                .map(post -> new PostResponseDTO(
                        post.getId(),
                        post.getTitulo(),
                        post.getDescripcion(),
                        post.getUsuario()
                ))
                .toList();
    }


}
