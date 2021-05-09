/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9LamQuen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.WindowConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author CHU TUAN KIET
 */
public class javaGuiCanBan extends JFrame implements ActionListener {

    JLabel tieude = new JLabel();
    JTextField tf = new JTextField();
    JButton btnChao = new JButton();
    JButton btnXoa = new JButton();
    JButton btnThoat = new JButton();
    JButton btnRed = new JButton();
    JButton btnBlue = new JButton();
    JButton btnGreen = new JButton();

    public javaGuiCanBan() {
        this.setTitle("Lam quen Java GUI");
        this.getContentPane().setLayout(null);
        this.setBounds(500, 250, 500, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        tieude.setText("Bai tap lam quen java gui");
        tieude.setOpaque(true);
        tieude.setBackground(Color.red);
        tieude.setBounds(new Rectangle(150, 60, 200, 30));
        tieude.setHorizontalAlignment((int) Component.CENTER_ALIGNMENT);
        this.getContentPane().add(tieude);
        

        tf.setBounds(80, 120, 340, 30);
        tf.setText("");
        this.getContentPane().add(tf);
        
        btnChao.setBounds(80,170,100,30);
        btnChao.setText("Chao");
        btnChao.setOpaque(true);
        btnChao.setBackground(Color.YELLOW);
        this.getContentPane().add(btnChao);
        btnChao.addActionListener(this);
        
        btnXoa.setBounds(200,170,100,30);
        btnXoa.setText("Xoa");
        btnXoa.setOpaque(true);
        btnXoa.setBackground(Color.YELLOW);
        this.getContentPane().add(btnXoa);
                btnXoa.addActionListener(this);

        
        btnThoat.setBounds(320,170,100,30);
        btnThoat.setText("Thoat");
        btnThoat.setOpaque(true);
        btnThoat.setBackground(Color.YELLOW);
        this.getContentPane().add(btnThoat);
                btnThoat.addActionListener(this);

        
        btnRed.setBounds(80,220,100,30);
        btnRed.setText("RED");
        btnRed.setForeground(Color.WHITE);
        btnRed.setOpaque(true);
        btnRed.setBackground(Color.RED);
        this.getContentPane().add(btnRed);
                btnRed.addActionListener(this);

        
        btnBlue.setBounds(200,220,100,30);
        btnBlue.setText("BLUE");
        btnBlue.setForeground(Color.WHITE);
        btnBlue.setOpaque(true);
        btnBlue.setBackground(Color.BLUE);
        this.getContentPane().add(btnBlue);
                btnBlue.addActionListener(this);

        
        btnGreen.setBounds(320,220,100,30);
        btnGreen.setText("GREEN");
        btnGreen.setForeground(Color.WHITE);
        btnGreen.setOpaque(true);
        btnGreen.setBackground(Color.GREEN);
        this.getContentPane().add(btnGreen);
                btnGreen.addActionListener(this);

        

    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnChao) {
            tf.setText("Chu Tuấn Kiệt Xin chào các bạn !");
        }
        if(e.getSource() == btnXoa){
            tf.setText("");
            tf.setBackground(Color.WHITE);
            tf.setOpaque(true);
        }
        if(e.getSource() == btnRed){
            tf.setBackground(Color.red);
            tf.setOpaque(true);
            tieude.setForeground(Color.white);
        }
        
        if(e.getSource() == btnBlue){
            tf.setBackground(Color.BLUE);
            tf.setOpaque(true);
        }
        
        if(e.getSource() == btnGreen){
            tf.setBackground(Color.GREEN);
            tf.setOpaque(true);
        }
        
        if(e.getSource() == btnThoat){
            this.dispose();
        }
    }

    public static void main(String[] args) {
        javaGuiCanBan run = new javaGuiCanBan();
        run.setSize(500,400);
        run.setResizable(false);
    }
}
