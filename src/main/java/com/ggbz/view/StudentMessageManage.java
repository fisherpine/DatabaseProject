package com.ggbz.view;

import com.ggbz.pojo.Student;
import com.ggbz.service.CourseService;
import com.ggbz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentMessageManage extends JFrame {
    @Autowired
    private StudentService studentService;

    private JFrame fatherJframe;
    public StudentMessageManage() {
    }
    public StudentMessageManage(JFrame fatherJframe) {
        this.fatherJframe = fatherJframe;
    }

    public void MessageAdd(){
        JFrame frame = new JFrame("学生信息录入");
        //frame布局
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);

        FrameCenter(frame);
        JPanel MessagejPanel = new JPanel();
        MessagejPanel.setPreferredSize(new Dimension(500,300));

        JPanel OperatejPanel = new JPanel();
        OperatejPanel.setPreferredSize(new Dimension(500,100));


        //给Panel创建边框
        Border lineBorder = BorderFactory.createLineBorder(Color.GRAY, 1);
        OperatejPanel.setBorder(lineBorder);
        MessagejPanel.setBorder(lineBorder);

        //给边框加标题
        TitledBorder OperatetitledBorder = BorderFactory.createTitledBorder("操作");
        TitledBorder MessagetitledBorder = BorderFactory.createTitledBorder("学生信息");

        OperatetitledBorder.setTitleJustification(TitledBorder.LEFT);
        OperatetitledBorder.setTitleColor(Color.BLACK);

        MessagetitledBorder.setTitleJustification(TitledBorder.LEFT);
        MessagetitledBorder.setTitleColor(Color.BLACK);

        OperatejPanel.setBorder(OperatetitledBorder);
        MessagejPanel.setBorder(MessagetitledBorder);

        //给Panel创建布局
        MessagejPanel.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5,5,5,5);

        // 创建标签和文本框组件并添加到面板中
        addComponent(MessagejPanel, new JLabel("学号："), 0, 0, GridBagConstraints.WEST);
        JTextField sno = new JTextField(15);
        addComponent(MessagejPanel,sno, 1, 0, GridBagConstraints.WEST);

        addComponent(MessagejPanel, new JLabel("姓名："), 0,1 , GridBagConstraints.WEST);
        JTextField sname = new JTextField(15);
        addComponent(MessagejPanel, sname, 1,1 , GridBagConstraints.WEST);

        //性别单选框
        JRadioButton man = new JRadioButton("男");
        JRadioButton woman = new JRadioButton("女");
        man.setActionCommand("男");
        woman.setActionCommand("女");
        //分组
        ButtonGroup group = new ButtonGroup();
        group.add(man);
        group.add(woman);

        //创建JPanel
        JPanel RadioButtonJpanel = new JPanel();
        RadioButtonJpanel.add(man);
        RadioButtonJpanel.add(woman);

        addComponent(MessagejPanel, new JLabel("性别："), 0,2 , GridBagConstraints.WEST);
        addComponent(MessagejPanel,RadioButtonJpanel,1,2,GridBagConstraints.WEST);


        addComponent(MessagejPanel, new JLabel("年龄："), 0,3 , GridBagConstraints.WEST);
        JTextField age = new JTextField(15);
        addComponent(MessagejPanel, age, 1,3 , GridBagConstraints.WEST);

        addComponent(MessagejPanel, new JLabel("专业："), 0,4 , GridBagConstraints.WEST);
        JComboBox dept = new JComboBox();
        dept.addItem("计算机科学与技术");
        dept.addItem("软件工程");
        dept.addItem("信息管理");
        dept.addItem("网络与新媒体");
        dept.setSelectedIndex(-1);
        addComponent(MessagejPanel, dept, 1,4 , GridBagConstraints.WEST);

        addComponent(MessagejPanel, new JLabel("班级："), 0,5 , GridBagConstraints.WEST);
        JComboBox lesson = new JComboBox();
        lesson.addItem("C001");
        lesson.addItem("C002");
        lesson.setSelectedIndex(-1);
        addComponent(MessagejPanel,lesson, 1,5 , GridBagConstraints.WEST);

        //OperatePanel面板中组件的添加
        OperatejPanel.setLayout(new GridLayout(1,2));
        JButton addStudent = new JButton("新增");
        addStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student student = new Student();
                student.setSno(sno.getText());
                student.setSname(sname.getText());
                ButtonModel selectedModel = group.getSelection();
                if (selectedModel != null) {
                    String selectedText = selectedModel.getActionCommand();
                    student.setSex(selectedText);
                }
                student.setAge(Integer.valueOf(age.getText()));
                student.setDept(dept.getSelectedItem().toString());
                student.setLesson(lesson.getSelectedItem().toString());
                //添加学生
                studentService.AddStudent(student);
            }
        });
        JButton exit = new JButton("退出");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                fatherJframe.setVisible(true);
            }
        });

        JPanel buttonContainer1 = new JPanel(new FlowLayout(FlowLayout.RIGHT,20,20));
        buttonContainer1.setPreferredSize(new Dimension(200, 50)); // 设置容器大小
        buttonContainer1.add(addStudent);

        JPanel buttonContainer2 = new JPanel(new FlowLayout(FlowLayout.LEFT,20,20));
        buttonContainer2.setPreferredSize(new Dimension(200, 50)); // 设置容器大小
        buttonContainer2.add(exit);

        OperatejPanel.add(buttonContainer1);
        OperatejPanel.add(buttonContainer2);

        frame.add(MessagejPanel,BorderLayout.CENTER);
        frame.add(OperatejPanel,BorderLayout.SOUTH);

        frame.setVisible(true);
    }
    private static void addComponent(Container container, Component component, int gridx, int gridy, int anchor) {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        constraints.anchor = anchor;
        container.add(component, constraints);
    }


    public void MessageSelect(){
        JFrame frame = new JFrame("学生信息查询");
        //frame布局
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        FrameCenter(frame);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        StudentMessageManage studentMessageManage = new StudentMessageManage();
        studentMessageManage.MessageAdd();
    }
    public void FrameCenter(JFrame frame){
        // 获取屏幕尺寸
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // 计算窗口位置
        int centerX = (screenSize.width - frame.getWidth()) / 2;
        int centerY = (screenSize.height - frame.getHeight()) / 2;

        // 设置窗口位置
        frame.setLocation(centerX, centerY);
    }


}
