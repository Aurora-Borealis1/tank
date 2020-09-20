package com.gongyuan.tank;


import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author taowangwang
 * @date 2020/9/20 20:47
 */
public class TankFrame extends Frame {
    int x = 200;
    int y = 200;
    public TankFrame() throws HeadlessException {
        //显示大小
        this.setSize(800,600);
        //可见
        this.setVisible(true);
        //设置title
        this.setTitle("tank war");
        this.addKeyListener(new MyKeyListener());
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        //填充矩形
        g.fillRect(x,y,50,50);
        x += 10;
        //y += 10;
    }

    class MyKeyListener extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            //x += 200;
            //repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("keyReleased");
        }
    }
}
