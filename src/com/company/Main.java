package com.company;

public class Main {

    public static void main(String[] args) {

        Control c = new Control();
        View v = new View();
        Model m = new Model();

        m.SetView(v);
        c.setModel(m);
        c.setMove();
    }
}
