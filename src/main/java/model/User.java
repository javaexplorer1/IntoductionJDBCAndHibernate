package model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private long id;
    private String name;
    private String lastName;
    private byte age;
}
