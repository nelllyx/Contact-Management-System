package contact.management.utils;

import contact.management.data.model.Contact;
import contact.management.data.model.User;
import contact.management.dto.requests.ContactRequest;
import contact.management.dto.requests.RegistrationRequest;

public class Map {

    public static User map(RegistrationRequest request){
        User register = new User();
       register.setFirstName(request.getFirstName());
       register.setLastName(request.getLastName());
       register.setEmail(request.getEmail());
       register.setPassword(request.getPassword());
       register.setPhoneNumber(request.getPhoneNumber());

       return register;
    }

    public static Contact user(ContactRequest request){
        Contact userContact = new Contact();
        userContact.setFirstName(request.getFirstName());
        userContact.setLastName(request.getLastName());
        userContact.setPhoneNumber(request.getPhoneNumber());

        return userContact;
    }
}
