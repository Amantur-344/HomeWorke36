package com.company;

import java.rmi.MarshalException;
import java.util.ArrayList;

public class Main {
;
    public static void main(String[] args) {
        ArrayList<Integer> chetNumber = new ArrayList<>();
        ArrayList<Integer> nechetNumber = new ArrayList<>();

        for (int j = 0; j <50; j++) {
            int randomIndex = (int) (1 + Math.random() * 99);

            if(randomIndex % 2 == 0){
                chetNumber.add(j,randomIndex);
            }else{
                nechetNumber.add(j,randomIndex);
            }
        }
        for (int i = 0; i < chetNumber.size(); i++) {
            System.out.println("Четные числа " + chetNumber.get(i));
        }
        for (int i = 0; i < nechetNumber.size(); i++) {
            System.out.println("Не четные числа " + nechetNumber.get(i));
        }
    }
}
