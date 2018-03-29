package main;

import Entity.Area;

public class main extends Area{
    public main(int i){
        r=i;
    }

    @Override
    protected void calcArea() {
        super.calcArea();
    }

    public static void main(String[] args) {
        main a ;
        a= new main(3);
        a.calcArea();

    }
}
