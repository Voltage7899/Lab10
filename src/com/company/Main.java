package com.company;

import java.io.*;
import java.util.*;


public class Main   {


    public static void main(String[] ars) throws  Exception {
        Main main=new Main();

ArrayList<String> aray =new ArrayList<>();

aray.add("Hello");
aray.add("Guys");
main.getIndex(aray,1);



    }



    void getIndex(ArrayList <String>e,int index) {
        for (int y=0;y<e.size();y++) {
            if(y==index)
            {
                System.out.println(e.get(y));
            }

        }

    }


}





