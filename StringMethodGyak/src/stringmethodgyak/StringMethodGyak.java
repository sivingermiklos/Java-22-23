/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringmethodgyak;

/**
 *
 * @author veejuu
 */
public class StringMethodGyak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String szoveg = "A Diák osztály (Vad Alma) példányosítás útján jön létre.";

        String vadalma = szoveg.substring(szoveg.indexOf("(") + 1, szoveg.indexOf(")"));
        
        String nev = vadalma.toUpperCase();
        
        System.out.println(nev);
        System.out.println(nev.trim().length());
        
        //2022i
        String classID = "2022i";
        
        System.out.println(nev.replace(" ", ".").toLowerCase().concat("."+classID+"@bankitatabanya.hu"));
        
    }
}
