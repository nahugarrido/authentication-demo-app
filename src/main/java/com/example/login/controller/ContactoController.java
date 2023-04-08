package com.example.login.controller;

import com.example.login.model.Contacto;
import com.example.login.repository.ContactoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contactos")
@AllArgsConstructor
public class ContactoController {
    private final ContactoRepository contactoRepository;

    @GetMapping
    public List<Contacto> listContacto() {
        return contactoRepository.findAll();
    }

    @PostMapping(value="/create")
    public void guardarContacto(Contacto contacto) {
        contactoRepository.save(contacto);
    }
}
