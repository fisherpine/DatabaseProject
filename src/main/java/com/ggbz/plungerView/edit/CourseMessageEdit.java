/*
 * Created by JFormDesigner on Fri Sep 15 11:41:46 CST 2023
 */

package com.ggbz.plungerView.edit;

import java.awt.*;
import javax.swing.*;

/**
 * @author sssy
 */
public class CourseMessageEdit extends JFrame {
    public CourseMessageEdit() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u8bfe\u7a0b\u53f7\uff1a");
        label1.setFont(new Font("\u4eff\u5b8b", Font.PLAIN, 18));
        contentPane.add(label1);
        label1.setBounds(35, 35, label1.getPreferredSize().width, 30);
        contentPane.add(textField1);
        textField1.setBounds(105, 40, 110, textField1.getPreferredSize().height);

        //---- label2 ----
        label2.setText("\u8bfe\u540d\uff1a");
        label2.setFont(new Font("\u4eff\u5b8b", Font.PLAIN, 18));
        contentPane.add(label2);
        label2.setBounds(45, 70, 55, 30);

        //---- label3 ----
        label3.setText("\u8001\u5e08\uff1a");
        label3.setFont(new Font("\u4eff\u5b8b", Font.PLAIN, 18));
        contentPane.add(label3);
        label3.setBounds(45, 105, 55, 30);

        //---- label4 ----
        label4.setText("\u5b66\u5206\uff1a");
        label4.setFont(new Font("\u4eff\u5b8b", Font.PLAIN, 18));
        contentPane.add(label4);
        label4.setBounds(45, 140, 60, 30);
        contentPane.add(textField2);
        textField2.setBounds(105, 75, 110, textField2.getPreferredSize().height);
        contentPane.add(textField3);
        textField3.setBounds(105, 110, 110, 24);
        contentPane.add(textField4);
        textField4.setBounds(105, 145, 110, 24);

        //---- button1 ----
        button1.setText("\u786e\u5b9a");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(85, 195), button1.getPreferredSize()));

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
    private JTextField textField1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
