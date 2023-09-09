package com.tsola2002.springmasterclass.customer;

import org.springframework.web.bind.annotation.GetMapping;

public class Customer {


  private final Long id;
  private final String name;



    public Customer(Long id, String name) {
      this.id = id;
      this.name = name;
    }

    public Long getId() {
      return id;
    }

  public Long getCustomerId() {
    return id;
  }

    public String getName() {
      return name;
    }


  @Override
  public String toString() {
    return "Customer{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }



}
