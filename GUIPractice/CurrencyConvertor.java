package GUIPractice;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConvertor {
    public static void main(String[] args) {
        //currency convertor
        JFrame frame = new JFrame("Currency Convertor");

        //user to display text msg to user
        JLabel USDLabel = new JLabel("Enter your USD");
        JLabel INRLabel = new JLabel("Enter your INR");
        JTextField USDField = new JTextField();
        JTextField INRField = new JTextField();
        JButton ConvertorButton = new JButton("Convert Currency");
        JLabel resultLabel = new JLabel();

        //to set the position of button of UI component in frame
        USDLabel.setBounds(30,30,130,40);
        USDField.setBounds(180,30,50,40);
        INRLabel.setBounds(30,70,150,40);
        INRField.setBounds(180,70,50,40);
        ConvertorButton.setBounds(30,170,200,40);
        resultLabel.setBounds(30,170,200,40);

        //t0 attach the Ui component to frame
        frame.add(resultLabel);
        frame.add(ConvertorButton);
        frame.add(INRLabel);
        frame.add(USDLabel);
        frame.add(USDField);
        frame.add(INRField);
        frame.add(resultLabel);

        //to set layout null
        frame.setLayout(null);
        frame.setSize(300,300);
        frame.setVisible(true);
        // to click on the Convertor
        ConvertorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float  USD_price = 87.5f;
                float ans = 0;
                float USDValue = Float.parseFloat(USDField.getText());
                ans = USDValue*USD_price;
                resultLabel.setText(String.valueOf(USDValue));
//                CurrencyConvertor.setText(String.valueOf(USDValue));



            }
        });
    }

}
