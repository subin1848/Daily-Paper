package org.example;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("unused")
public class LoginStart extends JFrame
{
    JPanel DP;
    JLabel DP_img;
    JButton Sb1,Sb2;
    ImageIcon img = new ImageIcon("C:\\MSG 13기 java 프로젝트\\dailypaper\\image\\하루한장 배경.png");
    ImageIcon S1img = new ImageIcon("C:\\MSG 13기 java 프로젝트\\dailypaper\\image\\Group 31.png");
    ImageIcon S2img = new ImageIcon("C:\\MSG 13기 java 프로젝트\\dailypaper\\image\\Group 32.png");

    public LoginStart()
    {
        setTitle("Daily-Paper 로그인 화면");
        setLocation(200,200);
        setSize(1200,700);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DP = new JPanel();
        DP_img = new JLabel(img,
                JLabel.CENTER);
        DP_img.setVerticalTextPosition(JLabel.CENTER);
        DP_img.setHorizontalTextPosition(JLabel.RIGHT);
        DP.setBackground(Color.white);  //panel 배경색 흰색으로 변경
        DP.add(DP_img); //DP 패널안에 DP_img 삽입

        Sb1 = new JButton(S1img);
        Sb2 = new JButton();
        Sb1.setRolloverIcon(S2img);     //마우스 갖다 대면 이미지 변경
        Sb1.setBorderPainted(false);    //테두리 외각선 없애기
        //Sb1.setContentAreaFilled(false);//내용 영역 없애기
        Sb1.setFocusPainted(false); //focus 되었을 때 테두리 없애기
        Sb1.setBounds(393, 530, 414, 88);
        Sb1.setContentAreaFilled(false); // 내용 영역만 클릭 가능하도록 설정
        Sb1.setOpaque(true); // 배경색 설정을 유효하게 만듬
        Sb1.setBackground(Color.white); // 버튼의 배경색을 흰색으로 설정

//        Sb1.setBackground(new Color(255,255,255));  //버튼 배경 흰색으로 설정
//        Sb1.setContentAreaFilled(false); // 내용 영역만 클릭 가능하도록 설정

        DP.add(Sb1);
        add(DP);
        add(Sb1, BorderLayout.SOUTH);   //버튼 위치 설정

    }
    public static void main(String[] args)
    {
        new LoginStart();
    }
}


