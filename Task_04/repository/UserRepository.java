package src.main.java.Task_04.repository;

import src.main.java.Task_04.model.User;

import java.util.List;

public interface UserRepository<T extends User> {

    List<T> getAll();
    void add(T t);
    void remove(String name);
    Long getMaxId();

}
