package geekbrains.homeworks.homework6.view;

import geekbrains.homeworks.homework6.model.Student;


// Здесь я использую "Принцип открытости/закрытости". Клиенты будут подключаться из представления интерфейса,
// но логика будет находиться в классах, которые ее реализуют.
 
public interface View {
    void printConsole(Student student);
}
