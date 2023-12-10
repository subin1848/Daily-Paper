package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class membership extends JFrame
{
    JPanel p1;
    JLabel mP, iD, pW, pwcheck, name, account;
    JTextField iD_hint, pW_hint, pWcheck_hint, name_hint;
    JButton join, login;
    ImageIcon iD_img = new ImageIcon("src/main/resources/static/img/Group 60 (1).png");
    ImageIcon pw_img = new ImageIcon("src/main/resources/static/img/Group 12.png");
    ImageIcon pwcheck_img = new ImageIcon("src/main/resources/static/img/Group 62 (3).png");
    ImageIcon name_img = new ImageIcon("src/main/resources/static/img/Group 13.png");
    //button
    ImageIcon join_img = new ImageIcon("src/main/resources/static/img/회원가입.png");
    ImageIcon join_img2 = new ImageIcon("src/main/resources/static/img/회원가입2.png");
    ImageIcon login_img = new ImageIcon("src/main/resources/static/img/로그인 하기.png");
    ImageIcon login_img2 = new ImageIcon("src/main/resources/static/img/로그인 하기2.png");
    public class HintTextField extends JTextField {
        public HintTextField(final String hint) {
            setText(hint);
            setForeground(Color.gray);
            this.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (getText().equals(hint))
                    {
                        setText("");
                    } else {
                        setText(getText());
                    }
                }
                @Override
                public void focusLost(FocusEvent e) {
                    if (getText().equals(hint)|| getText().isEmpty())
                    {
                        setText(hint);
                        setForeground(Color.gray);
                    } else
                    {
                        setText(getText());
                        setForeground(Color.black);
                    }
                }
            });
        }
    }//HintTextField 메소드
    public membership()
    {
        setTitle("회원가입 창");
        setLocation(180,50);
        setSize(1200,700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        p1 = new JPanel();
        p1.setLayout(null);
        //mp label 생성
        mP = new JLabel();
        mP.setBackground(Color.white);
        mP.setLayout(null);
        p1.add(mP);
        //회원가입 아이디생성 버튼
        iD = new JLabel(iD_img);
        iD.setBounds(425,144,55,50);
        mP.add(iD);
        //아이디 hint text
        iD_hint = new HintTextField("email@example.com");
        iD_hint.setBounds(481,144,294,50);
        add(iD_hint);
        //회원가입 비밀번호생성 버튼
        pW = new JLabel(pw_img);
        pW.setBounds(425,201,55,50);
        mP.add(pW);
        //회원가입 hint text
        pW_hint = new HintTextField("비밀번호를 입력해주세요.");
        pW_hint.setBounds(480,201,295,50);
        add(pW_hint);
        //비밀번호 확인 생성
        pwcheck = new JLabel(pwcheck_img);
        pwcheck.setBounds(425,258,55,50);
        mP.add(pwcheck);
        //비밀번호 hint text
        pWcheck_hint = new HintTextField("비밀번호를 다시 한번 입력해주세요.");
        pWcheck_hint.setBounds(480,258,295,50);
        add(pWcheck_hint);
        //이름 생성
        name = new JLabel(name_img);
        name.setBounds(425,315,55,50);
        mP.add(name);
        //이름 hint text
        name_hint = new HintTextField("이름을 입력하세요.");
        name_hint.setBounds(480,315,295,50);
        add(name_hint);
        //회원가입
        join = new JButton();
        join.setIcon(join_img);
        join.setBorderPainted(false);
        join.setFocusPainted(false);
        join.setBounds(423,390,350,60);
        join.setContentAreaFilled(false);
        join.setOpaque(true);
        join.setBackground(Color.white);
        join.setRolloverIcon(join_img2);
        mP.add(join);
        //account
        account = new JLabel("—————               이미 계정이 있으신가요?               —————",JLabel.CENTER);
        account.setBounds(413,465,370,35);
        account.setForeground(Color.lightGray);
        mP.add(account);
        //login
        login = new JButton();
        login.setIcon(login_img);
        login.setBorderPainted(false);
        login.setFocusPainted(false);
        login.setBounds(547,515,97,25);
        login.setContentAreaFilled(false);
        login.setOpaque(true);
        login.setBackground(Color.white);
        login.setRolloverIcon(login_img2);
        mP.add(login);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new Login();
                setVisible(false);
            }
        });
        join.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new Login();
                setVisible(false);
            }
        });
        add(p1);
        add(mP);
            setVisible(true);
    }



    public static void main(String[] args)
    {
        new membership();
    }

}

