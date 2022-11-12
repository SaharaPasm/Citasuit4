package co.edu.unab.citasuitg62.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.citasuitg62.models.Usuario1Model;
import co.edu.unab.citasuitg62.services.Usuario1Service;

@RestController
@RequestMapping(path = "/usuario1")
public class Usuario1Controller {
    @Autowired
    Usuario1Service usuario1Service;

    @PostMapping()
    public Usuario1Model guardarUsuario1(@RequestBody Usuario1Model usuario1) {
        return usuario1Service.saveUsuario(usuario1);
    }

    @GetMapping
    public List<Usuario1Model> getAllUsuario1() {
        return usuario1Service.getAllUsuario1();
    }

    @DeleteMapping("/{id}")
    public String deleteUsuarioById(@PathVariable("id") Integer id) {
        return usuario1Service.eliminarUsuario1(id);
    }

    @DeleteMapping()
    public void eliminartodosusuarios() {
        usuario1Service.eliminartodosusuarios();
    }
}
