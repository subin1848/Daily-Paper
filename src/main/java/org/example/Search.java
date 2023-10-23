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

        ImageIcon icon1 = new ImageIcon("src/main/resources/static/img/Group 45.png");
        ImageIcon icon2 = new ImageIcon("src/main/resources/static/img/Group 46.png");
        ImageIcon icon3 = new ImageIcon("src/main/resources/static/img/Group 47.png");

        ImageIcon icon4 = new ImageIcon("src/main/resources/static/img/search.png");
        Image img1 = icon4.getImage();
        Image changeImg1 = img1.getScaledInstance(15,15, Image.SCALE_SMOOTH);
        ImageIcon changeIcon1 = new ImageIcon(changeImg1);

        ImageIcon icon5 = new ImageIcon("src/main/resources/static/img/이전.png");
        Image img2 = icon5.getImage();
        Image changeImg2 = img2.getScaledInstance(70,70, Image.SCALE_SMOOTH);
        ImageIcon changeIcon2 = new ImageIcon(changeImg2);

        ImageIcon icon6 = new ImageIcon("src/main/resources/static/img/이후.png");
        Image img3 = icon6.getImage();
        Image changeImg3 = img3.getScaledInstance(70,70, Image.SCALE_SMOOTH);
        ImageIcon changeIcon3 = new ImageIcon(changeImg3);

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
        //p1.setBounds(0, 550, 1200, 100);
        p1.setSize(1200,100);
        p1.add(Box.createHorizontalStrut(5));
        p1.add(b1);
        p1.add(Box.createHorizontalStrut(400));
        p1.add(b2);
        p1.add(Box.createHorizontalStrut(400));
        p1.add(b3);
        p1.add(Box.createHorizontalStrut(10));

        JPanel p2 = new JPanel();
        p2.setBackground(color2);
        p2.setSize(1200,10);
        //p2.setBounds(0, 540, 1200, 10);

        JPanel p3 = new JPanel();
        p3.setBounds(0,555,1200,110);
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
        p3.add(p2);
        p3.add(p1);


        JTextField t1 = new JTextField(20);

        JButton b4 = new JButton(icon4);
        b4.setLayout(null);
        b4.setBorderPainted(false);     // 테두리 없애기
        b4.setContentAreaFilled(false);     // 이미지 외 색깔 없애기
        b4.setFocusPainted(false);

        JPanel p4 = new JPanel();
        p4.setBounds(425,20,350,40);
        p4.add(t1);
        p4.add(b4);
        p4.setLayout(new BoxLayout(p4, BoxLayout.X_AXIS));


        JButton b5 = new JButton(icon5);
        b5.setBounds(30,200,70,70);
        b5.setBorderPainted(false);     // 테두리 없애기
        b5.setContentAreaFilled(false);     // 이미지 외 색깔 없애기
        b5.setFocusPainted(false);

        JButton b6 = new JButton(icon6);
        b6.setBounds(800,200,70,70);
        b6.setBorderPainted(false);     // 테두리 없애기
        b6.setContentAreaFilled(false);     // 이미지 외 색깔 없애기
        b6.setFocusPainted(false);

        JPanel p5 = new JPanel();
        p5.setBounds(150,75,900,460);
        p5.add(b5);
        p5.add(b6);
        p5.setLayout(null);

        frame.add(p3);
        frame.add(p4);
        frame.add(p5);

    }
}