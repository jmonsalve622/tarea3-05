package org.example.Logic;
import java.util.ArrayList;

public class Deposito <T> {
    private ArrayList list;
    public Deposito() {
        list = new ArrayList();
    }
    public void add(T b) {
        list.add(b);
    }
    public T get() {
        if (list.size() > 0) {
            return (T) list.remove(0);
        }
        else {
            return null;
        }
    }
    public boolean empty() {
        if (list.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}