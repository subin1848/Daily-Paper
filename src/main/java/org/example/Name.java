package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  Name extends JFrame {
public Name() {
        JFrame frame = new JFrame("이름 생성창");
        frame.setPreferredSize(new Dimension(1200,700));    // 폭과 넓이 적용
        frame.setLocation(180,50);      // 윈도우 창의 나타낼 위치
        frame.setLayout(null);
        //frame.setResizable(false);      // 창 크기 제한
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setBackground(Color.white);     // 창 색상 변경

        JPanel p1 = new JPanel();
        p1.setBackground(Color.white);
        p1.setBounds(450, 250, 300, 150);
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));

        ImageIcon icon5 = new ImageIcon("src/main/resources/static/img/Frame 5.png");
        Image img5 = icon5.getImage();
        Image changeImg5 = img5.getScaledInstance(300,50, Image.SCALE_SMOOTH);
        ImageIcon changeIcon5 = new ImageIcon(changeImg5);

        JLabel l1 = new JLabel();
        l1.setIcon(changeIcon5);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        p2.add(l1);

        ImageIcon icon1 = new ImageIcon("src/main/resources/static/img/Group 42.png");
        ImageIcon icon2 = new ImageIcon("src/main/resources/static/img/Group 43.png");

        Image img1 = icon1.getImage();
        Image changeImg1 = img1.getScaledInstance(80,30, Image.SCALE_SMOOTH);
        ImageIcon changeIcon1 = new ImageIcon(changeImg1);
        Image img2 = icon2.getImage();
        Image changeImg2 = img2.getScaledInstance(80,30, Image.SCALE_SMOOTH);
        ImageIcon changeIcon2 = new ImageIcon(changeImg2);

        JButton b1 = new JButton(changeIcon1);
        b1.setRolloverIcon(changeIcon2);       // 버튼에 마우스가 올라갈 때
        b1.setBorderPainted(false);     // 테두리 없애기
        b1.setContentAreaFilled(false);     // 이미지 외 색깔 없애기
        b1.setFocusPainted(false);

        JPanel p3 = new JPanel();
        p3.setBackground(Color.white);
        p3.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS));
        p3.add(new TextField());
        p3.add(b1);

        ImageIcon icon3 = new ImageIcon("src/main/resources/static/img/Group 24.png");
        ImageIcon icon4 = new ImageIcon("src/main/resources/static/img/Group 44.png");

        Image img3 = icon3.getImage();
        Image changeImg3 = img3.getScaledInstance(40,40, Image.SCALE_SMOOTH);
        ImageIcon changeIcon3 = new ImageIcon(changeImg3);
        Image img4 = icon4.getImage();
        Image changeImg4 = img4.getScaledInstance(40,40, Image.SCALE_SMOOTH);
        ImageIcon changeIcon4 = new ImageIcon(changeImg4);

        JButton b2 = new JButton(changeIcon3);
        b2.setRolloverIcon(changeIcon4);       // 버튼에 마우스가 올라갈 때
        b2.setBorderPainted(false);     // 테두리 없애기
        b2.setContentAreaFilled(false);     // 이미지 외 색깔 없애기
        b2.setFocusPainted(false);

        JPanel p4 = new JPanel();
        p4.setBackground(Color.white);
        p4.add(b2);

        p1.add(p2);
        p1.add(p3);
        p1.add(p4);

        frame.add(p1);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Home1();
                setVisible(false); // 창 안보이게 하기
            }
        });
    }
    public static void main(String args[]) {
        new Name();
    }
}