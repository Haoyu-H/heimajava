package test;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2 extends JFrame implements MouseListener {

    JButton jtb1 = new JButton("Just Button");

    public MyJFrame2() {

        this.setSize(603, 680);


        this.setTitle("拼图单机版 v1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);



        jtb1.setBounds(0, 0, 100, 50);
        this.getContentPane().add(jtb1);
        //给按钮绑定鼠标事件
        jtb1.addMouseListener(this);


        this.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouseEntered");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouseExited");

    }
}
