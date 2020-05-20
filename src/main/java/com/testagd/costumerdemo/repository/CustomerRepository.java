package com.testagd.costumerdemo.repository;

import com.testagd.costumerdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link Customer} class.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

    void delete(Long id);
}
