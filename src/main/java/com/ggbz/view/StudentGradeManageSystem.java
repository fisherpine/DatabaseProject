package com.ggbz.view;

import javax.swing.*;

public class StudentGradeManageSystem extends JFrame {
    public void init(){
        JFrame frame = new JFrame("学生成绩管理系统");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JMenuBar menuBar = new JMenuBar();
        JMenu studentMenu = new JMenu("学生信息管理");
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
