package contact.management.services;

import contact.management.dto.requests.ContactRequest;
import contact.management.dto.requests.LoginRequest;
import contact.management.dto.requests.RegistrationRequest;
import contact.management.dto.response.ContactResponse;
import contact.management.dto.response.LoginResponse;
import contact.management.dto.response.RegistrationResponse;
import org.springframework.stereotype.Service;


public interface UserService {
    RegistrationResponse userSignup(RegistrationRequest request);
    LoginResponse userLogin(LoginRequest request);
    ContactResponse addContact(ContactRequest request);
}
