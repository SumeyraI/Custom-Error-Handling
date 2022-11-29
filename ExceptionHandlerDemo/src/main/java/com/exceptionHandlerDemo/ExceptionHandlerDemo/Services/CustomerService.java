package com.exceptionHandlerDemo.ExceptionHandlerDemo.Services;

import com.exceptionHandlerDemo.ExceptionHandlerDemo.entities.Customer;
import com.exceptionHandlerDemo.ExceptionHandlerDemo.errorHandling.ResourceNotFoundException;
import com.exceptionHandlerDemo.ExceptionHandlerDemo.repo.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public void saveCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    public Customer getById(Long id){
        Optional<Customer> customer = customerRepository.findById(id);
        if (!customer.isPresent()) {
            throw new ResourceNotFoundException("The given customer not found " + id);
        }
        return customer.get();
    }
}
