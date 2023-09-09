package com.tsola2002.springmasterclass.customer;

import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository implements CustomerRepo {

  @Override
  public List<Customer> getCustomers() {
    // TODO connect to real db
    return Collections.emptyList();
  }
}
