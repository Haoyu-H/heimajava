package com.itheima;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener {
    int[][] data = new int[4][4];
    int x = 0;
    int y = 0;//记录空白的位置

    public GameJFrame() {

        initJFrame();


        initJMenuBar();

        initData();


        //初始化图片
        initImage();


        this.setVisible(true);


    }


    //初始化数据
    private void initData() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }


        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;

            } else {
                data[i / 4][i % 4] = tempArr[i];
            }

        }

    }


    private void initImage() {
//        ImageIcon icon1 = new ImageIcon("D:\\heimajava\\day2-code\\puzzlegame\\image\\animal\\animal3\\1.jpg");
        this.getContentPane().removeAll();


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = data[i][j];
                JLabel jLabel = new JLabel(new ImageIcon("D:\\heimajava\\day2-code\\puzzlegame\\image\\animal\\animal3\\" + num + ".jpg"));
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                jLabel.setBorder(new BevelBorder(1));
                this.getContentPane().add(jLabel);

            }
        }
        //背景图片
        ImageIcon bg = new ImageIcon("D:\\heimajava\\day2-code\\puzzlegame\\image\\background.png");
        JLabel background = new JLabel(bg);
        background.setBounds(40, 40, bg.getIconWidth(), bg.getIconHeight());
        this.getContentPane().add(background);

        this.getContentPane().repaint();


    }


    private void initJMenuBar() {
        //初始化菜单
        JMenuBar jMenuBar = new JMenuBar();
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reloginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");


        functionJMenu.add(replayItem);
        functionJMenu.add(reloginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603, 680);


        this.setTitle("拼图单机版 v1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 37){
            System.out.println("向左移动");
            data[x][y] = data[x][y+1];

            data[x][y+1] = 0;

            y++;
            initImage();

        }
        if(code == 38){
            System.out.println("向上移动");
            data[x][y] = data[x+1][y];

            data[x+1][y] = 0;

            x++;
            initImage();
        }


        if(code == 39){
            System.out.println("向右移动");
            data[x][y] = data[x][y-1];

            data[x][y-1] = 0;

            y--;
            initImage();
        }
        if(code == 40){
            System.out.println("向下移动");
            data[x][y] = data[x-1][y];

            data[x-1][y] = 0;

            x--;
            initImage();
        }

    }
}
