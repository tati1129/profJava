package summary._02_14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainCustomer {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Ivan", "ivan@gmail.com","UK",25, true );
        Customer customer2 = new Customer("Tom", "tom@gmail.com", "USA",23, true);
        Customer customer3 = new Customer("Samanta", "samanta@gmail.com" , "UK", 40, true);

        List<Customer> list = List.of(customer1, customer2, customer3);
    }

    public static Map<String, String> getEmailCountryMap(List<Customer> list){
        Map<String, String> result = new HashMap<>();
        for (Customer customer : list){
            result.put(customer.getEmail(), customer.getCountry());
        }
        return result;
    }
    public static Map<String, String>  getEmailNameMap(List<Customer> list){
        Map<String, String> result = new HashMap<>();
        for (Customer customer : list){
            result.put(customer.getEmail(), customer.getName());
        }
        return result;
    }
    public static Map<Boolean, Integer>  getConfirmedCountMap(List<Customer> list){
        Map<Boolean, Integer> result = new HashMap<>();
        result.put(true, 0);
        result.put(false, 0);
        for (Customer customer : list){
            if (customer.isEmailConfirmed()){
                result.put(true, result.get(true) + 1);
            }else {
                result.put(false, result.get(false) + 1);
            }
        }
        return result;
    }
}
