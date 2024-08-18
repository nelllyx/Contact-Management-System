package contact.management.dto.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactRequest {
    private  String firstName;
    private  String lastName;
    private String phoneNumber;
}
