public class valtozoHatokor {
    // Globális változó az osztályon belül:
    static int globalisValtozo = 10;

    public static void main(String[] args) {
        // lokális változó a main metódusban
        int mainValtozo = 5;

        System.out.println("A mainValtozo értéke a main metódusban: " + mainValtozo);
        System.out.println("A globalisValtozo értéke a main metódusban: " + globalisValtozo);

        metodus1();

    }//MAIN VÉGE

    public static void metodus1(){
        // lokális változó metodus1-ben
        int metodus1Valtozo = 20;

        System.out.println("A metodus1 változó értéke metodus1-ben: " + metodus1Valtozo);
        System.out.println("A globalisValtozo értéke a metodus1-ben: " + globalisValtozo);
        metodus2();
    }

    public static void metodus2(){
        // lokális változó metodus2-ben
        int metodus2Valtozo = 25;

        System.out.println("A metodus2 változó értéke metodus2-ben: " + metodus2Valtozo);
        System.out.println("A globalisValtozo értéke a metodus2-ben: " + globalisValtozo);
    }
}// prog vége