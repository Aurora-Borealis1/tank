package com.gongyuan.tank;

/**
 * @author taowangwang
 * @date 2020/9/20 20:39
 */
public class T {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tankFrame = new TankFrame();

        while (true){
            Thread.sleep(50);
            tankFrame.repaint();
        }
    }

}
