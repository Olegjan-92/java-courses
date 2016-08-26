package ru.ponomarev.lessons;

import java.io.IOException;

/**
 * Created by oleg on 18.07.16.
 */
public class littogal {
     public static void main(String args[]) {
            double num, sroot, rerr;
            for(num = 1.0; num <= 100.0; num++) {
                sroot = Math.sqrt(num);
                System.out.println("Kоpень квадратный из " +num+" равен " + sroot);
// вычислить ошибку округления
                rerr = num - (sroot * sroot);
                System.out.println("Ошибка округления: "+rerr);
                System.out.println();

        }
        

    }
}
