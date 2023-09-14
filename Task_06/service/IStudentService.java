package geekbrains.homeworks.homework6.service;

import geekbrains.homeworks.homework6.model.User;

import java.util.List;



// Здесь я использую "Принцип разделения интерфейса". Если мне нужен интерфейс для работы только со студентами.

public interface IStudentService {
    List<User> readOnlyStudents();
}
