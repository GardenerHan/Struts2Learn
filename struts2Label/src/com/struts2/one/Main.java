package com.struts2.one;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
        int total = 0 ;
        String pername = null ;
        int pertotal = 0 ;
        int n = in.nextInt();
        System.out.println("P");
        String view[] = new String[n];
        String person[];
        for (int i = 0; i < n; i++) {
            try {
                view[i] = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            person = view[i].split(" ");
            int  k = Integer.parseInt(person[1]) ;
            int thisper = 0 ;
            if ( k  > 90 ){
                thisper = thisper + 2000 ;
            }
            if ( k > 85){
                if (Integer.parseInt(person[2]) > 80){
                    thisper = thisper + 4000 ;
                }
                if (person[4].equals("Y")){
                    thisper = thisper + 1000 ;
                }
            }
            if ( k > 80){
                if ( Integer.parseInt(person[5]) >= 1  ){
                    thisper = thisper + 8000 ;
                }
                if (person[3].equals("Y")){
                    thisper = thisper + 850 ;
                }

            }
            if (thisper > pertotal){
                pername = person[0] ;
                pertotal = thisper ;
            }
            total = total + thisper ;
        }
        in.close();
        try {
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(pername);
        System.out.println(pertotal);
        System.out.print(total);
    }
}
