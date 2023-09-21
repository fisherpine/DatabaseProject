/*
 * Created by JFormDesigner on Fri Sep 15 11:31:59 CST 2023
 */

package com.ggbz.plungerView.common;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author sssy
 */
public class LoginAlertFrame extends JDialog {
    public LoginAlertFrame(Window owner) {
        super(owner);
        initComponents();
    }

    private void button1(ActionEvent e) {
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        button1 = new JButton();
        label1 = new JLabel();

        //======== this ========
        setTitle("\u63d0\u793a");
        setPreferredSize(new Dimension(418, 227));
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("\u786e\u5b9a");
        button1.setFont(new Font("\u4eff\u5b8b", Font.PLAIN, 20));
        button1.setPreferredSize(new Dimension(100, 24));
        button1.addActionListener(e -> button1(e));
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(145, 100), button1.getPreferredSize()));

        //---- label1 ----
        label1.setText("\u8bf7\u68c0\u67e5\u7528\u6237\u540d\u3001\u5bc6\u7801\u4ee5\u53ca\u8eab\u4efd");
        label1.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 22));
        contentPane.add(label1);
        label1.setBounds(60, 35, label1.getPreferredSize().width, 40);

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
    private JButton button1;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on



}
