package com.exceptionHandlerDemo.ExceptionHandlerDemo.api;

import com.exceptionHandlerDemo.ExceptionHandlerDemo.Services.CustomerService;
import com.exceptionHandlerDemo.ExceptionHandlerDemo.entities.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/main")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
        return ResponseEntity.ok("Customer saved");
    }

    @GetMapping("/getAllCustomer")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();

    }
    @GetMapping("/getById/{id}")
    public Customer getById(@PathVariable ("id") Long id) {
        return customerService.getById(id);
    }
}
