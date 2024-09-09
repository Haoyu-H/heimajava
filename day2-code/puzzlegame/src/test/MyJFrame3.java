package test;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {
    public MyJFrame3() {
        this.setSize(603, 680);


        this.setTitle("拼图单机版 v1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
        this.addKeyListener(this);
        this.setVisible(true);




    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("不松");


    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松");
        int code = e.getKeyCode();
        System.out.println(code);

    }
}
