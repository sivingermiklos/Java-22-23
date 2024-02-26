public class Pont{
    private int x, y;

    public Pont(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public Pont(){
        this(0, 0);
    }

    public double getTavolsag(){
        return Math.sqrt(this.getX()*this.getX()+this.getY()*this.getY());
    }

    public String getKoordinatak(){
        return "("+this.getX()+","+this.getY()+")";
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public String toString(){
        return "X: " + this.getX() + "\nY: " + this.getY() + "\nOrigótól mért távolsága: " + this.getTavolsag();
    }
}
