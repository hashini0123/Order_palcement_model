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
        for(int i=0; i< customerList.size(); i++){
            if(customerList.get(i).getId().equals(customer.getId())){
                customerList.set(i,customer);
                break;
            }
        }
    }

    @Override
    public void deleteCustomer(Integer id) {
        for (CustomerDTO customer : customerList){
            if(customer.getId().equals(id)){
                customerList.remove(customer);
                break;
            }
        }
    }

    @Override
    public CustomerDTO searchById(Integer id) {
        for(CustomerDTO customer : customerList){
            if(customer.getId().equals(id)){
                return customer;
            }
        }
        return null;
    }

    @Override
    public List<CustomerDTO> getAll() {
        return customerList;
    }
}
