package com.tsola2002.springmasterclass.customer;

import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository(value = "fake")
//@Primary
public class CustomerFakeRepository implements CustomerRepo {

  @Override
  public List<Customer> getCustomer() {
    return Arrays.asList(
        new Customer(1L, "Omatsola"),
        new Customer(2L, "Austin")
    );
  }
}
