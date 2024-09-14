/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms.controller;

import cms.dto.CustomerDto;
import cms.model.CustomerModel;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class CustomerController {

    private CustomerModel customerModel ;

    public CustomerController() {
        customerModel = new CustomerModel();
    }

    public String saveCustomer(CustomerDto customerDto) throws Exception {
        return customerModel.saveCustomer(customerDto);
    }

}
