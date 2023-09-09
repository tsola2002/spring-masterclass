package com.tsola2002.springmasterclass.customer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// CONVERTS CLASS INTO REST API
@RestController
@RequestMapping("/api/v1")
public class CustomerController {

  //private final CustomerRepo customerRepo;
  private final CustomerService customerService;



  @Autowired
  public CustomerController( CustomerService customerService) {
    this.customerService = customerService;
  }



//  @GetMapping
//  List<Customer> getCustomer(){
//    return customerService.getCustomer();
//  }

  @GetMapping("/customers")
  List<Customer> getCustomer(){
    return customerService.getCustomers();
  }


}
