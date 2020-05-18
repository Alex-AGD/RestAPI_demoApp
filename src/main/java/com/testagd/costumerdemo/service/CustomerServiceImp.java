package com.testagd.costumerdemo.service;

import com.testagd.costumerdemo.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CustomerServiceImp implements CustomerService {

    @Override
    public Customer getById(Long id) {
        return null;
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Customer> getAll() {
        return null;
    }
}

