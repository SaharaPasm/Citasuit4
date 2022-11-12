package co.edu.unab.citasuitg62.models;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document("agendas")
public class AgendaModel {
    @Id
    private String idAgenda;
    private LocalDate fecha;
    private String idMedico;
    private ArrayList<Object> citas;
}
