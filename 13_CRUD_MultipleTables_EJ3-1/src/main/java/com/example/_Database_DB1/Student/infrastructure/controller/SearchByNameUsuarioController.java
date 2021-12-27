package com.example._Database_DB1.Student.infrastructure.controller;

import com.example._Database_DB1.Student.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Student.infrastructure.dto.output.ListUsuarioOutputDTO;
import com.example._Database_DB1.Student.infrastructure.dto.output.UsuarioOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchByNameUsuarioController {
    @Autowired
    GetUsuarioPort getUsuarioPort;

    @GetMapping("name/{name}")
    public List<UsuarioOutputDTO> getByName(@PathVariable String name){
        return new ListUsuarioOutputDTO(getUsuarioPort.getByName(name)).getUsuarioOutputDTOList();
    }
}