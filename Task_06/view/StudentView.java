package geekbrains.homeworks.homework6.view;

import geekbrains.homeworks.homework6.model.Student;


// Здесь я использую "Принцип открытости/закрытости". Клиенты будут подключаться из представления интерфейса,
// но логика будет находиться в классе `StudentView`.

public class StudentView implements View {
    public void printConsole(Student student) {
        System.out.println(student);
    }
}
