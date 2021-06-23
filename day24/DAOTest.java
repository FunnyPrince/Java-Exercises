package com.day24;

import com.day07.Customer;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author FunnyPrince_
 * @date 2021/4/27 - 21:42
 */
public class DAOTest {
    @Test
    public void test1(){
        CustomerDAO dao1 = new CustomerDAO();

        dao1.add(new Customer());
        List<Customer> list = dao1.getForList(10);
    }
}
