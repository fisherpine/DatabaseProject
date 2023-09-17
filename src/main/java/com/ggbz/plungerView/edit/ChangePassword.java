/*
 * Created by JFormDesigner on Sun Sep 17 14:33:06 CST 2023
 */

package com.ggbz.plungerView.edit;

import java.awt.*;
import javax.swing.*;

/**
 * @author sssy
 */
public class ChangePassword extends JFrame {
    public ChangePassword() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        button1 = new JButton();

        //======== this ========
        setFont(new Font(Font.DIALOG, Font.BOLD | Font.ITALIC, 12));
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u8f93\u5165\u539f\u59cb\u5bc6\u7801\uff1a");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 12f));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(75, 50), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("\u8f93\u5165\u91cd\u7f6e\u5bc6\u7801\uff1a");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 12f));
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(75, 105), label2.getPreferredSize()));
        contentPane.add(textField1);
        textField1.setBounds(245, 55, 160, textField1.getPreferredSize().height);

        //---- label3 ----
        label3.setText("\u518d\u6b21\u8f93\u5165\u91cd\u7f6e\u5bc6\u7801\uff1a");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getStyle() & ~Font.ITALIC, label3.getFont().getSize() + 12f));
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(25, 155), label3.getPreferredSize()));
        contentPane.add(textField2);
        textField2.setBounds(245, 115, 160, textField2.getPreferredSize().height);
        contentPane.add(textField3);
        textField3.setBounds(245, 160, 160, textField3.getPreferredSize().height);

        //---- button1 ----
        button1.setText("\u786e\u5b9a");
        contentPane.add(button1);
        button1.setBounds(190, 215, 100, button1.getPreferredSize().height);

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
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
