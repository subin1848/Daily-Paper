package org.example;

import javax.swing.*;
import java.awt.*;

public class Search {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Search");
        frame.setPreferredSize(new Dimension(1200,700));    // 폭과 넓이 적용
        frame.setLocation(180,50);      // 윈도우 창의 나타낼 위치
        frame.setLayout(null);
        //frame.setResizable(false);      // 창 크기 제한
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setBackground(Color.white);     // 창 색상 변경

        ImageIcon icon1 = new ImageIcon("C:/Project/Daily-Paper/src/main/java/org/example/Group 45.png");
        ImageIcon icon2 = new ImageIcon("C:/Project/Daily-Paper/src/main/java/org/example/Group 46.png");
        ImageIcon icon3 = new ImageIcon("C:/Project/Daily-Paper/src/main/java/org/example/Group 47.png");

        Color color1 = new Color(0xFFDAB9);
        Color color2 = new Color(0xFFCC99);

        JButton b1 = new JButton(icon1);
        b1.setLayout(null);
        b1.setBorderPainted(false);     // 테두리 없애기
        b1.setContentAreaFilled(false);     // 이미지 외 색깔 없애기
        b1.setFocusPainted(false);

        JButton b2 = new JButton(icon2);
        b2.setBorderPainted(false);     // 테두리 없애기
        b2.setContentAreaFilled(false);     // 이미지 외 색깔 없애기
        b2.setFocusPainted(false);

        JButton b3 = new JButton(icon3);
        b3.setBorderPainted(false);     // 테두리 없애기
        b3.setContentAreaFilled(false);     // 이미지 외 색깔 없애기
        b3.setFocusPainted(false);

        JPanel p1 = new JPanel();
        p1.setBackground(color1);
        p1.setBounds(0, 550, 1200, 110);
        //p1.setLayout(null);
        //p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
        p1.add(Box.createHorizontalStrut(10));
        p1.add(b1);
        p1.add(Box.createHorizontalStrut(400));
        p1.add(b2);
        p1.add(Box.createHorizontalStrut(400));
        p1.add(b3);
        p1.add(Box.createHorizontalStrut(20));

        JPanel p2 = new JPanel();
        p2.setBackground(color2);
        p2.setBounds(0, 580, 1200, 10);
        //p2.setLayout(null);

        frame.add(p1);
        frame.add(p2);
    }
}