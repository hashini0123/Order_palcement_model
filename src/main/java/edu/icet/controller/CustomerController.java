package edu.icet.controller;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/save-customer")
    public void saveCustomer(@RequestBody CustomerDTO customer){
        customerService.addCustomer(customer);
    }

    @GetMapping("/get-customers")
    public List<CustomerDTO> getCustomers(){
        return customerService.getAll();
    }


}
