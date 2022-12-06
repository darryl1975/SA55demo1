package sg.edu.nus.iss.demoDay1a.model;

import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    private String id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.id = UUID.randomUUID().toString().substring(0, 8);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

    }
}
