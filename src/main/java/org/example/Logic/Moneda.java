package org.example.Logic;
import java.util.Random;

abstract public class Moneda implements Comparable<Moneda>{
    private int serie;

    public Moneda() {
        serie = new Random().nextInt(0, 999999999);
    }

    public int getSerie() {
        return serie;
    }

    public abstract int getValor();

    @Override
    public String toString(){
        return ""+this.getValor();
    }

    @Override
    public int compareTo(Moneda o){
        if (this.getValor() > o.getValor()) {
            return 1;
        } else if (this.getValor() < o.getValor()) {
            return -1;
        } else {
            return 0;
        }
    }
}