package projects.ApiBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projects.ApiBlog.model.Post;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByUsuarioId(Long id);
}
