package co.edu.unab.citasuitg62.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document("usuario1")

public class Usuario1Model {
    @Id
    private int idUsuario;
    private int numeroDocumento;
    private String tipoDocumento;
    private String correo;
    private String estado;
    private String genero;
    private String nombre;
    private String apellido;
    private int edad;
    private String contraseña;
    private String tipoUsuario;

}
