package summary._02_14;

/**
 * Имеется класс Customer c полями: public class Customer { private String name; private String email; private String country; private int bonusAmount; private boolean isEmailConfirmed; }
 * На основе списка экземпляров данного класса List customers
 * a. Получить Map email / страна
 * b. Получить Map email / покупатель
 * c. Получить Map isEmailConfirmed / количество подтвержденных и неподтвержденных email
 * d. Получить Map> страна / список покупателей из данной страны
 * e. Получить Map страна / суммарный накопленный бонус покупателей из данной страны
 */

import java.util.*;

public class MainCustomer {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Ivan", "ivan@gmail.com","UK",25, true );
        Customer customer2 = new Customer("Tom", "tom@gmail.com", "USA",23, true);
        Customer customer3 = new Customer("Samanta", "samanta@gmail.com" , "UK", 40, true);
        Customer customer4 = new Customer("Sam", "sam@gmail.com" , "KA", 38, true);
        Customer customer5 = new Customer("Jack", "jack@gmail.com" , "KA", 40, true);

        List<Customer> list = List.of(customer1, customer2, customer3,customer4,customer5);


        //System.out.println(getCountryCustomerMap(list));
        System.out.println(getCountryCustomerNamesMap(list));
        System.out.println(getCustomersBonus(list));
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
    public static Map<String,List<Customer>> getCountryCustomerMap(List<Customer> customers){
        Map<String, List<Customer>> result = new HashMap<>();
        for (Customer customer : customers){
            if (result.containsKey(customer.getCountry())){
               List<Customer> contryCustomerList = result.get(customer.getCountry());
                contryCustomerList.add(customer);
            }else {
                List<Customer> newContryCustomerList = new ArrayList<>();
                newContryCustomerList.add(customer);
                result.put(customer.getCountry(), newContryCustomerList);
            }
        }


        return  result;
    }
    public static Map<String,List<String>> getCountryCustomerNamesMap(List<Customer> customers){
        Map<String, List<String>> result = new HashMap<>();
        for (Customer customer : customers){
            if (result.containsKey(customer.getCountry())){
                List<String> contryCustomerList = result.get(customer.getCountry());
                contryCustomerList.add(customer.getName());
            }else {
                List<String> newContryCustomerList = new ArrayList<>();
                newContryCustomerList.add(customer.getName());
                result.put(customer.getCountry(), newContryCustomerList);
            }
        }


        return  result;
    }

    public static Map<String, Integer> getCustomersBonus(List<Customer> customers){
        Map<String, Integer> result = new HashMap<>();

        for (Customer customer : customers){
            if (result.containsKey(customer.getCountry())){
               result.put(customer.getCountry(), result.get(customer.getCountry()) + customer.getBonusAmount());
            }else {
                result.put(customer.getCountry(), customer.getBonusAmount());
            }
        }
        return result;
    }
    public static Map<String, Integer> getCountrySumBonusMap(List<Customer> customers){
        Map<String, List<Customer>> countryCustomersMap = getCountryCustomerMap(customers);
        Map<String, Integer> result = new HashMap<>();
        Set<Map.Entry<String, List<Customer>>> set = countryCustomersMap.entrySet();
        for (Map.Entry<String, List<Customer>> entry : set){
            Integer sum = 0;
            for (Customer customer : entry.getValue()){
                sum += customer.getBonusAmount();
            }
            result.put(entry.getKey(), sum);
        }return result;
    }
}

