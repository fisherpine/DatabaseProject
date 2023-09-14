/*
 * Created by JFormDesigner on Thu Sep 14 15:42:23 CST 2023
 */

package com.ggbz.plungerView;

import java.awt.*;
import javax.swing.*;

/**
 * @author sssy
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        menuItem2 = new JMenuItem();
        menuItem3 = new JMenuItem();
        menu2 = new JMenu();
        menuItem7 = new JMenuItem();
        menuItem8 = new JMenuItem();
        menuItem9 = new JMenuItem();
        menuItem10 = new JMenuItem();
        menuItem11 = new JMenuItem();
        menu3 = new JMenu();
        menuItem4 = new JMenuItem();
        menuItem5 = new JMenuItem();
        menuItem6 = new JMenuItem();
        menu4 = new JMenu();
        menuItem12 = new JMenuItem();
        menuItem13 = new JMenuItem();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("\u7f16\u8f91\u6570\u636e");

                //---- menuItem1 ----
                menuItem1.setText("\u5b66\u751f\u4fe1\u606f\u7f16\u8f91");
                menu1.add(menuItem1);

                //---- menuItem2 ----
                menuItem2.setText("\u8bfe\u7a0b\u4fe1\u606f\u7f16\u8f91");
                menu1.add(menuItem2);

                //---- menuItem3 ----
                menuItem3.setText("\u9009\u8bfe\u4fe1\u606f\u7f16\u8f91");
                menu1.add(menuItem3);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("\u67e5\u8be2\u6570\u636e");

                //---- menuItem7 ----
                menuItem7.setText("\u6309\u8bfe\u53f7\u67e5\u8bfe\u7a0b\u4fe1\u606f");
                menu2.add(menuItem7);

                //---- menuItem8 ----
                menuItem8.setText("\u6309\u73ed\u7ea7\u53f7\u67e5\u5b66\u751f\u60c5\u51b5");
                menu2.add(menuItem8);

                //---- menuItem9 ----
                menuItem9.setText("\u67e5\u8bfe\u7a0b\u4e0d\u53ca\u683c\u540d\u5355");
                menu2.add(menuItem9);

                //---- menuItem10 ----
                menuItem10.setText("\u6309\u5b66\u53f7\u67e5\u5df2\u4fee\u7684\u5b66\u5206\u6570");
                menu2.add(menuItem10);

                //---- menuItem11 ----
                menuItem11.setText("\u6309\u5b66\u53f7\u67e5\u5404\u79d1\u6210\u7ee9");
                menu2.add(menuItem11);
            }
            menuBar1.add(menu2);

            //======== menu3 ========
            {
                menu3.setText("\u7edf\u8ba1\u6570\u636e");

                //---- menuItem4 ----
                menuItem4.setText("\u6309\u73ed\u7ea7\u7edf\u8ba1\u4e0d\u53ca\u683c\u4eba\u6570\u53ca\u6bd4\u4f8b");
                menu3.add(menuItem4);

                //---- menuItem5 ----
                menuItem5.setText("\u6309\u73ed\u7ea7\u7edf\u8ba1\u5404\u5206\u6570\u6bb5\u4eba\u6570\u53ca\u6bd4\u4f8b");
                menu3.add(menuItem5);

                //---- menuItem6 ----
                menuItem6.setText("\u5404\u79d1\u7684\u5e73\u5747\u5206\u6570");
                menu3.add(menuItem6);
            }
            menuBar1.add(menu3);

            //======== menu4 ========
            {
                menu4.setText("\u7cfb\u7edf\u7ba1\u7406");

                //---- menuItem12 ----
                menuItem12.setText("\u4fee\u6539\u5bc6\u7801");
                menu4.add(menuItem12);

                //---- menuItem13 ----
                menuItem13.setText("\u9000\u51fa\u7cfb\u7edf");
                menu4.add(menuItem13);
            }
            menuBar1.add(menu4);
        }
        setJMenuBar(menuBar1);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenu menu2;
    private JMenuItem menuItem7;
    private JMenuItem menuItem8;
    private JMenuItem menuItem9;
    private JMenuItem menuItem10;
    private JMenuItem menuItem11;
    private JMenu menu3;
    private JMenuItem menuItem4;
    private JMenuItem menuItem5;
    private JMenuItem menuItem6;
    private JMenu menu4;
    private JMenuItem menuItem12;
    private JMenuItem menuItem13;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
