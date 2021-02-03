package Casestudy.libs;

import Casestudy.models.Customer;

import java.util.Comparator;

public class CompareNameAndBirthday implements Comparator<String[]> {

//    @Override
//    public int compare(T o1, T o2) {
//        if (o1.getCustomerName().equals(o2.getCustomerName())){
//            return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
//        }else {
//            return o1.getCustomerName().compareTo(o2.getCustomerName());
//        }
//    }

    @Override
    public int compare(String[] o1, String[] o2) {
        if (o1[1].equals(o2[1])) {
            return o1[2].compareTo(o2[2]);
        } else {
            return o1[1].compareTo(o2[1]);
        }
    }
}
