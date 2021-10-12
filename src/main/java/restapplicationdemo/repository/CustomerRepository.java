package restapplicationdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import restapplicationdemo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
