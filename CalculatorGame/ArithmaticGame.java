package CalculatorGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ArithmaticGame extends JFrame {
    private JLabel questionLabel;
    private JTextField answerField;
    private JButton submitButton;
    private JLabel timerLabel;
    private JLabel scoreLabel;

    private int num1, num2, score, timeLeft;
    private char operation;
    private double correctAnswer;
    private Timer timer;

    public ArithmaticGame() {
        setTitle("Calculator Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));
        setBackground(new Color(25,0,0));

        questionLabel = new JLabel("", SwingConstants.CENTER);
        questionLabel.setFont(new Font("Helvetica", Font.PLAIN, 18));
        questionLabel.setBackground(new Color(0,0,255));
        add(questionLabel);

        answerField = new JTextField();
        answerField.setFont(new Font("Helvetica", Font.PLAIN, 18));
        answerField.setBackground(new Color(96,96,96));
        add(answerField);

        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Helvetica", Font.PLAIN, 18));
        submitButton.setBackground(new Color(204,0,102));
        add(submitButton);

        timerLabel = new JLabel("30", SwingConstants.CENTER);
        timerLabel.setFont(new Font("Helvetica", Font.PLAIN, 18));
        add(timerLabel);

        scoreLabel = new JLabel("Score: 0", SwingConstants.CENTER);
        scoreLabel.setFont(new Font("Helvetica", Font.PLAIN, 18));
        scoreLabel.setBackground(new Color(204,255,255));
        add(scoreLabel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
            }
        });

        score = 0;
        timeLeft = 30;

        nextQuestion();
    }

    private void nextQuestion() {
        Random random = new Random();
        num1 = random.nextInt(10000) + 1;
        num2 = random.nextInt(10000) + 1;
        operation = "+-*/".charAt(random.nextInt(4));
        switch (operation) {
            case '+':
                correctAnswer = num1 + num2;
                break;
            case '-':
                correctAnswer = num1 - num2;
                break;
            case '*':
                correctAnswer = num1 * num2;
                break;
            case '/':
                correctAnswer = Math.round((num1 / (double) num2) * 100.0) / 100.0;
                break;
        }

        questionLabel.setText(num1 + " " + operation + " " + num2);
        answerField.setText("");
        timeLeft = 30;
        timerLabel.setText(String.valueOf(timeLeft));

        if (timer != null) {
            timer.stop();
        }

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeLeft--;
                timerLabel.setText(String.valueOf(timeLeft));
                if (timeLeft <= 0) {
                    timer.stop();
                    JOptionPane.showMessageDialog(null, "Time's Up! Next question.");
                    nextQuestion();
                }
            }
        });
        timer.start();
    }

    private void checkAnswer() {
        try {
            double answer = Double.parseDouble(answerField.getText());
            if (answer == correctAnswer) {
                score++;
                scoreLabel.setText("Score: " + score);
                JOptionPane.showMessageDialog(null, "Correct! Next question.");
            } else {
                JOptionPane.showMessageDialog(null, "Wrong! The correct answer was " + correctAnswer + ". Next question.");
            }
            nextQuestion();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ArithmaticGame().setVisible(true);
            }
        });
    }
}
