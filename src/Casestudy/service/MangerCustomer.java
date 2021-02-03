package Casestudy.service;

import Casestudy.commoms.FunReadAndWrite;
import Casestudy.libs.CompareNameAndBirthday;
import Casestudy.models.Customer;
import Casestudy.models.Services;
import Casestudy.regExp.Validation;
import com.sun.xml.internal.messaging.saaj.util.FinalArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MangerCustomer {
    Scanner input=new Scanner(System.in);
    Validation validation=new Validation();
     String id;
     String customerName;
     String dateOfBirth;
     String gender;
     String type;
     String phoneNum;
     String email;
     String address;
    public void addNewCustomer(){
        List<Customer> customersList= new ArrayList<>();
        do {
            System.out.println("Enter ID");
             id=input.nextLine();
        }while (!validation.checkIdCustomer(id));
       do {
           System.out.println("Enter Name of Customer");
           customerName=input.nextLine();
       }while (!validation.checkNameofCustomer(customerName));

        do {
            System.out.println("Enter Date of birth");
            dateOfBirth=input.nextLine();
        }while (!validation.checkDate(dateOfBirth));
        String checked="";
        do {
            System.out.println("Enter Gender");
            gender=input.nextLine();
           checked= gender.substring(0,1).toUpperCase()+gender.substring(1,gender.length()).toLowerCase();
        }while (!validation.checkGender(checked));

//        do {
            System.out.println("Enter Type of customer");
            type=input.nextLine();
//        }while (!validation.che(type));

        do {
            System.out.println("Enter Phone Number");
            phoneNum=input.nextLine();
        }while (!validation.checkPhoneNum(phoneNum));

        do {
            System.out.println("Enter Email");
            email=input.nextLine();
        }while (!validation.checkEmail(email));

//        do {
            System.out.println("Enter Address");
            address=input.nextLine();
//        }while (!validation.);

        Customer customer= new Customer(id,customerName,dateOfBirth,checked,type,phoneNum,email,address);
        customersList.add(customer);
        FunReadAndWrite<Customer> funReadAndWrite=new FunReadAndWrite<>();
        funReadAndWrite.writeFile("Customer.csv",customersList,true);
    }
    public void showCustomer(){
        List<String[]> customerList= FunReadAndWrite.readFile("Customer.csv");
        customerList.sort(new CompareNameAndBirthday());
       for (String[] a :customerList){
           Customer customer =new Customer(a);
           System.out.println(customer);
       }
    }

}
