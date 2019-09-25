/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.Scanner;
/**
 *
 * @author Rohitchowdary
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String RR10000 = null;
        String RR100000;
        RR100000 = RR10000;
        // TODO code application logic here
        BankAccount ba=new BankAccount("Rohit",RR100000);
        ba.showMenu();
    }
    
}


class BankAccount{
    int balance;
    int previousTransaction;
    String CustomerName;
    String CustomerId;
    
    BankAccount(String cname,String cid)
{
    CustomerName=cname;
    CustomerId=cid;
}
    
    
    void deposit(int amount){
        if(amount!=0)
        {
            balance=balance+amount;
            previousTransaction=amount;
        }
    }
    
   void  withdraw(int amount){
        if(amount!=0)
        {
          balance=balance-amount;
          previousTransaction=-amount;
        }
    }
    
    void getPreviousTransaction(){
        
        if(previousTransaction > 0){
            System.out.println("Deposited: "+previousTransaction);
        }
        else if(previousTransaction < 0){
             System.out.println("Withdraw: "+Math.abs(previousTransaction));
        }
        else{
             System.out.println("No Transtion is done....");
        }
        
    }
    void showMenu(){
        char option='\0';
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome "+CustomerName);
        System.out.println("Your Id is"+CustomerId);
        System.out.println("\n");
        System.out.println("A Check Balance");
        System.out.println("B Deposit");
        System.out.println("C Withdraw");
        System.out.println("D Get Transaction");
        System.out.println("E Exit");
        do
        {
            System.out.println("Enter an option");
            option=scanner.next().charAt(0);
            System.out.println("\n");
            
            switch(option)
            {
                case 'A':
                  System.out.println("-------------------");
                  System.out.println("Balance "+balance);
                  System.out.println("-------------------");
                  System.out.println("\n");
                  break;
                  
                 case 'B':
                  System.out.println("-------------------");
                  System.out.println("Enter amount to deposit:");
                  System.out.println("-------------------");
                  int amount=scanner.nextInt();
                  deposit(amount);
                  System.out.println("\n");
                  break;
                  
                  case 'C':
                  System.out.println("-------------------");
                  System.out.println("Enter amount to WITHDRAW:");
                  System.out.println("-------------------");
                  int amount2=scanner.nextInt();
                  withdraw(amount2);
                  System.out.println("\n");
                  break;
                  
                  case 'D':
                  System.out.println("-------------------");
                  getPreviousTransaction();
                  System.out.println("-------------------");
                  System.out.println("\n");
                  break;
                  
                  default:
                      System.out.println("---------invalid----------");
                      break;
            }
        }while(option != 'E');
        System.out.println("--------Thank you ----------");
        System.out.println("--------Visit Again ----------");
    }
    
}
