/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lkkt;

import java.util.Scanner;

/**
 *
 * @author veejuu
 */
public class LKKT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Kérjünk be 2 pozitív egész számot!
        Scanner szamBekeres = new Scanner(System.in);
        
        System.out.print("Elso szam: ");
        int a = szamBekeres.nextInt();
        System.out.print("Masodik szam: ");
        int b = szamBekeres.nextInt();
        
        // Számoljuk ki a legkisebb közös többszörösét
        int szorzat = a * b;
        System.out.println("a es b szorzata: "+szorzat);
        int maradek = a % b;
        System.out.println("a es b maradeka: "+maradek);    
        
        while(maradek != 0){
            a = b;
            b = maradek;
            maradek = a % b;
        }
        System.out.println("A legkisebb kozos tobbszoros: " + szorzat/b);
    }
    
}
