class Madar extends Allat {
    private String tollSzin;

    public Madar(String faj, int eletkor, String tollSzin){
        super(faj,eletkor);
        this.tollSzin = tollSzin;
    }

    public void repul(){
        System.out.println("A madár repül;");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Tollszín: " + this.tollSzin);
    }

    public String getTollSzin() {
        return tollSzin;
    }

    public void setTollSzin(String tollSzin) {
        this.tollSzin = tollSzin;
    }
}
