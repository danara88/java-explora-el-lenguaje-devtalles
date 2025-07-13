package com.devtalles.exceptions.project.entities;

/**
 * Represents Studen domain entity.
 */
public class Student {
    /**
     * Represents the unique ID for the student.
     */
    private String id;

    /**
     * Represents the name of the student.
     */
    private String name;

    /**
     * Represents age of the student.
     */
    private byte age;

    /**
     * Represents the student constructor.
     * @param id unique id for the student
     * @param name name of the student
     * @param age age of the student
     */
    public Student(String id, String name, byte age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * Gets the student name.
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the student name.
     * @param name name assigned to the student
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the student age.
     * @return age of the student
     */
    public byte getAge() {
        return age;
    }

    /**
     * Sets the student age.
     * @param age age value to set to the student
     */
    public void setAge(byte age) {
        this.age = age;
    }

    /**
     * Gets the student ID.
     * @return the student unique ID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the student ID.
     * @param id unique id of the student
     */
    public void setId(String id) {
        this.id = id;
    }
}
