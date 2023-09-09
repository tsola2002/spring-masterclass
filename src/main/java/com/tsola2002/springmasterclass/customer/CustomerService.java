package com.tsola2002.springmasterclass.customer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {

  private final CustomerRepo customerRepo;

  // use @Qualifer to specify which repository method that will be used

  @Autowired
  public CustomerService(
      @Qualifier("fake")
      CustomerRepo customerRepo) {
    this.customerRepo = customerRepo;
  }


  List<Customer> getCustomers() {
    return customerRepo.getCustomers();
  }

//  Customer getCustomer() {
//    return new Customer(1L, "Omatsola Issac Sobotie");
//  }

}
