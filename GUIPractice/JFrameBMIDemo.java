package GUIPractice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameBMIDemo {
    public static void main(String[] args) {
        System.out.println("jFrame is used to build GUI Java application");
        JFrame jframe = new JFrame("BMI calculator");
        //to get the input from the user JTextField
        //to display the message to user JLabel;
        //to perform any action by click on the button JButton

        JLabel userWeightLabel = new JLabel("Enter your weight in kg");
        userWeightLabel.setBounds(40,40,200,40);
        JTextField userWeightTextField = new JTextField("0");
        userWeightTextField.setBounds(250,40,60,40);

        //user heigth

        JLabel userHeightLabel = new JLabel("Enter your Height in m");
        userHeightLabel.setBounds(40,80,250,40);
        JTextField userHeightTextField = new JTextField("0");
        userHeightTextField.setBounds(250,80,60,40);

        JButton CalculateBmi = new JButton("Calculate BMI");
        CalculateBmi.setBounds(200,250,150,50);

        //to add click on the button
        CalculateBmi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float weight = Float.parseFloat(userWeightTextField.getText().toString());
                float height = Float.parseFloat(userHeightTextField.getText().toString());
                float BmiValue = weight/(height*height);
                CalculateBmi.setText(String.valueOf(BmiValue));

            }
        });


        jframe.add(userWeightLabel);
        jframe.add(userWeightTextField);



        jframe.add(userHeightLabel);
        jframe.add(userHeightTextField);

        jframe.add(CalculateBmi);
        //to click on the button

        //logic  bmi calculator user height in m and user weight kg
        //formula weight /(height * height)
        //to use defualt layout
        jframe.setLayout(null);
        jframe.setSize(500,500);
        //set visible the frame
        jframe.setVisible(true);

    }
}