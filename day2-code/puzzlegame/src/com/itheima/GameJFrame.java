package com.itheima;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {
    int[][] data =new int[4][4];
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
        int[] tempArr ={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }




        for (int i = 0; i < tempArr.length; i++) {
            data[i/4][i%4] = tempArr[i];
        }

    }


    private void initImage() {
//        ImageIcon icon1 = new ImageIcon("D:\\heimajava\\day2-code\\puzzlegame\\image\\animal\\animal3\\1.jpg");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = data[i][j];
                JLabel jLabel = new JLabel(new ImageIcon("D:\\heimajava\\day2-code\\puzzlegame\\image\\animal\\animal3\\"+num+".jpg"));
                jLabel.setBounds(105*j,105*i,105,105);
                this.getContentPane().add(jLabel);

            }
        }




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
    }

}
