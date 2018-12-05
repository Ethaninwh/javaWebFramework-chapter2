package org.smart4j.chapter2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;

import java.sql.*;
import java.util.List;
import java.util.Map;

public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    public List<Customer> getCustomerList(String keyword){
        String sql = "select * from customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    public Customer getCustomer(long id){
        // TODO: 2018/11/29
        return null;
    }

    public boolean createCustomer(Map<String, Object> fieldMap){
        // TODO: 2018/11/29
        return false;
    }

    public boolean updateCustomer(long id, Map<String, Object> fieldMap){
        // TODO: 2018/11/29
        return false;
    }

    public boolean deleteCustomer(long id){
        // TODO: 2018/11/29
        return false;
    }
}
