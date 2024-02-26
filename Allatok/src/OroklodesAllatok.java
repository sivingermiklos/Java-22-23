public class OroklodesAllatok {
    public static void main(String[] args) {
        Kutya bodri = new Kutya();
        bodri.setNev("Bodri");
        bodri.setSzin("fekete");;
        bodri.setFajta("puli");
        bodri.setKultakaro("szőr");
        bodri.setHazorzo(false);
        bodri.setSuly(10);
        bodri.setElettartam(15);
        System.out.println("Név: " + bodri.getNev() + "\n"
                        + "Szín: " + bodri.getSzin() + "\n"
                        + "Súly: " + bodri.getSuly() + " kg \n"
                        + "Fajta: " + bodri.getFajta() + "\n"
                        + "Kültakaró: " + bodri.getKultakaro() + "\n"
                        + "Házörző? " + ((bodri.isHazorzo())? "igen" : "nem") + "\n"
                        + "Élettartam: " + bodri.getElettartam() + " év");

        System.out.println("-----------");

        Cica cirmi = new Cica();
        cirmi.setFajta("Maine Coon");
        cirmi.setNev("Cirmi");
        cirmi.setSzin("fekete");
        cirmi.setKultakaro("szőr");
        cirmi.setElettartam(12);
        System.out.println("Név: " + cirmi.getNev() + "\n"
                        + "Szín: " + cirmi.getSzin() + "\n"
                        + "Fajta: " + cirmi.getFajta() + "\n"
                        + "Élettartam: " + cirmi.getElettartam() + " év");

        System.out.println("-----------");

        Madar sas = new Madar();
        sas.setFajta("Maine Coon");
        sas.setNev("Sasmadár");
        sas.setSzin("barna");
        sas.setKultakaro("toll");
        sas.setSzarnyfesztavolsag(210);
        sas.setElettartam(12);
        System.out.println("Név: " + sas.getNev() + "\n"
                + "Szín: " + sas.getSzin() + "\n"
                + "Fajta: " + sas.getFajta() + "\n"
                + "Szárnyfesztávolság: " + sas.getSzarnyfesztavolsag() + " cm\n"
                + "Élettartam: " + sas.getElettartam() + " év");

    }
}