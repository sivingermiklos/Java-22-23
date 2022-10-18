/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmetodusok;

/**
 *
 * @author user3
 */
public class StringMetodusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "Ez egy tetszőleges szöveg!";  
        String szoveg2 = "Ez egy másik tetszőleges szöveg!";  
        //szöveg hossza
        System.out.println(szoveg.length());
        
        //Adott pozíción lévő karakter
        System.out.println(szoveg.charAt(3));
        
        //Kisbetűs lesz az összes karakter
        System.out.println(szoveg.toLowerCase());
        
        //Nagybetűs lesz az összes karakter
        System.out.println(szoveg.toUpperCase());
        
        //Felesleges szóköz levágása
        System.out.println(szoveg.trim());
        
        //Összehasonlítás
        System.out.println(szoveg.compareTo("Ez egy tetszőleges szöveg!"));
        System.out.println(szoveg.compareToIgnoreCase("ez egy tetszőleges szöveg!"));
        System.out.println(szoveg.equals(szoveg2));
        
        //összefűzés
        System.out.println(szoveg.concat(szoveg2));
        
        //Tartalmazza e    
        System.out.println(szoveg.contains("Ez"));
        
        //Végződik-e 
        System.out.println(szoveg.endsWith("!"));
        
        //Kezdődik-e
        System.out.println(szoveg.startsWith("sd"));
        
        //Keresett karakter(ek) pozíciója
        System.out.println(szoveg.indexOf("t"));
        
        //Keresett karakter(ek) első pozíciója
        System.out.println(szoveg.indexOf("t"));
        System.out.println(szoveg.indexOf("egy"));
        
        //Keresett karakter(ek) utolsó pozíciója
        System.out.println(szoveg.lastIndexOf("t"));

        //string üres-e (boolean)
        System.out.println(szoveg.isEmpty());
        String szoveg3 = "";
        System.out.println(szoveg3.isEmpty());

        
        //Lecseréli a szövegben az összes! megadott karakter(ek)et más karakter(ek)re
        System.out.println(szoveg.replace("tetszőleges","akármilyen"));
        System.out.println(szoveg.replace("e","b"));
        
        
        //Lecseréli a szövegben az első! megadott karakter(ek)et más karakter(ek)re
        System.out.println(szoveg.replaceFirst("e","b"));
        
        //String szétszedése tömbbe megadott karakterek mentén
        System.out.println(szoveg.trim().split(" "));
        
        //Nem String típusú adat stringgé alakítása
        Integer szam = 512;
        System.out.println(szam.toString());
        
        //stringből substring kivétele
        System.out.println(szoveg.substring(3));
        System.out.println(szoveg.substring(3,6));
    }
}
