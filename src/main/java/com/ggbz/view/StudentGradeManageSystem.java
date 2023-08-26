package com.ggbz.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGradeManageSystem extends JFrame {
    public void init(){
        JFrame frame = new JFrame("学生成绩管理系统");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        // 获取屏幕尺寸
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // 计算窗口位置
        int centerX = (screenSize.width - frame.getWidth()) / 2;
        int centerY = (screenSize.height - frame.getHeight()) / 2;

        // 设置窗口位置
        frame.setLocation(centerX, centerY);
        JMenuBar menuBar = new JMenuBar();

        JMenu studentMenu = new JMenu("学生信息管理");
        JMenuItem studentjMenuItem = new JMenuItem("学生录入");
        studentMenu.add(studentjMenuItem);
        //给学生信息管理绑定点击事件
        studentjMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StudentMessageManage().init();
                frame.setVisible(false);
            }
        });

        JMenu scoreMenu = new JMenu("学生成绩管理");
        JMenu systemMenu = new JMenu("系统管理");

        menuBar.add(studentMenu);
        menuBar.add(scoreMenu);
        menuBar.add(systemMenu);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentGradeManageSystem().init();
    }
}
