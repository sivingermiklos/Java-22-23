public class oroklodesAllatok {
    Madar enMadaram = new Madar("galamb", 5, "feher");

    enMadaram.displayInfo();
    enMadaram.eszik();
    enMadaram.repul();
    enMadaram.alszik();

    enMadaram.setEletkor(6);
    System.out.println(enMadaram.getEletkor());
}
