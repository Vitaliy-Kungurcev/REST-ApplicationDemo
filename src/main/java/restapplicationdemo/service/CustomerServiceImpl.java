package restapplicationdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restapplicationdemo.model.Customer;
import restapplicationdemo.repository.CustomerRepository;

import java.util.List;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer getById(Long id) {
        log.info("CustomerServiceImpl. getById{}", id);
        return customerRepository.findById(id).get();
    }

    @Override
    public void save(Customer customer) {
        log.info("CustomerServiceImpl. save{}", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("CustomerServiceImpl. delete{}", id);

        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        log.info("CustomerServiceImpl. getall");

        return customerRepository.findAll();
    }
}
