package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("unused")
public class Login extends JFrame
{
    JPanel panel1;
    JPanel panel2;
    JLabel lP;
    JButton iD, pW, lG, aC, join;
    ImageIcon lP_img = new ImageIcon("src/main/resources/static/img/하루한장 배경.png");
    ImageIcon iD_img = new ImageIcon("src/main/resources/static/img/ID or E-mail.png");
    ImageIcon pW_img = new ImageIcon("src/main/resources/static/img/password.png");
    ImageIcon lG_img = new ImageIcon("src/main/resources/static/img/Login.png");
    ImageIcon lG_img2 = new ImageIcon("src/main/resources/static/img/Login2.png");
    ImageIcon aC_img = new ImageIcon("src/main/resources/static/img/Don't you have an account.png");
    ImageIcon join_img = new ImageIcon("src/main/resources/static/img/회원가입하기.png");

    //Id : id 작성 칸
    //Lg : login 작성 칸
    //Pw : password 작성 칸
    //Ac : 계정이 없다면 회원 가입

    public Login()
    {
        //JFrame 설정
        setTitle("Daily-Paper 로그인 화면");
        setLocation(180,50);
        setSize(1200,700);
        //setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        //하루 한장 패널에 넣기
        panel1 = new JPanel();
        panel1.setLayout(null);
        lP = new JLabel();
        lP.setIcon(lP_img);
        add(lP, BorderLayout.WEST);
        setVisible(true);
        //버튼 패널 만들기
//        panel2 = new JPanel();
//        panel2.setLayout(null);
//      //  panel2.setBounds(500,500,700,1000);

        //아이디 버튼 만들기
        iD = new JButton();
        iD.setIcon(iD_img);
        iD.setText("아이디 혹은 이메일을 입력해주세요.");
        iD.setForeground(Color.gray);
        iD.setVerticalTextPosition(JButton.CENTER);

        iD.setHorizontalTextPosition(JButton.CENTER);
        iD.setBorderPainted(false);
        iD.setFocusPainted(false);
        iD.setBounds(666,191,370,60);
        iD.setContentAreaFilled(false);
        iD.setOpaque(true);
        iD.setBackground(Color.white);
        iD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 클릭 시 버튼의 텍스트를 제거
                iD.setText("");

            }
        });

        //비밀번호 버튼 만들기
        pW = new JButton();
        pW.setIcon(pW_img);

        pW.setBorderPainted(false);
        pW.setFocusPainted(false);
        pW.setBounds(666,260,370,60);
        pW.setContentAreaFilled(false);
        pW.setOpaque(true);
        pW.setBackground(Color.white);

        //로그인 버튼 만들기
        lG = new JButton();
        lG.setIcon(lG_img);
        lG.setRolloverIcon(lG_img2);
        lG.setBorderPainted(false);
        lG.setFocusPainted(false);
        lG.setBounds(666,344,370,60);
        lG.setContentAreaFilled(false);
        lG.setOpaque(true);
        lG.setBackground(Color.white);
        // 계정이 없다면?
        aC = new JButton();
        aC.setIcon(aC_img);
        aC.setBorderPainted(false);
        aC.setFocusPainted(false);
        aC.setBounds(666,427,370,35);
        aC.setContentAreaFilled(false);
        aC.setOpaque(true);
        aC.setBackground(Color.white);
        // 회원가입 창
        join = new JButton();
        join.setIcon(join_img);
        join.setBorderPainted(false);
        join.setFocusPainted(false);
        join.setBounds(785,485,131,35);
        join.setContentAreaFilled(false);
        join.setOpaque(true);
        join.setBackground(Color.white);

        lP.add(iD);
        lP.add(pW);
        lP.add(lG);
        lP.add(aC);
        lP.add(join);

        panel1.add(lP);
        add(lP);
//        add(lP, BorderLayout.CENTER);
        setVisible(true);

        lG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new Name();
                setVisible(false);
            }
        });
    }


    public static void main(String[] args)
    {
        new Login();
    }
}

