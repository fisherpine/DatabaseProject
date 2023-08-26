package com.ggbz.view;

import javax.swing.*;
import java.awt.*;

public class StudentMessageManage extends JFrame {
    public void init(){
        JFrame frame = new JFrame("学生信息管理");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        // 获取屏幕尺寸
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // 计算窗口位置
        int centerX = (screenSize.width - frame.getWidth()) / 2;
        int centerY = (screenSize.height - frame.getHeight()) / 2;

        // 设置窗口位置
        frame.setLocation(centerX, centerY);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentMessageManage().init();
    }
}
