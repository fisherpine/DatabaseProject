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
        JMenuItem studentMessageAdd = new JMenuItem("学生录入");
        JMenuItem studentMessageSelect = new JMenuItem("学生信息查询");
        studentMenu.add(studentMessageAdd);
        studentMenu.add(studentMessageSelect);
        //给学生信息管理绑定点击事件，跳转到学生录入界面
        studentMessageAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentMessageManage studentMessageManage = new StudentMessageManage(frame);
                studentMessageManage.MessageAdd();
                frame.setVisible(false);
            }
        });

        //给学生信息查询绑定事件，跳转到学生信息查询页面
        studentMessageSelect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentMessageManage studentMessageManage = new StudentMessageManage();
                studentMessageManage.MessageSelect();
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
