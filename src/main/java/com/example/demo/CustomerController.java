package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CustomerController {

    @Autowired
    private CustomerServices customerServices;

    @RequestMapping("/accounts/{customer_Id}/customers")
    public Customer getCustomerWhoOwnsAccount(@PathVariable Long customer_id) {
        return customerServices.getCustomerWhoOwnsAccount(customer_id);
    }

    @RequestMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerServices.getAllCustomers();
    }

    @RequestMapping("/customers/{customer_Id}")
    public Customer getCustomer(@PathVariable Long customer_Id) {
        return customerServices.getCustomer(customer_Id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customers")
    public void addCustomer(@RequestBody Customer customer) {
        customerServices.addCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/customers/{customer_Id}")
    public void updateCustomer(@RequestBody Long customer_Id, @PathVariable Customer customer) {
        customerServices.updateCustomer(customer_Id, customer);
    }

//        @RequestMapping(method = RequestMethod.DELETE, value = "/customer/{customer_Id}")
//        public void deleteCustomer(@PathVariable Long customer_Id){
//            customerServices.deleteCustomer(customer_Id);
//        }
//}
}