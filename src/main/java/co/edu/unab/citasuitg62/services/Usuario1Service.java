package co.edu.unab.citasuitg62.services;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unab.citasuitg62.models.Usuario1Model;
import co.edu.unab.citasuitg62.repositories.Usuario1Repository;

@Service
public class Usuario1Service {
    @Autowired
    Usuario1Repository usuario1Repository;

    public Usuario1Model saveUsuario(Usuario1Model usuario1) {
        usuario1.setNombre(usuario1.getNombre().toLowerCase());
        usuario1.setApellido(usuario1.getApellido().toLowerCase());

        return usuario1Repository.save(usuario1);
    }

    public List<Usuario1Model> getAllUsuario1() {
        List<Usuario1Model> usuarios = usuario1Repository.findAll();
        usuarios.sort(Comparator.comparing(Usuario1Model::getNombre));
        return usuarios;
    }

    public String eliminarUsuario1(Integer id) {
        if (usuario1Repository.existsById(id)) {
            usuario1Repository.deleteById(id);
            return "Paciente eliminado";
        } else {
            return "no existe id";
        }
    }

    public void eliminartodosusuarios() {
        usuario1Repository.deleteAll();
    }
}
