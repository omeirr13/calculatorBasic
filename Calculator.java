import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame
{
    JLabel firstNumL,secNumL,resultL;
    JTextField firstNumT,secNumT;
    JButton addB;
    JButton subtractB;
    JButton divideB;
    JButton multiplyB;

    Calculator(String s)
    {
        super(s);
        initComponents();        
    }

    private void initComponents()
    {
        //labels
        firstNumL = new JLabel();        
        secNumL = new JLabel();        
        resultL = new JLabel();        
    
        //text fields
        firstNumT = new JTextField();
        secNumT = new JTextField();
    
        //buttons
        addB = new JButton();
        subtractB = new JButton();
        divideB = new JButton();
        multiplyB = new JButton();

        setLayout(null);
        firstNumL.setText("Enter first number: ");
        firstNumL.setBounds(10, 30, 200, 20);
        firstNumL.setFont(new java.awt.Font("Times New Roman", 1, 20));
        
        firstNumT.setBounds(10, 60, 200, 20);
        firstNumT.setFont(new java.awt.Font("Times New Roman", 1, 20));

        secNumL.setText("Enter second number: ");
        secNumL.setBounds(10, 90, 200, 20);
        secNumL.setFont(new java.awt.Font("Times New Roman", 1, 20));
        
        secNumT.setBounds(10, 120, 200, 20);
        secNumT.setFont(new java.awt.Font("Times New Roman", 1, 20));
        
        addB.setText("+");
        addB.setBounds(10, 150, 50, 40);
        addB.setFont(new java.awt.Font("Times New Roman", 1, 20));
        
        subtractB.setText("-");
        subtractB.setBounds(70, 150, 50, 40);
        subtractB.setFont(new java.awt.Font("Times New Roman", 1, 20));

        multiplyB.setText("*");
        multiplyB.setBounds(130, 150, 50, 40);
        multiplyB.setFont(new java.awt.Font("Times New Roman", 1, 20));

        divideB.setText("/");
        divideB.setBounds(190, 150, 50, 40);
        divideB.setFont(new java.awt.Font("Times New Roman", 1, 20));
        
        resultL.setBounds(10, 210, 200, 20);
        resultL.setFont(new java.awt.Font("Times New Roman", 1, 20));
        
        //labels
        add(firstNumL);
        add(secNumL);
        add(resultL);
    
        //text fields
        add(firstNumT);
        add(secNumT);

        //buttons
        add(addB);
        add(subtractB);
        add(divideB);
        add(multiplyB);

        //event handlers

        addB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                int a = Integer.parseInt(firstNumT.getText());      
                int b = Integer.parseInt(secNumT.getText());      
                resultL.setText("Result is: " + (a + b));
            }
        });

        subtractB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                int a = Integer.parseInt(firstNumT.getText());      
                int b = Integer.parseInt(secNumT.getText());      
                resultL.setText("Result is: " + (a - b));
            }
        });

        multiplyB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                int a = Integer.parseInt(firstNumT.getText());      
                int b = Integer.parseInt(secNumT.getText());      
                resultL.setText("Result is: " + (a * b));
            }
        });

        divideB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                int a = Integer.parseInt(firstNumT.getText());      
                int b = Integer.parseInt(secNumT.getText());      
                resultL.setText("Result is: " + (a / b));
            }
        });
    }
    public static void main(String[] args) 
    {
        Calculator calc = new Calculator("Calculator");
        calc.setVisible(true);
        calc.setSize(300,300);
    }

}