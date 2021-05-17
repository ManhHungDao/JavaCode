package quan_ly_thue_phong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hotel {
    List<Customer> customerList = new ArrayList<>();
    Customer customer;
    void addCustomers()
    {
        customer = new Customer();
        customer.getInfo();
        customerList.add(customer);
    }
    void getCustomers()
    {
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println("------------\n\tCustomer "+(i+1));
            customerList.get(i).showInfo();
        }
    }
    boolean deleteByPassPort(String find)
    {
        for (int i = 0; i < customerList.size(); i++) {
            if(customerList.get(i).getPassport().equals(find)) {
                customerList.remove(i);
                return true;
            }
        }
        return false;
    }
    void shortByName()
    {
        Collections.sort(customerList, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
    void shortByPrice()
    {
        Collections.sort(customerList, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.customerBill()>o2.customerBill() ? 1:-1;
            }
        });
    }
}