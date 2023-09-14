package geekbrains.homeworks.homework6.model;

// Здесь мы используем "Принцип подстановки Лискова". Мы наследуем от родительского "User".

public class Teacher extends User {
    private int teacherId;

    public Teacher(String name, String surname, int teacherId) {
        super(name, surname);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
