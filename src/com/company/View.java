package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class View {
    private JButton[][] buttons;
    private JFrame frame;
    private int a,b;
    public ArrayList<Integer> pos;
    public View() {
        this.frame = new JFrame();
        this.buttons = new JButton[3][3];
        Draw();
    }
    public int[] GetPos()
    {
        int[] arr = new int[2];
        arr[0]=a;
        arr[1]=b;
        return arr;
    }
    public void Draw() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);
        frame.setResizable(true);

        ExampleAction ex1 = new ExampleAction();
        JPanel gamePanel = new JPanel(new FlowLayout());
        JPanel game = new JPanel(new GridLayout(3, 3));
        gamePanel.add(game, BorderLayout.CENTER);
        frame.add(gamePanel, BorderLayout.NORTH);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].addActionListener(ex1);
                game.add(buttons[i][j]);
            }
        }
        frame.setVisible(true);
    }
    public class ExampleAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    if (e.getSource() == buttons[i][j]) {
                        buttons[i][j].setEnabled(false);
                        a=i;
                        b=j;
                    }
            e.getActionCommand();
        }
    }

}
