package contact.management.data.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document("user")
public class User {
    private String firstName;
    private  String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    @DBRef
    private List<Contact> contacts;

}
