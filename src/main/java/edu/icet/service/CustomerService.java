package edu.icet.service;

import edu.icet.model.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    void addCustomer(CustomerDTO customer);

    void updateCustomer(CustomerDTO customer);

    void deleteCustomer(Integer Id);

    CustomerDTO searchById(Integer Id);

    List<CustomerDTO> getAll();
}
