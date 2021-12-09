package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Character[] a = new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        List<Character> list;
        list = Arrays.asList(a);
        int number_count = scanner.nextInt();
        int[] mas = new int[number_count];
        int[] res = new int[number_count];


        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }

        int i = 0;
        int count = 0;
        while (i < mas.length) {
            if (mas[i] % 2 == 0) {
                count = evenTwoDiv(mas[i+1] - mas[i]);
                res[i] = count;
            } else if ((mas[i] % 2 != 0)) {
                if (mas[i] == 1){
                    count = 1;
                    res[i] = count;
                }else{
                    count = noEvenTwoDiv(mas[i] - mas[i-1]);
                    res[i] = count;
                }
            }
            i++;
        }

        for (int j = 0; j < list.size(); j++) {
            for (int k = 0; res.length > k; k++) {
                if (res[k] == j){
                    System.out.print(list.get(j));
                }
            }
        }
    }

    public static int evenTwoDiv(int element){
        int i = 1;

        while(element != 2 && element != 1){
            element = element / 2;
            i++;
        }

        if (i==0) {
            i++;
        }
        return i;
    }

    public static int noEvenTwoDiv(int element){
        int i = 1;

        while(element != 2 && element != 1){
            element = element / 2;
            i++;
        }

        if (i==0) {
            i++;
        }
        return i;
    }
}
