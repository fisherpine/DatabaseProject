/*
 * Created by JFormDesigner on Thu Sep 14 15:29:15 CST 2023
 */

package com.ggbz.plungerView;

import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;

/**
 * @author sssy
 */
public class RegisterFrame {
    public RegisterFrame() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        注册界面 = new JFrame();
        button1 = new JButton();
        button2 = new JButton();
        label1 = new JLabel();
        label3 = new JLabel();
        label2 = new JLabel();
        label4 = new JLabel();
        textField1 = new JTextField();
        passwordField1 = new JPasswordField();
        passwordField2 = new JPasswordField();

        //======== 注册界面 ========
        {
            注册界面.setTitle("\u6ce8\u518c\u754c\u9762");
            Container 注册界面ContentPane = 注册界面.getContentPane();
            注册界面ContentPane.setLayout(null);

            //---- button1 ----
            button1.setText("\u6ce8\u518c");
            注册界面ContentPane.add(button1);
            button1.setBounds(new Rectangle(new Point(110, 165), button1.getPreferredSize()));

            //---- button2 ----
            button2.setText("\u9000\u51fa");
            注册界面ContentPane.add(button2);
            button2.setBounds(new Rectangle(new Point(205, 165), button2.getPreferredSize()));

            //---- label1 ----
            label1.setText("\u5b66\u53f7\uff1a");
            label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 17));
            注册界面ContentPane.add(label1);
            label1.setBounds(125, 45, 50, label1.getPreferredSize().height);
            注册界面ContentPane.add(label3);
            label3.setBounds(new Rectangle(new Point(125, 90), label3.getPreferredSize()));

            //---- label2 ----
            label2.setText("\u5bc6\u7801\uff1a");
            label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 17));
            注册界面ContentPane.add(label2);
            label2.setBounds(125, 80, 50, 23);

            //---- label4 ----
            label4.setText("\u518d\u6b21\u8f93\u5165\u5bc6\u7801:");
            label4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 17));
            注册界面ContentPane.add(label4);
            label4.setBounds(60, 115, 105, 23);
            注册界面ContentPane.add(textField1);
            textField1.setBounds(175, 45, 115, textField1.getPreferredSize().height);
            注册界面ContentPane.add(passwordField1);
            passwordField1.setBounds(175, 80, 115, 25);
            注册界面ContentPane.add(passwordField2);
            passwordField2.setBounds(175, 115, 115, passwordField2.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < 注册界面ContentPane.getComponentCount(); i++) {
                    Rectangle bounds = 注册界面ContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = 注册界面ContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                注册界面ContentPane.setMinimumSize(preferredSize);
                注册界面ContentPane.setPreferredSize(preferredSize);
            }
            注册界面.pack();
            注册界面.setLocationRelativeTo(注册界面.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JFrame 注册界面;
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    private JLabel label3;
    private JLabel label2;
    private JLabel label4;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
