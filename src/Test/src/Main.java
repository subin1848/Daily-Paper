import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //메인 프레임 생성
        ImageIcon normalIcon = new ImageIcon("C:\\MSG 13기 java 프로젝트\\dailypaper\\image\\Group 31.png");

        JFrame f1 = new JFrame();
        //mage background = new ImageIcon(Main.class.getResource("C:\\MSG 13기 java 프로젝트\\dailypaper\\image\\하루한장 배경.png")).getImage();
        Image img = f1.getIconImage();

        f1.setSize(1200,700);
        f1.setVisible(true); //창의 보임 여부
        f1.setResizable(false);  //창의 크기 변경 여부
        f1.getContentPane().setBackground(Color.white); //getcountentpane함수를 이용해 배경 색상 변경


        JButton b1 = new JButton(normalIcon);
        b1.setSize(420,100);

        f1.add(b1, BorderLayout.SOUTH);

        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}