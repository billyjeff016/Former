/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package former;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author darre01
 */
public class Main {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
          ArrayList<Form> formLista = new ArrayList<>();
          int bas, höjd, xPos, yPos, radie;
          boolean fylld=true;
         int val;
         do{
         System.out.println("1. Skriv ut listan");
         System.out.println("2. Rektangel");
         System.out.println("3. Triangel");
         System.out.println("4. Cirkel");
         System.out.println("0. Avsluta");
         System.out.println("Val:");
         val=input.nextInt();
         
         switch(val){
             case 1:
                 for (int i = 0; i < formLista.size(); i++) {
                     
                 
                 System.out.println(formLista.get(i).WhatAmI()+" Area: "+formLista.get(i).getArea());
                 }
                 break;
             case 2:
                 System.out.println("Ange x-koordinat: ");
                 xPos= input.nextInt();
                 System.out.println("Ange y-koordinat: ");
                 yPos = input.nextInt();
                 System.out.println("Ange basen: ");
                 bas = input.nextInt();
                 System.out.println("Ange höjden: ");
                 höjd = input.nextInt();
                 double RekArea = bas*höjd;
                    Rektangel rek = new Rektangel(xPos, yPos, bas, höjd);
                    formLista.add(rek);
                 break;
             case 3:
                    System.out.println("Ange x-koordinat: ");
                 xPos= input.nextInt();
                 System.out.println("Ange y-koordinat: ");
                 yPos = input.nextInt();
                 System.out.println("Ange basen: ");
                 bas = input.nextInt();
                 System.out.println("Ange höjden: ");
                 höjd = input.nextInt();
                 double TriaArea = (bas*höjd)/2;
                    Triangel tria = new Triangel(xPos, yPos, bas, höjd);
                    formLista.add(tria);
                 break;
                 
             case 4:
                    System.out.println("Ange x-koordinat: ");
                 xPos= input.nextInt();
                 System.out.println("Ange y-koordinat: ");
                 yPos = input.nextInt();
                 System.out.println("Ange radien: ");
                 radie = input.nextInt();
                 double CirkelArea = radie*radie*3.14;
                    Cirkel cir = new Cirkel(xPos, yPos, radie);
                    formLista.add(cir);
                 break;
         }
         }  
           while(val!=0);
     }
   
}
