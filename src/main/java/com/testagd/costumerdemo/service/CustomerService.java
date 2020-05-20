package com.testagd.costumerdemo.service;

import com.testagd.costumerdemo.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service interface for {@link Customer} class.
 *
 */
@Service
public interface CustomerService {

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();
}
