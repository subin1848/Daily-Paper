package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("unused")
public class Start extends JFrame
{
    JPanel dP;
    JLabel dP_img;
    JButton sB1,sB2;
    ImageIcon img = new ImageIcon("src/main/resources/static/img/하루한장 배경.png");
    ImageIcon s1img = new ImageIcon("src/main/resources/static/img/Group 31.png");
    ImageIcon s2img = new ImageIcon("src/main/resources/static/img/Group 32.png");

    public Start()
    {
        setTitle("Daily-Paper 시작 화면");
        setLocation(180,50);
        setSize(1200,700);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        dP = new JPanel();
        dP_img = new JLabel(img,JLabel.CENTER);
        dP_img.setVerticalTextPosition(JLabel.CENTER);
        dP_img.setHorizontalTextPosition(JLabel.RIGHT);
        dP.setBackground(Color.white);  //panel 배경색 흰색으로 변경
        dP.add(dP_img); //DP 패널안에 DP_img 삽입

        sB1 = new JButton(s1img);
        sB2 = new JButton();
        sB1.setRolloverIcon(s2img);     //마우스 갖다 대면 이미지 변경
        sB1.setBorderPainted(false);    //테두리 외각선 없애기
        sB1.setFocusPainted(false); //focus 되었을 때 테두리 없애기
        sB1.setBounds(393, 530, 414, 88);
        sB1.setContentAreaFilled(false); // 내용 영역만 클릭 가능하도록 설정
        sB1.setOpaque(true); // 배경색 설정을 유효하게 만듬
        sB1.setBackground(Color.white); // 버튼의 배경색을 흰색으로 설정
        dP.add(sB1);
        add(dP);
        add(sB1, BorderLayout.SOUTH);   //버튼 위치 설정

        sB1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new Login();
                setVisible(false);
            }
        });
    }


    public static void main(String[] args)
    {
        new Start();
    }
}


