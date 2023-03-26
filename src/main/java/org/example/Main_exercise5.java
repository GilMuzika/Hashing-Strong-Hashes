package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main_exercise5 {
    public static void main(String[] args) {

        HashMap<Float, ArrayList<MobilePhone>> phonesByModels = new HashMap<>();
        ArrayList<Float> sizes = new ArrayList<>();

        PhoneCreator creator = new PhoneCreator();
        for(int i = 0; i < 100; i++) {
            MobilePhone mb = creator.generateMobilePhone();
            sizes.add(mb.get_size());
            if(phonesByModels.containsKey(mb.get_size())) {
                phonesByModels.get(mb.get_size()).add(mb);
            } else {
                ArrayList<MobilePhone> list = new ArrayList<>();
                list.add(mb);
                phonesByModels.put(mb.get_size(), list);
            }
        }
        System.out.println(sizes);
        System.out.println();
        System.out.println("Elease enter a phone size");
        Scanner sc = new Scanner(System.in);
        String size  = sc.next();

        Float sizeFloat = -1f;
        try {
            sizeFloat = Float.parseFloat(size);
        } catch(NumberFormatException ex) {

        }

        if(!phonesByModels.containsKey(sizeFloat))
            System.out.println("not exist");
        else {
            ArrayList<MobilePhone> phonesThisSize = phonesByModels.get(sizeFloat);
            for(MobilePhone phone : phonesThisSize) {
                System.out.println(phone);
            }
        }


    }
}
