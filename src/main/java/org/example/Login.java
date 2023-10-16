package org.example;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("unused")
public class Login extends JFrame
{
    JPanel lP,b1,b2,b3,b4;
    JLabel lP_img;
    ImageIcon img = new ImageIcon("C:\\MSG 13기 java 프로젝트\\dailypaper\\image\\하루한장 배경.png");
    ImageIcon iD_img = new ImageIcon("C:\\MSG 13기 java 프로젝트\\dailypaper\\image\\ID or E-mail.png");
    ImageIcon pW_img = new ImageIcon("C:\\MSG 13기 java 프로젝트\\dailypaper\\image\\password.png");
    ImageIcon lG_img = new ImageIcon("C:\\MSG 13기 java 프로젝트\\dailypaper\\image\\Login.png");
    JButton iD,pW,lG,aC;
    //Id : id 작성 칸
    //Lg : login 작성 칸
    //Pw : password 작성 칸
    //Ac : 계정이 없다면


    public Login()
    {
        //Jframe 설정
        setTitle("Daily-Paper 로그인 화면");
        setLocation(200,200);
        setSize(1200,700);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);    //Jframe 배경색 설정
        //하루한장 페널에 넣기
        lP = new JPanel();
        lP_img = new JLabel(img);
        lP.setBackground(Color.white);
        lP.setLayout(null);     //레이아웃은 null로 설정해줘야함
        lP_img.setIcon(img);
        lP_img.setBackground(Color.white);
        add(lP,BorderLayout.WEST);
        //아이디 버튼 만들기
        b1 = new JPanel();
        iD = new JButton(iD_img);
        iD.setBorderPainted(false);
        iD.setFocusPainted(false);
        iD.setBounds(666,191,350,50);
        iD.setContentAreaFilled(false);
        iD.setOpaque(true);
        iD.setBackground(Color.white);
        //비밀번호 버튼 만들기
        b2 = new JPanel();
        pW = new JButton(pW_img);
        pW.setBorderPainted(false);
        pW.setFocusPainted(false);
        pW.setBounds(666,260,350,50);
        pW.setContentAreaFilled(false);
        pW.setOpaque(true);
        pW.setBackground(Color.white);

        lP.add(iD);
        lP.add(pW);

        add(lP);
        add(lP);

    }
    public static void main(String[] args)
    {
        new Login();
    }
}

