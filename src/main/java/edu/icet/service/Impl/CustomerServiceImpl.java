package edu.icet.service.Impl;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    List<CustomerDTO> customerList = new ArrayList<>();

    @Override
    public void addCustomer(CustomerDTO customer) {
        customerList.add(customer);
    }

    @Override
    public void updateCustomer(CustomerDTO customer) {
        customerList.update(customer.getId()-1,customer);

    }

    @Override
    public void deleteCustomer(Integer Id) {

    }

    @Override
    public CustomerDTO searchById(Integer Id) {
        return null;
    }

    @Override
    public List<CustomerDTO> getAll() {
        return customerList;
    }
}
