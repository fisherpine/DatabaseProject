/*
 * Created by JFormDesigner on Thu Sep 14 16:14:40 CST 2023
 */

package com.ggbz.plungerView;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;

import com.jgoodies.forms.factories.*;

/**
 * @author sssy
 */
public class StudentMessageEditFrame extends JFrame {
    public StudentMessageEditFrame() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        comboBox1 = new JComboBox<>();
        textField3 = new JTextField();
        textField4 = new JTextField();
        button5 = new JButton();
        panel2 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setMinimumSize(new Dimension(14, 4));
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setBorder(Borders.DLU14);
            panel1.setMinimumSize(new Dimension(37, 33));
            panel1.setPreferredSize(new Dimension(25, 32));
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("\u5b66\u53f7\uff1a");
            panel1.add(label1);
            label1.setBounds(new Rectangle(new Point(20, 10), label1.getPreferredSize()));

            //---- label2 ----
            label2.setText("\u59d3\u540d\uff1a");
            panel1.add(label2);
            label2.setBounds(125, 10, 36, 17);

            //---- label3 ----
            label3.setText("\u6027\u522b\uff1a");
            panel1.add(label3);
            label3.setBounds(220, 10, 36, 17);

            //---- label4 ----
            label4.setText("\u5e74\u9f84\uff1a");
            panel1.add(label4);
            label4.setBounds(310, 10, 36, 17);

            //---- label5 ----
            label5.setText("\u4e13\u4e1a\uff1a");
            panel1.add(label5);
            label5.setBounds(400, 10, 45, 17);
            panel1.add(textField1);
            textField1.setBounds(50, 5, 65, textField1.getPreferredSize().height);
            panel1.add(textField2);
            textField2.setBounds(155, 5, 60, textField2.getPreferredSize().height);

            //---- comboBox1 ----
            comboBox1.setAction(null);
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u7537",
                "\u5973"
            }));
            panel1.add(comboBox1);
            comboBox1.setBounds(250, 5, 50, comboBox1.getPreferredSize().height);
            panel1.add(textField3);
            textField3.setBounds(new Rectangle(new Point(340, 5), textField3.getPreferredSize()));
            panel1.add(textField4);
            textField4.setBounds(430, 5, 100, textField4.getPreferredSize().height);

            //---- button5 ----
            button5.setText("\u67e5\u8be2");
            panel1.add(button5);
            button5.setBounds(new Rectangle(new Point(555, 5), button5.getPreferredSize()));

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
            panel2.setPreferredSize(new Dimension(8, 40));
            panel2.setLayout(null);

            //---- button1 ----
            button1.setText("\u4fee\u6539");
            panel2.add(button1);
            button1.setBounds(new Rectangle(new Point(120, 5), button1.getPreferredSize()));

            //---- button2 ----
            button2.setText("\u6dfb\u52a0");
            panel2.add(button2);
            button2.setBounds(new Rectangle(new Point(220, 5), button2.getPreferredSize()));

            //---- button3 ----
            button3.setText("\u5220\u9664");
            panel2.add(button3);
            button3.setBounds(new Rectangle(new Point(340, 5), button3.getPreferredSize()));

            //---- button4 ----
            button4.setText("\u63d2\u5165");
            panel2.add(button4);
            button4.setBounds(new Rectangle(new Point(440, 5), button4.getPreferredSize()));

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
            table1.setAutoCreateRowSorter(true);
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {"", null, null, null, null},
                    {null, null, "", null, null},
                    {null, null, null, null, null},
                    {null, null, "", "", null},
                    {null, null, "", "", ""},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                },
                new String[] {
                    null, null, null, null, null
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
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox<String> comboBox1;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button5;
    private JPanel panel2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
