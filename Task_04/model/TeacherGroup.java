package src.main.java.Task_04.model;

import lombok.Getter;
import lombok.ToString;
import src.main.java.Task_04.service.TeacherGroupIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
@ToString
public class TeacherGroup implements Iterable<Teacher> {

    private final List<Teacher> teachersList;

    public TeacherGroup() {
        teachersList = new ArrayList<>();
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(teachersList);
    }

}
