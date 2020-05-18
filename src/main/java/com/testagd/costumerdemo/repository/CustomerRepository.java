package com.testagd.costumerdemo.repository;

import com.testagd.costumerdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Customer} class.
 */

public interface CustomerRepository extends JpaRepository<Customer,Long>{
}
