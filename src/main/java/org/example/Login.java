package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("unused")
public class Login extends JFrame
{
    JPanel panel1;
    JTextField iD_text;
//    HintTextField iD_text2;
//    HintTextField pW_text2;
    JTextField pW_text;
    JLabel lP;
    JButton iD, pW, lG, aC, join;
    ImageIcon lP_img = new ImageIcon("src/main/resources/static/img/하루한장 배경.png");
    ImageIcon iD_img = new ImageIcon("src/main/resources/static/img/ID or E-mail.png");
    ImageIcon iD_img2 = new ImageIcon("src/main/resources/static/img/ID or E-mail2.png");
    ImageIcon pW_img = new ImageIcon("src/main/resources/static/img/password.png");
    ImageIcon pw_img2 = new ImageIcon("src/main/resources/static/img/password2.png");
    ImageIcon lG_img = new ImageIcon("src/main/resources/static/img/Login.png");
    ImageIcon lG_img2 = new ImageIcon("src/main/resources/static/img/Login2.png");
    ImageIcon aC_img = new ImageIcon("src/main/resources/static/img/Don't you have an account.png");
    ImageIcon join_img = new ImageIcon("src/main/resources/static/img/회원가입하기.png");
    ImageIcon join_img2 = new ImageIcon("src/main/resources/static/img/회원가입하기2.png");


    //Id : id 작성 칸
    //Lg : login 작성 칸
    //Pw : password 작성 칸
    //Ac : 계정이 없다면 회원 가입
//    public class HintTextField extends JTextField
//    {
//        Font gainFont = new Font("아이디 입력",Font.PLAIN,15);
//        Font lostFont = new Font("",Font.BOLD,15);
//        public HintTextField(final String hint)
//        {
//            setText(hint);
//            setFont(lostFont);
//            setForeground(Color.GRAY);
//            this.addFocusListener(new FocusAdapter()
//            {
//                @Override
//                public void focusGained(FocusEvent e)
//                {
//                    if (getText().equals(hint))
//                    {
//                        setText("");
//                        setFont(gainFont);
//                    }
//                    else
//                    {
//                        setText(getText());
//                        setFont(gainFont);
//                    }
//                }
//                @Override
//
//                public void focusLost(FocusEvent e)
//                {
//
//                    if (getText().equals(hint) || getText().length() == 0)
//                    {
//                        setText(hint);
//                        setFont(lostFont);
//                        setForeground(Color.GRAY);
//                    } else
//                    {
//                        setText(getText());
//                        setFont(gainFont);
//                        setForeground(Color.BLACK);
//                    }
//                }
//            });
//        }
//    }


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
        panel1.setLayout(new FlowLayout());
        lP = new JLabel();
        lP.setLayout(null);
        lP.setIcon(lP_img);
        add(lP, BorderLayout.WEST);
        //아이디 버튼 만들기
        iD = new JButton(iD_img);
        iD.setBounds(666,165,370,60);
        iD.setBorderPainted(false);
        iD.setFocusPainted(false);
        iD.setVisible(true);
        iD.setContentAreaFilled(false);
        iD.setOpaque(true);
        iD.setBackground(Color.white);
        lP.add(iD);
//        iD_text2 = new HintTextField("            아이디 혹은 이메일을 입력해주세요.");

//        iD_text2.setBounds(720,135,220,19);
//        iD_text2.setBackground(new Color(0,0,0,0));
//        iD_text2.setBorder(new EmptyBorder(0,0,0,0));
//        iD.add(iD_text2);

        //비밀번호 버튼 만들기
        pW = new JButton(pW_img);
        pW.setBounds(666,237,370,60);
        pW.setBorderPainted(false);
        pW.setFocusPainted(false);
        pW.setContentAreaFilled(false);
        pW.setOpaque(true);
        pW.setBackground(Color.white);
//        pW_text2 = new HintTextField("            비밀번호를 입력해주세요.");
//        pW_text2.setBounds(720,135,220,19);
//        pW_text2.setBackground(new Color(0,0,0,0));
//        pW_text2.setBorder(new EmptyBorder(0,0,0,0));
//        pW.add(pW_text2);
        add(lP);
        setVisible(true);
        //로그인 버튼 만들기
        lG = new JButton();
        lG.setIcon(lG_img);
        lG.setRolloverIcon(lG_img2);
        lG.setBorderPainted(false);
        lG.setFocusPainted(false);
        lG.setBounds(666,322,370,60);
        lG.setContentAreaFilled(false);
        lG.setOpaque(true);
        lG.setBackground(Color.white);
        // 계정이 없다면?
        aC = new JButton();
        aC.setIcon(aC_img);
        aC.setBorderPainted(false);
        aC.setFocusPainted(false);
        aC.setBounds(666,407,370,35);
        aC.setContentAreaFilled(false);
        aC.setOpaque(true);
        aC.setBackground(Color.white);
        // 회원가입 창
        join = new JButton();
        join.setIcon(join_img);
        join.setBorderPainted(false);
        join.setFocusPainted(false);
        join.setBounds(785,465,131,35);
        join.setContentAreaFilled(false);
        join.setOpaque(true);
        join.setBackground(Color.white);
        join.setRolloverIcon(join_img2);
        //lP.add(iD);
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
        join.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new membership();
                setVisible(false);
            }
        });
    }

    public static void main(String[] args)
    {
        new Login();
    }
}
