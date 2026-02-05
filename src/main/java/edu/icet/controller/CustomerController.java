package edu.icet.controller;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/delete-by-id")
    public void deleteById(Integer id){
        customerService.deleteCustomer(id);
    }


}
