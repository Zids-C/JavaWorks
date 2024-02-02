package Class;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static javax.swing.JOptionPane.showMessageDialog;

public class GetStarted extends JFrame {
    JFrame f1;
    JLabel l2;
    JButton b1, b2, b3;
    ImageIcon i1;

    public GetStarted() throws IOException {

        f1 = new JFrame();
        f1.setUndecorated(true);
        f1.setBounds(0, 0, 100, 100);
        f1.setBackground(Color.WHITE);

        i1 = new ImageIcon("Image/logo.png");
        f1.setIconImage(i1.getImage());

        BufferedImage originalImage = ImageIO.read(new File("Image/getStarted.png"));
        Image resizedImage = originalImage.getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(resizedImage);
        JLabel l1 = new JLabel();
        l1.setIcon(icon);
        Dimension size = l1.getPreferredSize();
        l1.setBounds(0, 0, size.width, size.height);



        b1 = new JButton("X");
        b1.setBounds(1144, 4, 30, 40);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setForeground(Color.BLACK);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);

        b2 = new JButton("-");
        b2.setBounds(1114, 4, 25, 30);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 40));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setForeground(Color.BLACK);
        b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setContentAreaFilled(false);

        b3 = new JButton("Get Started");
        b3.setBounds(510, 620, 180, 40);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.decode("#009999"));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);

        // b3.setOpaque(false);



        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(l1);

        f1.setSize(1200, 700);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setResizable(false);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b1) {
                    f1.setVisible(false);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b2) {
                    f1.setState(Frame.ICONIFIED);
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b3) {
                    try {
                        new GUI();
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                    f1.setVisible(false);

                }
            }
        });



    }

}
