import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Eredmeny geza = new Eredmeny("Géza", "LOL", "2", 972);
        Eredmeny gizi = new Eredmeny("Gizi", "WOW", "3", 987);
        Eredmeny gaspar = new Eredmeny("Gáspár", "FCK", "4", 1024);
        Eredmeny gazsi = new Eredmeny("Gazsi", "OMG", "1", 2006);
        Eredmeny gerda = new Eredmeny("Gerda", "THC", "5", 1462);

        ArrayList<Eredmeny> eredmenyek = new ArrayList<>();
        eredmenyek.add(geza);
        eredmenyek.add(gizi);
        eredmenyek.add(gaspar);
        eredmenyek.add(gazsi);
        eredmenyek.add(gerda);

        System.out.println("\n0. feladat-------------------------------------");
        // 0. feladat: Hány jelölt van?
        System.out.println("Jelöltek száma: "+ eredmenyek.size());

        System.out.println("\n1. feladat-------------------------------------");
        // 1. feladat: Összesen hányan szavaztak?
        int szavazatOsszeg = 0;

        for(int i = 0; i < eredmenyek.size(); i++){
            szavazatOsszeg += eredmenyek.get(i).getSzavazatSzam();
        }

        System.out.println("Összes szavazat száma: " + szavazatOsszeg);

        System.out.println("\n2. feladat-------------------------------------");
        // 2. feladat: Hány jelöltre érkezett 1000-nél több szavazat?
        int szavazat1000Count = 0;

        for(int i = 0; i < eredmenyek.size(); i++){
            if(eredmenyek.get(i).getSzavazatSzam() > 1000){
                szavazat1000Count += 1;
            }
        }

        System.out.println("Ennyi jelöltre érkezett 1000-nél több szavazat: " + szavazat1000Count);

        System.out.println("\n3. feladat-------------------------------------");
        // 3. feladat: Ki a WOW párt jelöltje?
        String wowJelolt = "";

        for(int i = 0; i < eredmenyek.size(); i++){
            if(eredmenyek.get(i).getPart().equals("WOW")){
                wowJelolt = eredmenyek.get(i).getNev();
            }
        }

        System.out.println("A WOW párt jelöltje: " + wowJelolt);

        System.out.println("\n4. feladat-------------------------------------");
        // 4. feladat: Kik kaptak átlag alatti szavazatot?
        ArrayList<String> atlagAlatti = new ArrayList<>();
        int szavazatAtlag = szavazatOsszeg / eredmenyek.size();
        System.out.println("Összes szavazat átlaga: " + szavazatAtlag);
        for(int i = 0; i < eredmenyek.size(); i++){
            if(eredmenyek.get(i).getSzavazatSzam() < szavazatAtlag){
                atlagAlatti.add(eredmenyek.get(i).getNev());
            }
        }

        for(int i = 0; i < atlagAlatti.size(); i++){
            System.out.println("Átlag alatti szavazatot elért jelölt: " + atlagAlatti.get(i));
        }

        System.out.println("\n5. feladat-------------------------------------");
        // 5. feladat: Kinek a neve végződik 'a' betűre?
        ArrayList<String> aVegzodesu = new ArrayList<>();

        for(int i = 0; i < eredmenyek.size(); i++){
            if(eredmenyek.get(i).getNev().endsWith("a")){
                aVegzodesu.add(eredmenyek.get(i).getNev());
            }
        }

        for(int i = 0; i < aVegzodesu.size(); i++){
            System.out.println("'a' végződésű jelölt neve: " + aVegzodesu.get(i));
        }
    }
}