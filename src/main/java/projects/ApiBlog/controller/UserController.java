package projects.ApiBlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projects.ApiBlog.model.Usuario;
import projects.ApiBlog.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UserController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioService.crearUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }


}
