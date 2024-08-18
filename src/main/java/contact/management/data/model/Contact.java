package contact.management.data.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Document("contact")
public class Contact {
    private String firstName;
    private  String lastName;
    private String phoneNumber;

}
