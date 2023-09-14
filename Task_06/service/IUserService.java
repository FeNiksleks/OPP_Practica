package geekbrains.homeworks.homework6.service;

import geekbrains.homeworks.homework6.model.Type;
import geekbrains.homeworks.homework6.model.User;

import java.util.List;


// Здесь я использую "Принцип разделения интерфейса". Если мне нужен интерфейс для работы только с пользователями.

public interface IUserService {
    void create(String name, String surname, Type type);

    List<User> read();
}
