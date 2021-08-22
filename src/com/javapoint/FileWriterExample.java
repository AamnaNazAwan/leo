package com.javapoint;
// Creating a text File using FileWriter
import com.sun.source.tree.WhileLoopTree;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.Scanner;

class CreateFile {
    public static void main(String[] args) throws IOException {
int num1=0; int num2=0;
int i=1; int count =0;

        System.out.println("Press any letter to quit or");
        System.out.println("Enter num"+i+ "=");


        Scanner in= new Scanner(System.in);
        while(in.hasNextInt()){
            num1=in.nextInt();
            count+= num1;
            i++;
            System.out.println("Enter num"+i+"=");


        }

        in.close();


        // attach a file to FileWriter
        FileWriter fw = new FileWriter("out.txt");


        // read character wise from string and write
        // into FileWriter



        fw.write("The numbers are"+i+"=");


        System.out.println("Writing successful");
        //close the file
        fw.close();
    }
}




