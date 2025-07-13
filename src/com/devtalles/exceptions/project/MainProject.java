package com.devtalles.exceptions.project;

import com.devtalles.exceptions.project.entities.Student;
import com.devtalles.exceptions.project.exceptions.DuplicateStudentException;
import com.devtalles.exceptions.project.exceptions.StudentNotFoundException;
import com.devtalles.exceptions.project.services.StudentService;
import com.devtalles.exceptions.project.services.UiService;

import java.util.InputMismatchException;
import java.util.List;

/**
 * Represents the main class to execute the system source code.
 */
public class MainProject {
    private final UiService uiService = new UiService();
    private final StudentService studentService = new StudentService();

    /**
     * Executes the main system engine
     */
    public void execute() {
        System.out.println("Bienvenido al Sistema de Registro de Estudiantes");
        uiService.printMenu();

        terminal:
        while (true) {
            try {
                int selectedMenuOption = UiService.inputInteger("Seleccione una opción");
                if (selectedMenuOption == 4) {
                    System.out.println("Nos vemos pronto.");
                    break terminal;
                }
                executeUseCase(selectedMenuOption);
            } catch (InputMismatchException e) {
                UiService.printSystemError("Entrada no válida. Por favor, verifica los datos ingresados.");
                uiService.printMenu();
            } catch (IllegalArgumentException | DuplicateStudentException | StudentNotFoundException e) {
                UiService.printSystemError(e.getMessage());
                uiService.printMenu();
            }
        }
    }

    /**
     * In charge of execute different system usec cases.
     * @param selectedMenuOption represents the select menu option
     */
    private void executeUseCase(int selectedMenuOption) {
        switch (selectedMenuOption) {
            case 1:
                addStudentUseCase();
                break;
            case 2:
                removeStudentUseCase();
                break;
            case 3:
                listStudentsUseCase();
                break;
            default:
                throw new InputMismatchException("Entrada no válida. Por favor, verifica los datos ingresados.");
        }
        uiService.printMenu();
    }

    /**
     * In charge of executing the add student use case.
     */
    private void addStudentUseCase() {
        String studentId = UiService.inputString("Ingrese el id de la estudiante (Ex. A12345)");
        String studentName = UiService.inputString("Ingrese el nombre del estudiante");
        byte studentAge = UiService.inputByte("Ingrese la edad del estudiante");

        Student student = new Student(studentId, studentName, studentAge);

        try {
            studentService.add(student);
        } catch (RuntimeException e) {
            UiService.printSystemError(e.getMessage());
        }
    }

    /**
     * In charge of executing the remove student use case.
     */
    private void removeStudentUseCase() {
        String studentId = UiService.inputString("Ingrese el id de la estudiante (Ex. A12345)");
        studentService.removeById(studentId);
    }

    /**
     * In charge of executing the get all students user case.
     */
    private void listStudentsUseCase() {
        System.out.printf("%-40s %-40s %-15s%n", "ID", "Name", "Age");
        System.out.println("----------------------------------------------------------------------------------------------");

        List<Student> students = studentService.getAll();
        students.forEach((s) -> {
            System.out.printf("%-40s %-40s %-15s%n",
                    s.getId(), s.getName(), s.getAge());
        });
    }
}
