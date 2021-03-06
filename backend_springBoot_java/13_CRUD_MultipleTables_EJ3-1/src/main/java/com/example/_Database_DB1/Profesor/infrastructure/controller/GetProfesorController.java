package com.example._Database_DB1.Profesor.infrastructure.controller;

import com.example._Database_DB1.Profesor.application.Port.GetProfesorPort;
import com.example._Database_DB1.Profesor.infrastructure.dto.output.FullProfesorOutputDTO;
import com.example._Database_DB1.Profesor.infrastructure.dto.output.ListProfesorOutputDTO;
import com.example._Database_DB1.Student_Asignatura.application.Port.GetAsignaturaPort;
import com.example._Database_DB1.Student_Asignatura.infrastructure.dto.output.SimpleAsignaturaOutputDTO;
import com.example._Database_DB1.Student_Asignatura.infrastructure.dto.output.SimpleListAsignatura_StudentOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetProfesorController {
    @Autowired
    GetProfesorPort getProfesorPort;

    @GetMapping("/Profesor")
    public List<FullProfesorOutputDTO> getAll(){
        return new ListProfesorOutputDTO(getProfesorPort.getAll()).getFullProfesorOutputDTOList();
    }
}
