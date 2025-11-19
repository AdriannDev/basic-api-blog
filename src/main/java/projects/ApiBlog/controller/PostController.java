package projects.ApiBlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projects.ApiBlog.dto.PostRequestDTO;
import projects.ApiBlog.dto.PostResponseDTO;
import projects.ApiBlog.model.Post;
import projects.ApiBlog.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<PostResponseDTO> listarPosts() {
        return postService.getAllPosts();
    }

    @PostMapping("/usuario/{usuarioId}")
    public Post crearPost(@PathVariable Long usuarioId, @RequestBody PostRequestDTO postRequestDTO) {
        return postService.crearPost(usuarioId, postRequestDTO);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<PostResponseDTO> getPostById(@PathVariable Long usuarioId){
        return postService.getAllPostsByUsuarioId(usuarioId);
    }







}
