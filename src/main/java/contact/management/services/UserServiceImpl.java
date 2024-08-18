package contact.management.services;

import contact.management.Exceptions.ContactException;
import contact.management.data.model.Contact;
import contact.management.data.model.User;
import contact.management.data.repository.ContactRepository;
import contact.management.data.repository.UserRepository;
import contact.management.dto.requests.ContactRequest;
import contact.management.dto.requests.LoginRequest;
import contact.management.dto.requests.RegistrationRequest;
import contact.management.dto.response.ContactResponse;
import contact.management.dto.response.LoginResponse;
import contact.management.dto.response.RegistrationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static contact.management.utils.Map.map;
import static contact.management.utils.Map.user;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository register;

    @Autowired
    private ContactRepository contact;
    @Override
    public RegistrationResponse userSignup(RegistrationRequest request) {
        User newUser = map(request);
        register.save(newUser);

        RegistrationResponse response = new RegistrationResponse();
        response.setMessage("Registration successful");
        return  response;
    }

    @Override
    public LoginResponse userLogin(LoginRequest request) {
        User user = register.findUserByEmail(request.getEmail());
        if(user == null){
            throw new ContactException("Email not found");
        }if(!user.getPassword().equals(request.getPassword())){
            throw new ContactException("Incorrect password");
        }
      LoginResponse response = new LoginResponse();
        response.setMessage("Login successful");
        return response;
    }

    @Override
    public ContactResponse addContact(ContactRequest request) {
        Contact newContact = user(request);
       // User user = register.findUserByEmail();

        List<Contact> contacts = new ArrayList<>();
        contacts.add(newContact);
       // user.setContacts();
        contact.save(newContact) ;
        ContactResponse response = new ContactResponse();
        response.setMessage("Registration successful");
        return  response;
    }


}
