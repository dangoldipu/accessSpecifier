package Entity;

public class Area {
    protected int r;
    static double pi = 3.14;

    protected void calcArea(){
        System.out.println("Area:"+pi*r*r);
    }

    public static void main(String[] args) {
        Area a ;
        a= new Area();
        a.r=5;
        a.calcArea();

    }
}
