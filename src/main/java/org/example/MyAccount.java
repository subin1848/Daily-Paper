package org.example;

import javax.swing.*;
import java.awt.*;

public class MyAccount extends JFrame
{
    JPanel mP1, mP2, mP3;
    JLabel profile, name, follow, heart, watch, heart_txt, watch_txt;
    JButton sB, hB, aB;
    //sB == search, hB == home, aB == account
    ImageIcon sB_img = new ImageIcon("src/main/resources/static/img/Group 64 (4).png");

    ImageIcon hB_img = new ImageIcon("src/main/resources/static/img/Group 46.png");
    ImageIcon aB_img = new ImageIcon("src/main/resources/static/img/Group 56.png");
    ImageIcon profile_img = new ImageIcon("src/main/resources/static/img/계정 프로필.png");
    ImageIcon name_img = new ImageIcon("src/main/resources/static/img/name.png");
    ImageIcon follow_img = new ImageIcon("src/main/resources/static/img/follow.png");
    ImageIcon heart_img = new ImageIcon("src/main/resources/static/img/Group 54.png");
    ImageIcon watch_img = new ImageIcon("src/main/resources/static/img/Group 51.png");
    public MyAccount()
    {
        setTitle("Account 창");
        setPreferredSize(new Dimension(1200,700));
        setLocation(180,50);
        setLayout(null);
        setResizable(false);
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);

        Color color1 = new Color(0xFFDAB9);
        Color color2 = new Color(0xFFCC99);
        //search
        sB = new JButton(sB_img);
        sB.setLayout(null);
        sB.setBorderPainted(false);     // 테두리 없애기
        sB.setContentAreaFilled(false);     // 이미지 외 색깔 없애기
        sB.setFocusPainted(false);
        //home
        hB = new JButton(hB_img);
        hB.setBorderPainted(false);     // 테두리 없애기
        hB.setContentAreaFilled(false);     // 이미지 외 색깔 없애기
        hB.setFocusPainted(false);
        //account
        aB = new JButton(aB_img);
        aB.setBorderPainted(false);     // 테두리 없애기
        aB.setContentAreaFilled(false);     // 이미지 외 색깔 없애기
        aB.setFocusPainted(false);
        //프로필 사진
        profile = new JLabel(profile_img);
        profile.setBounds(125,71,80,80);
        add(profile);
        //name
        name = new JLabel(name_img);
        name.setBounds(274, 71, 204, 26);
        add(name);
        //follow
        follow = new JLabel(follow_img);
        follow.setBounds(274,107,204,26);
        add(follow);
        //최근 본 게시물
        watch_txt = new JLabel("최근 본 게시물");
        Font font = new Font("League Spartan",Font.BOLD, 15);
        watch_txt.setFont(font);
        watch_txt.setBounds(194,248,115,17);
        watch = new JLabel(watch_img);
        watch.setBounds(125,236,215,42);
        add(watch);
        add(watch_txt);
        //좋아요한 게시물
        heart_txt = new JLabel("좋아요한 게시물");
        Font font2 = new Font("League Spartan",Font.BOLD, 15);
        heart_txt.setFont(font2);
        heart_txt.setBounds(791,84,128,17);
        heart = new JLabel(heart_img);
        heart.setBounds(724,71,215,42);
        add(heart);
        add(heart_txt);
        //menu
        mP1 = new JPanel();
        mP1.setBackground(color1);
        mP1.setSize(1200,100);
        mP1.add(Box.createHorizontalStrut(5));
        mP1.add(sB);
        mP1.add(Box.createHorizontalStrut(400));
        mP1.add(hB);
        mP1.add(Box.createHorizontalStrut(400));
        mP1.add(aB);
        mP1.add(Box.createHorizontalStrut(10));

        mP2 = new JPanel();
        mP2.setBackground(color2);
        mP2.setSize(1200,10);
        //account
        mP3 = new JPanel();
        mP3.setBounds(0,555,1200,110);
        mP3.setLayout(new BoxLayout(mP3, BoxLayout.Y_AXIS));
        mP3.add(mP2);
        mP3.add(mP1);
        add(mP3);
    }
    public static void main(String[] args)
    {
        new MyAccount();
    }
}


