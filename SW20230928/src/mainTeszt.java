public class mainTeszt{
    public static void main(String[] args){
        Pont p1 = new Pont(2,3);
        System.out.println(p1);
        System.out.println("A p1 pont: " + p1.getKoordinatak());
        //System.out.println("P1 x koord: " + p1.getX());

        double osszeg = 0;
        final int n = 20;

        int x0 = (int)(Math.random()*100);
        int y0 = (int)(Math.random()*100);

        Pont max = new Pont(x0, y0);
        System.out.println(max);
        osszeg += max.getTavolsag();

        for(int i = 1; i < n; i++){
            int x = (int)(Math.random()*100);
            int y = (int)(Math.random()*100);
            Pont p = new Pont(x, y);
            System.out.println(p);
            osszeg += p.getTavolsag();
            if(max.getTavolsag()<p.getTavolsag()){
                max = p;
            }
        }
        System.out.println("\nA pontok átlagos távolsága az origótól: " + osszeg);
        System.out.println("\nA legmesszebb lévő pont adatai: \n" + max);
    }
}
