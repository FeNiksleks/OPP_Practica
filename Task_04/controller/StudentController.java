package src.main.java.Task_04.controller;

import src.main.java.Task_04.model.Student;
import src.main.java.Task_04.service.StudentService;
import src.main.java.Task_04.service.UserService;

import java.util.List;

public class StudentController implements UserController<Student> {

    public UserService<Student> studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        studentService.create(fullName, age, phoneNumber);
    }

    @Override
    public List<Student> getAllUsersSortedByFirstName() {
        return studentService.getAllUsersSortedByFirstName();
    }

    @Override
    public List<Student> getAllUsersSortedByLastName() {
        return studentService.getAllUsersSortedByLastName();
    }

    @Override
    public List<Student> getAllUsersSortedByAge() {
        return studentService.getAllUsersSortedByAge();
    }

    @Override
    public List<Student> getAllUsersSortedById() {
        return studentService.getAllUsersSortedById();
    }

    @Override
    public boolean remove(String fullName) {
        studentService.remove(fullName);
        return true;
    }

    @Override
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @Override
    public void edit(String fullName, Integer age, String phoneNumber) {
        studentService.edit(fullName, age, phoneNumber);
    }


}
