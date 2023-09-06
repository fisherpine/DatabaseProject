package com.ggbz.view.common;

import javax.swing.*;

public class AlertFrame {
    public static void showMessage(String message, String title, int messageType) {
        JOptionPane.showMessageDialog(null, message, title, messageType);
    }

    public static void main(String[] args) {
        // 使用示例：显示一个信息提示窗口
        showMessage("这是一个公共提示窗口示例", "提示", JOptionPane.INFORMATION_MESSAGE);
    }
}
