package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home1 extends JFrame {
    public Home1() {
        JFrame frame = new JFrame("Home");
        frame.setPreferredSize(new Dimension(1200, 700));    // 폭과 넓이 적용
        frame.setLocation(180, 50);      // 윈도우 창의 나타낼 위치
        frame.setLayout(null);
        frame.setResizable(false);      // 창 크기 제한
        frame.pack();


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setBackground(Color.white);     // 창 색상 변경

        ImageIcon icon1 = new ImageIcon("src/main/resources/static/img/Group 45.png");
        ImageIcon icon2 = new ImageIcon("src/main/resources/static/img/Group 46.png");
        ImageIcon icon3 = new ImageIcon("src/main/resources/static/img/Group 47.png");

        ImageIcon icon4 = new ImageIcon("src/main/resources/static/img/Page1.png");
        Image img4 = icon4.getImage();
        Image changeImg4 = img4.getScaledInstance(760, 535, Image.SCALE_SMOOTH);
        ImageIcon changeIcon4 = new ImageIcon(changeImg4);

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
        p1.setSize(1200, 100);
        //p1.setBounds(0, 550, 1200, 100);
        p1.add(Box.createHorizontalStrut(5));
        p1.add(b1);
        p1.add(Box.createHorizontalStrut(400));
        p1.add(b2);
        p1.add(Box.createHorizontalStrut(400));
        p1.add(b3);
        p1.add(Box.createHorizontalStrut(10));

        JPanel p2 = new JPanel();
        p2.setBackground(color2);
        p2.setSize(1200, 10);
        //p2.setBounds(0, 540, 1200, 10);

        JPanel p3 = new JPanel();
        //p5.setSize(1200,700);
        p3.setBounds(0, 555, 1200, 110);
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
        p3.add(p2);
        p3.add(p1);

        JLabel l1 = new JLabel(changeIcon4);

        JPanel p4 = new JPanel();
        p4.setBackground(Color.white);
        p4.setBounds(220, 5, 760, 545);
        p4.add(l1);
        //p4.setLayout(null);

        frame.add(p3);
        frame.add(p4);

        //frame.add(p3, BorderLayout.NORTH); // p3를 상단에 배치
        //frame.add(p4, BorderLayout.CENTER); // p4를 중앙에 배치

        frame.setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Search();
                setVisible(false); // 창 안보이게 하기
            }
        });
    }
    public static void main(String args[]) {
        new Home1();
    }
}