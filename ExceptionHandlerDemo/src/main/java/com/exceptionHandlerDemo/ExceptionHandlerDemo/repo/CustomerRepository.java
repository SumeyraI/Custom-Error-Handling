package com.exceptionHandlerDemo.ExceptionHandlerDemo.repo;

import com.exceptionHandlerDemo.ExceptionHandlerDemo.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
