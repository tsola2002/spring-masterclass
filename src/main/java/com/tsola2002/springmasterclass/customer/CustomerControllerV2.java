package com.tsola2002.springmasterclass.customer;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// CONVERTS CLASS INTO REST API
@RestController
@RequestMapping(path = "/api/v2/customer")
public class CustomerControllerV2 {

  //private final CustomerRepo customerRepo;
  private final CustomerService customerService;



  @Autowired
  public CustomerControllerV2( CustomerService customerService) {
    this.customerService = customerService;
  }



//  @GetMapping
//  List<Customer> getCustomer(){
//    return customerService.getCustomer();
//  }

  @GetMapping(path = "{customerId}")
  Customer getCustomer(
      @PathVariable("customerId")
      Long id){

    //return customerService.getCustomers();
    //    return Collections.singletonList(
    //        new Customer(2L, "V2", "")
    //    );

    return customerService.getCustomers()
          .stream()
          .filter(c -> c.getId().equals(id))
          .findFirst()
          .orElseThrow(() -> new IllegalStateException("customer not found"));
  }

  //@RequestBody take a Json payload and maps it to a customer
  @PostMapping
  void createNewCustomer(
      @RequestBody
      Customer customer) {
    System.out.println("POST REQUEST...");
    System.out.println(customer);
  }

  @PutMapping
  void updateCustomer(
      @RequestBody
      Customer customer) {
    System.out.println("UPDATE REQUEST...");
    System.out.println(customer);
  }

  @DeleteMapping(path = "{customerId}")
  void deleteCustomer(
      @PathVariable("customerId")
      Long id
  ){
    System.out.println("DELETE REQUEST FOR CUSTOMER WITH ID " + id);
  }


}
