package projects.ApiBlog.dto;

import projects.ApiBlog.model.Usuario;

public class PostResponseDTO {
    private Long id;
    private String titulo;
    private String descripcion;
    private String username;

    public PostResponseDTO() {

    }

    public PostResponseDTO(Long id, String titulo, String descripcion, Usuario usuario) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
