package contact.management.services;


import contact.management.dto.requests.ContactRequest;
import contact.management.dto.requests.LoginRequest;
import contact.management.dto.requests.RegistrationRequest;
import contact.management.dto.response.ContactResponse;
import contact.management.dto.response.LoginResponse;
import contact.management.dto.response.RegistrationResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserServiceImplTest {
 @Autowired
 private final UserServiceImpl service = new UserServiceImpl();



    @Test
    public  void testThatUserCanRegister(){
        RegistrationRequest firstUser =  new RegistrationRequest();
        firstUser.setFirstName("Nelson");
        firstUser.setLastName("Akewe");
        firstUser.setEmail("example@gmail.com");
        firstUser.setPassword("2222");
        firstUser.setPhoneNumber("234");

        RegistrationResponse response = service.userSignup(firstUser);
        assertThat(response).isNotNull();
    }

    @Test
    public void testThatUserCanLogin(){
        RegistrationRequest firstUser =  new RegistrationRequest();
        firstUser.setFirstName("kim");
        firstUser.setLastName("david");
        firstUser.setEmail("example2@gmail.com");
        firstUser.setPassword("2222");
        firstUser.setPhoneNumber("234");
        service.userSignup(firstUser);
        LoginRequest ll = new LoginRequest();
        ll.setEmail("example2@gmail.com");
        ll.setPassword("2222");
      LoginResponse response = service.userLogin(ll);
      assertThat(response.getMessage()).containsIgnoringCase("Login successful");

    }

    @Test
    public void testThatUserCanAddContact(){
//        RegistrationRequest firstUser =  new RegistrationRequest();
//        firstUser.setFirstName("mofe");
//        firstUser.setLastName("david");
//        firstUser.setEmail("mofe@gmail.com");
//        firstUser.setPassword("2345");
//        firstUser.setPhoneNumber("4234");
//        service.userSignup(firstUser);
//        LoginRequest ll = new LoginRequest();
//        ll.setEmail("mofe@gmail.com");
//        ll.setPassword("2345");
        ContactRequest request = new ContactRequest();
        request.setFirstName("oreoluwa");
        request.setLastName("Timothy");
        request.setPhoneNumber("09081111");
        ContactResponse response = service.addContact(request);
        assertThat(response).isNotNull();


    }

}