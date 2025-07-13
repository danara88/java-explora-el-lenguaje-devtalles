package com.devtalles.exceptions.project.services;

import com.devtalles.exceptions.project.entities.Student;
import com.devtalles.exceptions.project.exceptions.DuplicateStudentException;
import com.devtalles.exceptions.project.exceptions.StudentNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * In charge of handling student use case business logic.
 */
public class StudentService {
    private final List<Student> students = new ArrayList<>();

    /**
     * In charge of executing add use case logic.
     * @param student student to being added to the system
     */
    public void add(Student student) throws DuplicateStudentException {
        if(student.getName() == null || student.getName().isEmpty()) {
            throw new IllegalArgumentException("El nombre de estudiante no puede estar vacio.");
        }

        if(student.getAge() < 17 || student.getAge() > 100) {
            throw new IllegalArgumentException("Solo puedes registrar estudiantes entre 17 y lo 100 anios.");
        }

        if(!Pattern.matches("^[A-Z][0-9]{5}$", student.getId())) {
            throw new IllegalArgumentException("ID de estudiante invalido. Por favor ingresa un ID valido. Ejemplo: A12345");
        }

        if(getById(student.getId()) != null) {
           throw new DuplicateStudentException("El estudiante con ID '" + student.getId() + "' ya existe.");
        }

        students.add(student);
        System.out.println("El estudiante '" + student.getName() + "' fue registrado con exito." );
    }

    /**
     * In charge of executing remove by id student use case logic.
     * @param id represents the student id to being removed.
     */
    public void removeById(String id) throws StudentNotFoundException {
        Student student = getById(id);
        if(student == null) {
            throw new StudentNotFoundException("El estudiante con ID '" + id + "' no existe.");
        }
        System.out.println("El estudiante con ID '" + id + "' fue eliminado.");
        students.remove(student);
    }

    /**
     * In charge of executing get all students use case logic.
     */
    public List<Student> getAll() {
        return students;
    }

    /**
     * In charge of executing get student by id use case logic.
     * @param id represents assigned ID of the student to being removed
     * @return the student found by ID
     */
    public Student getById(String id) {
        return students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
    }
}
