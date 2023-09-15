/*
 * Created by JFormDesigner on Sat Sep 09 10:50:58 CST 2023
 */

package com.ggbz.plungerView;

import java.awt.*;
import javax.swing.*;

/**
 * @author sssy
 */
public class LoginFrame extends JFrame {
    public LoginFrame() {
        //构造方法
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        button2 = new JButton();
        textField1 = new JTextField();
        passwordField1 = new JPasswordField();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        button3 = new JButton();
        comboBox1 = new JComboBox<>();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button2 ----
            button2.setText("\u767b\u5f55");
            panel1.add(button2);
            button2.setBounds(110, 195, 80, 30);
            panel1.add(textField1);
            textField1.setBounds(120, 80, 180, textField1.getPreferredSize().height);
            panel1.add(passwordField1);
            passwordField1.setBounds(120, 125, 180, passwordField1.getPreferredSize().height);

            //---- label1 ----
            label1.setText("\u8d26\u53f7");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 6f));
            panel1.add(label1);
            label1.setBounds(new Rectangle(new Point(75, 80), label1.getPreferredSize()));

            //---- label2 ----
            label2.setText(" \u5bc6\u7801");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() | Font.BOLD, label2.getFont().getSize() + 6f));
            panel1.add(label2);
            label2.setBounds(70, 120, 50, 35);

            //---- label3 ----
            label3.setText("\u5b66\u751f\u4fe1\u606f\u7ba1\u7406\u7cfb\u7edf");
            label3.setFont(new Font("\u534e\u6587\u6977\u4f53", Font.PLAIN, 26));
            panel1.add(label3);
            label3.setBounds(new Rectangle(new Point(100, 25), label3.getPreferredSize()));

            //---- button3 ----
            button3.setText("\u6ce8\u518c");
            panel1.add(button3);
            button3.setBounds(200, 195, 80, 30);

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u5b66\u751f",
                "\u8001\u5e08"
            }));
            panel1.add(comboBox1);
            comboBox1.setBounds(new Rectangle(new Point(160, 160), comboBox1.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private JButton button2;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JButton button3;
    private JComboBox<String> comboBox1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
