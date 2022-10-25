/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doga1025;

/**
 *
 * @author veejuu
 */
public class Doga1025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String mondat = "Sok lúd disznót győz.";
        String masikszoveg = "";

        //1.
        System.out.println(mondat.length());
        
        //2.
        System.out.println(mondat.charAt(0));
        
        //3.
        System.out.println(mondat.equals(masikszoveg));
        
        //4.
        System.out.println(mondat.contains("lúd"));
        
        //5.
        System.out.println(mondat.indexOf("lúd"));
        
        //6.
        System.out.println(mondat.replace("lúd","veréb"));
        
        //7.
        System.out.println(mondat.substring(mondat.indexOf(" "),mondat.lastIndexOf(".")));
    }
    
}
