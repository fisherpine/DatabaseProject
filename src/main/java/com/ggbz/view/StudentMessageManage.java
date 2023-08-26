package com.ggbz.view;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class StudentMessageManage extends JFrame {
    public void init(){
        JFrame frame = new JFrame("学生信息管理");
        //frame布局
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        // 获取屏幕尺寸
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // 计算窗口位置
        int centerX = (screenSize.width - frame.getWidth()) / 2;
        int centerY = (screenSize.height - frame.getHeight()) / 2;

        // 设置窗口位置
        frame.setLocation(centerX, centerY);



        JPanel OperatejPanel = new JPanel();
        OperatejPanel.setPreferredSize(new Dimension(500,100));

        JPanel MessagejPanel = new JPanel();
        MessagejPanel.setPreferredSize(new Dimension(500,300));

        //创建边框
        Border lineBorder = BorderFactory.createLineBorder(Color.GRAY, 1);
        OperatejPanel.setBorder(lineBorder);
        MessagejPanel.setBorder(lineBorder);

        //给边框加标题
        TitledBorder OperatetitledBorder = BorderFactory.createTitledBorder("操作");
        TitledBorder MessagetitledBorder = BorderFactory.createTitledBorder("学生信息");

        OperatetitledBorder.setTitleJustification(TitledBorder.LEFT);
        OperatetitledBorder.setTitleColor(Color.BLACK);

        MessagetitledBorder.setTitleJustification(TitledBorder.LEFT);
        MessagetitledBorder.setTitleColor(Color.BLACK);

        OperatejPanel.setBorder(OperatetitledBorder);
        MessagejPanel.setBorder(MessagetitledBorder);

        frame.add(MessagejPanel,BorderLayout.CENTER);
        frame.add(OperatejPanel,BorderLayout.SOUTH);


        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentMessageManage().init();
    }
}
