package projects.ApiBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projects.ApiBlog.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
