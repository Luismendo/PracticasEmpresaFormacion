package com.example._Database_DB1.Student.application.Port;

import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Student.domain.student;

import java.util.List;

public interface GetStudentPort {
    public List<student> getAll();
    public student getById(String id) throws NotFoundException;
    public List<student> getByName(String name);
}
