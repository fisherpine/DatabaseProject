/*
 * Created by JFormDesigner on Thu Sep 14 16:14:40 CST 2023
 */

package com.ggbz.plungerView.news;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.ggbz.plungerView.edit.StudentMessageEdit;
import com.ggbz.pojo.Student;
import com.ggbz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sssy
 */
public class StudentMessageFrame extends JFrame {
    @Autowired
    private StudentService studentService;
    public StudentMessageFrame() {
        initComponents();
    }

    private void button4(ActionEvent e) {
        // TODO 查询学生
        //得到输入栏中的信息
        String StudentId = textField1.getText();
        String name = textField2.getText();
        String sex = comboBox1.getSelectedItem().toString();
        if (sex.equals(" ")){
            sex = null;
        }
        String dept = textField3.getText();
        String lesson = textField4.getText();
        Student student = new Student(StudentId,name,sex,null,dept);
        String[] columnNames = {"学号","姓名","性别","年龄","专业"};
        List<Student> list = studentService.QueryStudent(student);
        System.out.println(list);
        // 将List转换为二维数组
        Object[][] studentData = new Object[list.size()][5];
        for (int i = 0; i < list.size(); i++) {
            Student student1 = list.get(i);
            studentData[i][0] = student1.getSno();
            studentData[i][1] = student1.getSname();
            studentData[i][2] = student1.getSex();
            studentData[i][3] = student1.getAge();
            studentData[i][4] = student1.getDept();
        }
        DefaultTableModel defaultTableModel = new DefaultTableModel(studentData, columnNames);
        table1.setModel(defaultTableModel);

    }

    private void button1(ActionEvent e) {
        // 修改所选行
        //TODO 修改学生数据
        int selectedRow = table1.getSelectedRow();
        if(selectedRow != -1){//检查是否有行选中
            String sno  = (String) table1.getValueAt(selectedRow, 0);
            String sname  = (String) table1.getValueAt(selectedRow, 1);
            String sex  = (String) table1.getValueAt(selectedRow, 2);
            String age  =  table1.getValueAt(selectedRow, 3).toString();
            String dept  = (String) table1.getValueAt(selectedRow, 4);
            StudentMessageEdit studentMessageEdit = new StudentMessageEdit();
            studentMessageEdit.getTextField1().setText(sno);
            studentMessageEdit.getTextField2().setText(sname);
            if (sex.equals("男")){
                studentMessageEdit.getComboBox1().setSelectedIndex(0);
            }else{
                studentMessageEdit.getComboBox1().setSelectedIndex(1);
            }
            studentMessageEdit.getTextField3().setText(age);
            studentMessageEdit.getTextField4().setText(dept);
            studentMessageEdit.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "您没有选中数据", "提示信息", JOptionPane.PLAIN_MESSAGE);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel2 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel1 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        comboBox1 = new JComboBox<>();
        label4 = new JLabel();
        textField3 = new JTextField();
        button4 = new JButton();
        label5 = new JLabel();
        textField4 = new JTextField();

        //======== this ========
        setMinimumSize(new Dimension(14, 4));
        setPreferredSize(new Dimension(860, 450));
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel2 ========
        {
            panel2.setPreferredSize(new Dimension(8, 50));
            panel2.setLayout(null);

            //---- button1 ----
            button1.setText("\u4fee\u6539");
            button1.addActionListener(e -> button1(e));
            panel2.add(button1);
            button1.setBounds(120, 5, 80, 30);

            //---- button2 ----
            button2.setText("\u6dfb\u52a0");
            panel2.add(button2);
            button2.setBounds(360, 5, 85, 30);

            //---- button3 ----
            button3.setText("\u5220\u9664");
            panel2.add(button3);
            button3.setBounds(580, 5, 80, 30);

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
            table1.setRowHeight(30);
            table1.setRowMargin(5);
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1, BorderLayout.CENTER);

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(10, 50));
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("\u5b66\u53f7\uff1a");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 4f));
            panel1.add(label1);
            label1.setBounds(10, 15, 60, label1.getPreferredSize().height);
            panel1.add(textField1);
            textField1.setBounds(60, 10, 100, 29);

            //---- label2 ----
            label2.setText("\u59d3\u540d\uff1a");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 4f));
            panel1.add(label2);
            label2.setBounds(new Rectangle(new Point(170, 15), label2.getPreferredSize()));
            panel1.add(textField2);
            textField2.setBounds(215, 10, 85, 29);

            //---- label3 ----
            label3.setText("\u6027\u522b\uff1a");
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 4f));
            panel1.add(label3);
            label3.setBounds(new Rectangle(new Point(305, 15), label3.getPreferredSize()));

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                " ",
                "\u7537",
                "\u5973"
            }));
            comboBox1.setFont(comboBox1.getFont().deriveFont(comboBox1.getFont().getSize() + 4f));
            panel1.add(comboBox1);
            comboBox1.setBounds(345, 10, 50, comboBox1.getPreferredSize().height);

            //---- label4 ----
            label4.setText("\u4e13\u4e1a\uff1a");
            label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 4f));
            panel1.add(label4);
            label4.setBounds(new Rectangle(new Point(420, 15), label4.getPreferredSize()));
            panel1.add(textField3);
            textField3.setBounds(475, 10, 100, 29);

            //---- button4 ----
            button4.setText("\u67e5\u8be2");
            button4.setFont(button4.getFont().deriveFont(button4.getFont().getSize() + 3f));
            button4.addActionListener(e -> button4(e));
            panel1.add(button4);
            button4.setBounds(new Rectangle(new Point(720, 10), button4.getPreferredSize()));

            //---- label5 ----
            label5.setText("\u73ed\u7ea7\uff1a");
            label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 4f));
            panel1.add(label5);
            label5.setBounds(new Rectangle(new Point(580, 15), label5.getPreferredSize()));
            panel1.add(textField4);
            textField4.setBounds(625, 10, 75, 29);

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
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel1;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JComboBox<String> comboBox1;
    private JLabel label4;
    private JTextField textField3;
    private JButton button4;
    private JLabel label5;
    private JTextField textField4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

}
