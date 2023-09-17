/*
 * Created by JFormDesigner on Fri Sep 15 11:46:27 CST 2023
 */

package com.ggbz.plungerView.edit;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author sssy
 */
public class ChooseCourseEdit extends JFrame {
    public ChooseCourseEdit() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        button1 = new JButton();
        label3 = new JLabel();
        textField2 = new JTextField();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(0, 35));
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("\u5b66\u53f7\uff1a");
            panel1.add(label1);
            label1.setBounds(new Rectangle(new Point(10, 10), label1.getPreferredSize()));
            panel1.add(textField1);
            textField1.setBounds(40, 5, 135, textField1.getPreferredSize().height);
            panel1.add(label2);
            label2.setBounds(new Rectangle(new Point(200, 10), label2.getPreferredSize()));

            //---- button1 ----
            button1.setText("\u63d0\u4ea4");
            panel1.add(button1);
            button1.setBounds(new Rectangle(new Point(190, 5), button1.getPreferredSize()));

            //---- label3 ----
            label3.setText("\u5df2\u4fee\u5b66\u5206\uff1a");
            panel1.add(label3);
            label3.setBounds(new Rectangle(new Point(290, 10), label3.getPreferredSize()));
            panel1.add(textField2);
            textField2.setBounds(350, 5, textField2.getPreferredSize().width, 25);

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

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setInheritsPopupMenu(true);
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                },
                new String[] {
                    null, null, null
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
    private JButton button1;
    private JLabel label3;
    private JTextField textField2;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
