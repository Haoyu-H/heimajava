package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test3 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(603, 680);


        jFrame.setTitle("拼图单机版 v1.0");
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setLayout(null);


        JButton jtb = new JButton("点击");
        jtb.setBounds(0,0,100,50);
        jtb.addActionListener(new MyActionListener());


        jtb.addActionListener(new MyActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("哒咩~不要点我哟~~");
            }
        });
        jFrame.getContentPane().add(jtb);






        jFrame.setVisible(true);
    }
}
