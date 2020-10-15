package com.company;

import java.util.ArrayList;

public class Control {
    private Model m;
    private View v;

    public void setModel(Model m) {

        this.m = m;
    }
    public void setMove () {
        int[] ar;
        ar = v.GetPos();
        m.PlayMove(ar[0],ar[1]);
    }

}
