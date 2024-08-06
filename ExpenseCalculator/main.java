package ExpenseCalculator;
import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Expense calculator");

        Font fontDesign = new Font("Arial" , Font.PLAIN , 20);

        JLabel expenseTitleLabel = new JLabel("Expenses");
        expenseTitleLabel.setFont(fontDesign);
        expenseTitleLabel.setForeground(Color.RED);
        expenseTitleLabel.setBounds(220,20,100,30);
        frame.add(expenseTitleLabel);

        JLabel expense_type = new JLabel("Expense Type");
        expense_type.setFont(fontDesign);
        expense_type.setBounds(20 , 50 ,100, 30);
        frame.add(expense_type);

        JLabel expenseAmountLabel = new JLabel("Expense Amount");
        expenseAmountLabel.setFont(fontDesign);
        expenseAmountLabel.setBounds(20 , 80 , 100,30);
        frame.add(expenseAmountLabel);

        JTextField expenseAmountInput = new JTextField();
        expenseAmountInput.setBounds(140 , 80,100,30);
        frame.add(expenseAmountInput);

        JTextField expenseTypeInput = new JTextField();
        expenseTypeInput.setBounds(140 , 50,100,30);
        frame.add(expenseTypeInput);

        JLabel incomeTitleLabel = new JLabel("Income");
        incomeTitleLabel.setForeground(Color.GREEN);
        incomeTitleLabel.setBounds(225 ,110 , 100 , 30);
        frame.add(incomeTitleLabel);

        JLabel addIncomeLabel = new JLabel("Add Income");
        addIncomeLabel.setBounds(20, 140, 100, 30);
        frame.add(addIncomeLabel);

        JTextField addIncomeInput = new JTextField();
        addIncomeInput.setBounds(140 ,140 ,100, 30);
        frame.add(addIncomeInput);

        frame.setSize(500 ,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}