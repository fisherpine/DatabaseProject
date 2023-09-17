/*
 * Created by JFormDesigner on Sun Sep 17 14:12:19 CST 2023
 */

package com.ggbz.plungerView.news;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author sssy
 */
public class CourseMessageFrame extends JFrame {
    public CourseMessageFrame() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        textField3 = new JTextField();
        textField4 = new JTextField();
        panel2 = new JPanel();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setPreferredSize(new Dimension(14, 40));
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(30, 35));
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("\u8bfe\u7a0b\u53f7\uff1a");
            panel1.add(label1);
            label1.setBounds(new Rectangle(new Point(25, 10), label1.getPreferredSize()));
            panel1.add(textField1);
            textField1.setBounds(65, 5, 105, 25);

            //---- label2 ----
            label2.setText("\u8bfe\u540d\uff1a");
            panel1.add(label2);
            label2.setBounds(new Rectangle(new Point(180, 10), label2.getPreferredSize()));
            panel1.add(textField2);
            textField2.setBounds(210, 5, 100, textField2.getPreferredSize().height);

            //---- label3 ----
            label3.setText("\u5b66\u5206\uff1a");
            panel1.add(label3);
            label3.setBounds(new Rectangle(new Point(470, 10), label3.getPreferredSize()));

            //---- label4 ----
            label4.setText("\u6559\u5e08\uff1a");
            panel1.add(label4);
            label4.setBounds(new Rectangle(new Point(325, 10), label4.getPreferredSize()));
            panel1.add(textField3);
            textField3.setBounds(355, 5, 100, textField3.getPreferredSize().height);
            panel1.add(textField4);
            textField4.setBounds(500, 5, 90, textField4.getPreferredSize().height);

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
        contentPane.add(panel1, BorderLayout.NORTH);

        //======== panel2 ========
        {
            panel2.setPreferredSize(new Dimension(0, 35));
            panel2.setLayout(null);

            //---- button2 ----
            button2.setText("\u67e5\u8be2");
            panel2.add(button2);
            button2.setBounds(new Rectangle(new Point(65, 5), button2.getPreferredSize()));

            //---- button3 ----
            button3.setText("\u4fee\u6539");
            panel2.add(button3);
            button3.setBounds(new Rectangle(new Point(195, 5), button3.getPreferredSize()));

            //---- button4 ----
            button4.setText("\u6dfb\u52a0");
            panel2.add(button4);
            button4.setBounds(new Rectangle(new Point(380, 5), button4.getPreferredSize()));

            //---- button5 ----
            button5.setText("\u5220\u9664");
            panel2.add(button5);
            button5.setBounds(new Rectangle(new Point(530, 5), button5.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel2.getComponentCount(); i++) {
                    Rectangle bounds = panel2.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel2.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel2.setMinimumSize(preferredSize);
                panel2.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel2, BorderLayout.SOUTH);

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                },
                new String[] {
                    null, null, null, null
                }
            ));
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel panel2;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
