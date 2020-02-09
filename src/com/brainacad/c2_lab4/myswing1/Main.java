package com.brainacad.c2_lab4.myswing1;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by SHARK on 13.05.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        MyApp myApp = new MyApp("My Application");
        myApp.myControls();
        myApp.validate();
    }
}

class MyApp  extends JFrame{

    public void myControls() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2,2,10,10));
        JTextField jtf = new JTextField();
        JTextField jtf2 = new JTextField();
        JButton getUserName = new JButton("Get User Name");
        JButton getCompName = new JButton("Get Comp Name");
        jtf.setPreferredSize(new Dimension(200, 30));
        jtf2.setPreferredSize(new Dimension(200, 30));
        jPanel.add(jtf);
        jPanel.add(getUserName);
        jPanel.add(jtf2);
        jPanel.add(getCompName);
        this.add(jPanel);

    }



    public MyApp(String name) throws HeadlessException {
        super(name);
        this.setSize(400,100);
        this.setLocation(300,300);
        this.setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}