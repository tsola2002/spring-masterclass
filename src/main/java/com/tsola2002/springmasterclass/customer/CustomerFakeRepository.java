package com.tsola2002.springmasterclass.customer;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository(value = "fake")
//@Primary
public class CustomerFakeRepository implements CustomerRepo {


  @Override
  public List<Customer> getCustomers() {
    return Arrays.asList(
        new Customer(1L, "Omatsola", "password123"),
        new Customer(2L, "Austin", "123pasword")
    );
  }
}
