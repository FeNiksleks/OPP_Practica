package geekbrains.homeworks.homework6.controller;

import geekbrains.homeworks.homework6.model.Student;
import geekbrains.homeworks.homework6.model.Type;
import geekbrains.homeworks.homework6.model.User;
import geekbrains.homeworks.homework6.service.IDataService;
import geekbrains.homeworks.homework6.view.View;

import java.util.List;


// Здесь мы используем "Принцип единой ответственности". В этом контроллере мы работаем только со
// студентами, если нам нужно будет работать со зданиями или чем-то еще, мы создадим
// другой контроллер (BuildingController).

public class StudentController {
 
//  Здесь мы используем "Принцип инверсии зависимостей". В этом контроллере мы используем
// интерфейсы "DataService" и "View", и эти интерфейсы реализуют "UserService" и "StudentView".

    private final IDataService dataService;
    private final View view;

    public StudentController(IDataService dataService, View view) {
        this.dataService = dataService;
        this.view = view;
    }

    public void createStudent(String name, String surname) {
        dataService.create(name, surname, Type.STUDENT);
    }

    public void getAllStudents() {
        List<User> studentList = dataService.readOnlyStudents();

        for (User user : studentList) {
            Student student = (Student) user;
            view.printConsole(student);
        }
    }
}
