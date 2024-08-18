package contact.management.data.repository;

import contact.management.data.model.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface ContactRepository extends MongoRepository<Contact, String> {

}
