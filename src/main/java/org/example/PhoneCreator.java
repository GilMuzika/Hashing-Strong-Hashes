package org.example;

import java.util.ArrayList;
import java.util.Random;

public class PhoneCreator {
    private Random _rnd = new Random();
    private ArrayList<String> _models = new ArrayList<>();
    private ArrayList<String> _OSs = new ArrayList<>();

     PhoneCreator() {
        _models.add("Samsung");
        _models.add("Apple");
        _models.add("Xiaomi");
        _models.add("Nokia");
        _models.add("One Plus");

        _OSs.add("Android");
        _OSs.add("iOS");
    }

    private String generatePhoneNumber() {
        StringBuilder sb = new StringBuilder();
        int[] digits  = new int[]{0,1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                sb.append(digits[_rnd.nextInt(10)]);
            }
            if(i < 2)
                sb.append('-');
        }
        return sb.toString();
    }

    public MobilePhone generateMobilePhone() {
        String number = generatePhoneNumber();
        String model = _models.get(_rnd.nextInt(_models.size()));
        String os = _OSs.get(_rnd.nextInt(_OSs.size()));
        Float size = _rnd.nextFloat();
        return new MobilePhone(number, model, os, size);
    }

}
