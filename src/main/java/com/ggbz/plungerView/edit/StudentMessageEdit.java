/*
 * Created by JFormDesigner on Fri Sep 15 11:21:12 CST 2023
 */

package com.ggbz.plungerView.edit;

import com.ggbz.pojo.Student;

import java.awt.*;
import javax.swing.*;

/**
 * @author sssy
 */
public class StudentMessageEdit extends JFrame {
    public StudentMessageEdit() {
        initComponents();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        comboBox1 = new JComboBox<>();
        textField3 = new JTextField();
        button1 = new JButton();
        textField4 = new JTextField();

        //======== this ========
        setPreferredSize(new Dimension(286, 346));
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u5b66\u53f7\uff1a");
        label1.setFont(new Font("\u534e\u6587\u5b8b\u4f53", Font.PLAIN, 16));
        contentPane.add(label1);
        label1.setBounds(45, 40, 50, 30);

        //---- label2 ----
        label2.setText("\u59d3\u540d\uff1a");
        label2.setFont(new Font("\u534e\u6587\u5b8b\u4f53", Font.PLAIN, 16));
        contentPane.add(label2);
        label2.setBounds(45, 75, 50, 30);

        //---- label3 ----
        label3.setText("\u6027\u522b\uff1a");
        label3.setFont(new Font("\u534e\u6587\u5b8b\u4f53", Font.PLAIN, 16));
        contentPane.add(label3);
        label3.setBounds(45, 105, 50, 30);

        //---- label4 ----
        label4.setText("\u5e74\u9f84\uff1a");
        label4.setFont(new Font("\u534e\u6587\u5b8b\u4f53", Font.PLAIN, 16));
        contentPane.add(label4);
        label4.setBounds(45, 135, 50, 30);

        //---- label5 ----
        label5.setText("\u4e13\u4e1a\uff1a");
        label5.setFont(new Font("\u534e\u6587\u5b8b\u4f53", Font.PLAIN, 16));
        contentPane.add(label5);
        label5.setBounds(45, 165, 50, 30);
        contentPane.add(textField1);
        textField1.setBounds(95, 45, 120, textField1.getPreferredSize().height);
        contentPane.add(textField2);
        textField2.setBounds(95, 80, 120, textField2.getPreferredSize().height);

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "\u7537",
            "\u5973"
        }));
        contentPane.add(comboBox1);
        comboBox1.setBounds(95, 110, 120, comboBox1.getPreferredSize().height);
        contentPane.add(textField3);
        textField3.setBounds(95, 140, 120, textField3.getPreferredSize().height);

        //---- button1 ----
        button1.setText("\u63d0\u4ea4");
        button1.setPreferredSize(new Dimension(278, 342));
        contentPane.add(button1);
        button1.setBounds(95, 215, 85, 30);
        contentPane.add(textField4);
        textField4.setBounds(95, 170, 120, textField4.getPreferredSize().height);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox<String> comboBox1;
    private JTextField textField3;
    private JButton button1;
    private JTextField textField4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    public JTextField getTextField1() {
        return textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public JComboBox<String> getComboBox1() {
        return comboBox1;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public JTextField getTextField4() {
        return textField4;
    }
}
