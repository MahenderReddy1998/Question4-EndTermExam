package main;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;
public class ToughQuestions1 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int acc_no;
       int bal;
       int choice;
       int credit;
       int debit;
       String acc_name;
       String type;
       System.out.println("Enter the account number");
       acc_no = Integer.parseInt(br.readLine());
       System.out.println("Enter the account holder name");
       acc_name = br.readLine();
       System.out.println("Enter the type of account");
       type = br.readLine();
       System.out.println("Enter the balance");
       bal = Integer.parseInt(br.readLine());
       Account a = new Account(acc_no,acc_name,type,bal);
       do
       {
       System.out.println("1. Credit Account \n2. Debit Account \n3. Display Account Details");
       System.out.println("Enter your choice");
       choice = Integer.parseInt(br.readLine());
       switch(choice)
       {
           case 1: System.out.println("Enter the amount to be credited");
           credit = Integer.parseInt(br.readLine());
           a.credit(credit);
           break;
           case 2: System.out.println("Enter the amount to be debited");
           debit = Integer.parseInt(br.readLine());
           a.debit(debit);
           break;
           case 3:a.display();
           break;
       }
      }while(choice<4);
    }
}



class Account {
    private int acc_no;
    private int bal;
    private String acc_name;
    private String type;
    Account(int acc_no, String acc_name, String type, int bal) {
        this.acc_no = acc_no;
        this.bal = bal;
        this.acc_name = acc_name;
        this.type = type;
    }
    int credit(int credit) {
        return bal = bal + credit;
    }
    void display()
    {
       System.out.println("Account Details");
        System.out.println("Accont Number : "+acc_no);
        System.out.println("Accont Name : "+acc_name);
        System.out.println("Accout type :"+type);
        System.out.println("Accout Balance :"+bal);
        System.out.println();
    }
    int debit(Integer debit) {
         return bal = bal - debit;
    }
}