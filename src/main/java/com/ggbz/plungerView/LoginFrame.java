/*
 * Created by JFormDesigner on Sat Sep 09 10:50:58 CST 2023
 */

package com.ggbz.plungerView;

import com.ggbz.pojo.User;
import com.ggbz.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author sssy
 */
public class LoginFrame extends JFrame {
    @Autowired
    private UserSerivce userSerivce;

    @Autowired
    private MainFrame mainFrame;
    public LoginFrame() {
        //构造方法
        initComponents();
    }

    private void Login(ActionEvent e) {
        //得到界面中的数据
        String hm = textField1.getText();
        String password = passwordField1.getText();
        String role = (String)comboBox1.getSelectedItem();
        int i = 0;
        if(role.equals("学生")){
            i = 0;
        }else{
            i = 1;
        }
        //登录操作
        User user = new User();
        user.setHm(hm);
        user.setPwd(password);
        user.setRole(i);
        //登录需要验证账号密码身份
        Boolean login = userSerivce.login(user);
        if (login == true){
            if(i==1){
                //进入管理员界面
                mainFrame.setVisible(true);
            }else {
                //TODO 进入学生界面
            }
        }else{
            JOptionPane.showMessageDialog(null, "检查账号密码以及身份", "提示信息", JOptionPane.PLAIN_MESSAGE);
        }
    }

    private void button2(ActionEvent e) {
    }

    private void button3(ActionEvent e) {
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        LoginButton = new JButton();
        textField1 = new JTextField();
        passwordField1 = new JPasswordField();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        RegisterBotton = new JButton();
        comboBox1 = new JComboBox<>();

        //======== this ========
        setPreferredSize(new Dimension(414, 313));
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- LoginButton ----
            LoginButton.setText("\u767b\u5f55");
            LoginButton.addActionListener(e -> {
			button2(e);
			Login(e);
		});
            panel1.add(LoginButton);
            LoginButton.setBounds(110, 195, 80, 30);
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

            //---- RegisterBotton ----
            RegisterBotton.setText("\u6ce8\u518c");
            RegisterBotton.addActionListener(e -> {
			button3(e);
			button3(e);
		});
            panel1.add(RegisterBotton);
            RegisterBotton.setBounds(200, 195, 80, 30);

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
    private JButton LoginButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JButton RegisterBotton;
    private JComboBox<String> comboBox1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
