package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServices {

        @Autowired
        CustomerRepository customerRepository;

        public Customer getCustomerWhoOwnsAccount(Long customer_Id) {

            return customerRepository.findOne(customer_Id);
        }

         public List<Customer> getAllCustomers() {
            List<Customer> customers = new ArrayList<>();
            customerRepository.findAll().forEach(customers::add);
            return customers ;
        }

        public Customer getCustomer(Long customer_Id) {

            return customerRepository.findOne(customer_Id);
        }

        public void addCustomer(Customer customer) {

            customerRepository.save(customer);
        }

         public void updateCustomer(Long customer_Id, Customer customer) {

            customerRepository.save(customer);
        }



//        public void deleteCustomer(Long customer_Id) {
//        customerRepository.delete(customer_Id);
//        }
}

