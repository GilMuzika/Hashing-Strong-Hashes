package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class main_exercise4 {

    public static void main(String[] args) {
        HashMap<String, ArrayList<MobilePhone>> phonesByModels = new HashMap<>();

        PhoneCreator creator = new PhoneCreator();
        for(int i = 0; i < 100; i++) {
            MobilePhone mb = creator.generateMobilePhone();
            if(phonesByModels.containsKey(mb.get_model())) {
                phonesByModels.get(mb.get_model()).add(mb);
            } else {
                ArrayList<MobilePhone> list = new ArrayList<>();
                list.add(mb);
                phonesByModels.put(mb.get_model(), list);
            }
        }

        System.out.println("Elease enter a phome model");
        Scanner sc = new Scanner(System.in);
        String model  = sc.next();

        if(!phonesByModels.containsKey(model))
            System.out.println("not exist");
        else {
            ArrayList<MobilePhone> phonesThisModel = phonesByModels.get(model);
            for(MobilePhone phone : phonesThisModel) {
                System.out.println(phone);
            }
        }

    }

}
