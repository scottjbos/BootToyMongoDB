package main.dao;

/**
 * TODO JavaDoc needs to written.
 *
 * @author boss
 */
import java.util.List;

import main.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}
