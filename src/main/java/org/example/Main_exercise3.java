package org.example;


import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main_exercise3 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println("Hello world!");

        MobilePhone mf1 = new MobilePhone("124-446-785", "Samsung", "Android",  41.46f);
        MobilePhone mf2 = new MobilePhone("124-446-785", "Apple", "iOS",  12f);
        MobilePhone mf3 = new MobilePhone("125-785-458", "Xiaomi", "Android Xi",  18f);
        MobilePhone mf4 = new MobilePhone("123-897-125", "Nokia", "Nokia Android",  22f);
        MobilePhone mf5 = new MobilePhone("325-741-852", "One Plus", "Some Android",  20f);

        HashMap<String, MobilePhone> phonesMap = new HashMap<>();
        phonesMap.put(mf1.get_phoneNumber(), mf1);
        phonesMap.put(mf2.get_phoneNumber(), mf2);
        phonesMap.put(mf3.get_phoneNumber(), mf3);
        phonesMap.put(mf4.get_phoneNumber(), mf4);
        phonesMap.put(mf5.get_phoneNumber(), mf5);

        System.out.println("Please enter a telephone number:");
        Scanner sc = new Scanner(System.in);
        String numberFromUser  = sc.next();

        MobilePhone mb  = phonesMap.get(numberFromUser);
        if(mb != null)
            System.out.println(mb);
        else System.out.println("Not eXIST");

        System.out.println("--------------------------------------------------------");




    }
}