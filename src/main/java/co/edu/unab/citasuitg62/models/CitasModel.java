package co.edu.unab.citasuitg62.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document("citas")
public class CitasModel {
    @Id
    private String idCitas;
    private String hora;
    private String idPaciente;
    private String idAgenda;

}
