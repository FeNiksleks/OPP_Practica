package src.main.java.Task_04.model;

import lombok.Data;

@Data
public class User {

    private final Long id;
    private final String fullName;
    private final Integer age;
    private final String phoneNumber;

}
