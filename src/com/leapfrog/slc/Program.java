/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.slc;
import java.util.Scanner;


/**
 *
 * @author hp
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String name="anwesh",grade="";
       String Symbol="123123123123x";
       
       double cmath=69,optmath=59,sc=49,eng= 59.5,nep=48,percentage=0;
               
              if(cmath<32 || optmath<32 || sc<32 || eng<32 || nep<32  ){
                  System.out.print("you are fail");
                  
                  
              }
              else{
                 percentage=((cmath+optmath+sc+eng+nep)/500)*100;
                 
              }if (percentage >=60 && percentage<80){
                     grade="first";
                 
              }else if (percentage>=45 && percentage <=60){
                             grade="second division";
                     
                      } else if (percentage>=32 && percentage <45){
                              grade="third division";}
                             
                      else{
                          grade="fail";}
                      
                     
    
                   
                              
                     
                     
                 
                 
              {if (percentage>80){
                     grade="Distinction";
                     
                 }
                     
                 
                 
                 System.out.println("your percentage is " + percentage + " congratulation");
              
    System.out.println("your grade is "+ grade);
                  
                  
    }
    
}
}
