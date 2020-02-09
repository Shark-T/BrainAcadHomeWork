package com.brainacad.c2_lab4.myswing;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by SHARK on 07.05.2017.
 */
public class MyApplication  extends JFrame{

    String items[] = {"calculator","notepad", "paint"};

    public void createControlsRun() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        JLabel jl = new JLabel("Run a program");
        JComboBox jcb = new JComboBox(items);
        jcb.setPreferredSize(new Dimension(200, 30));
        JButton jb = new JButton("RUN >");
        jPanel.add(jl);
        jPanel.add(jcb);
        jPanel.add(jb);
        this.add(jPanel);
        jb.addActionListener( e -> {
            String chosenItem = (String) jcb.getSelectedItem();
            try {
                runApp(chosenItem);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }

    public void runApp(String chosenItem) throws IOException {

       if (chosenItem == "calculator"){ Runtime.getRuntime().exec("calc.exe");}
       else if (chosenItem == "notepad"){ Runtime.getRuntime().exec("notepad.exe");}
       else { Runtime.getRuntime().exec("mspaint.exe");}

    }

    public MyApplication(String title) throws HeadlessException {
        super(title);
        Image image = Toolkit.getDefaultToolkit().getImage("shark.jpg");
        this.setSize(400,100);
        this.setLocation(300,300);
        this.setVisible(true);
        this.setIconImage(image);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
