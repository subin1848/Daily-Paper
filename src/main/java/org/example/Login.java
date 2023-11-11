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
    JPasswordField pW_text;
    JCheckBox pw_check;
    JLabel lP, login, aC, password;
    JButton lG, join;
    //label
    ImageIcon lP_img = new ImageIcon("src/main/resources/static/img/하루한장 배경.png");
    ImageIcon login_img = new ImageIcon("src/main/resources/static/img/perm_identity.png");
    ImageIcon password_img = new ImageIcon("src/main/resources/static/img/lock.png");
    ImageIcon password_check = new ImageIcon("src/main/resources/static/img/visibility_off (1).png");
    ImageIcon password_check2 = new ImageIcon("src/main/resources/static/img/visibility (1).png");
    //button
    ImageIcon lG_img = new ImageIcon("src/main/resources/static/img/Login.png");
    ImageIcon lG_img2 = new ImageIcon("src/main/resources/static/img/Login2.png");
//    ImageIcon aC_img = new ImageIcon("src/main/resources/static/img/Don't you have an account.png");
    ImageIcon join_img = new ImageIcon("src/main/resources/static/img/회원가입하기.png");
    ImageIcon join_img2 = new ImageIcon("src/main/resources/static/img/회원가입하기2.png");


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
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        //하루 한장 패널에 넣기
        panel1 = new JPanel();
        panel1.setLayout(null);
        lP = new JLabel();
        login = new JLabel();
        lP.setLayout(null);
        lP.setIcon(lP_img);
        password = new JLabel();
        password.setIcon(password_img);
        password.setBounds(668,257,50,50);
        panel1.add(lP, BorderLayout.WEST);
        lP.setBounds(0,0,600,700);
        //아이디 버튼 만들기
        login = new JLabel("아이디 혹은 이메일을 입력해주세요.");
        login.setIcon(login_img);
        login.setForeground(Color.lightGray);
        login.setBounds(676,169,500,30);
        lP.add(login);
        //아이디 텍스트 필드로 작성하는 칸 만들기
        iD_text = new JTextField();
        iD_text.setBounds(676,204,350,40);
        lP.add(iD_text);
        //비밀번호 버튼 만들기
        password = new JLabel("비밀번호를 입력해주세요.");
        password.setIcon(password_img);
        password.setForeground(Color.lightGray);
        password.setBounds(676,248,500,30);
        lP.add(password);
        //비밀번호 텍스트 필드로 작성하는 칸 만들기
        pW_text = new JPasswordField();
        pW_text.setEchoChar('*');
        pW_text.setBounds(676,282,350,40);
        lP.add(pW_text);
        //show password
        pw_check = new JCheckBox("확인",password_check);
        pw_check.setBorderPainted(false);
        pw_check.setSelectedIcon(password_check2);
        pw_check.setOpaque(true);
        pw_check.setBackground(Color.white);
        pw_check.setBounds(1033,286,30,30);
        lP.add(pw_check);

        //pw_check 클릭 시 password 보이기
        pw_check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (pw_check.isSelected())
                {
                    pW_text.setEchoChar((char) 0);
                }
                else
                {
                    pW_text.setEchoChar('*');
                }
            }
        });
        //로그인 버튼 만들기
        lG = new JButton();
        lG.setIcon(lG_img);
        lG.setRolloverIcon(lG_img2);
        lG.setBorderPainted(false);
        lG.setFocusPainted(false);
        lG.setBounds(666,340,370,60);
        lG.setContentAreaFilled(false);
        lG.setOpaque(true);
        lG.setBackground(Color.white);
        // 계정이 없다면?
        aC = new JLabel("—————               이미 계정이 있으신가요?               —————",JLabel.CENTER);
        aC.setBounds(666,407,370,35);
        aC.setForeground(Color.lightGray);
        // 회원가입 창
        join = new JButton();
        join.setIcon(join_img);
        join.setBorderPainted(false);
        join.setFocusPainted(false);
        join.setBounds(785,450,131,35);
        join.setContentAreaFilled(false);
        join.setOpaque(true);
        join.setBackground(Color.white);
        join.setRolloverIcon(join_img2);
        lP.add(lG);
        lP.add(aC);
        lP.add(join);
        panel1.add(lP);
        add(lP);
        setVisible(true);
        //join을 누르면 membership 파일로 넘어가기
        join.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new membership();
                setVisible(false);
            }
        });
    }
    //main
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                new Login();
            }
        });
    }
}

