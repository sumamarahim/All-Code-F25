import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Test extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, resultField;
    private JButton addBtn, subBtn, mulBtn, divBtn;
    public Test() {
        setTitle("Simple Calc - Test");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // create components
        JLabel num1Label = new JLabel("Num 1");
        num1Field = new JTextField(10);

        JLabel num2Label = new JLabel("Num 2");
        num2Field = new JTextField(10);

        JLabel resultLabel = new JLabel("Result");
        resultField = new JTextField(10);
        resultField.setEditable(false); // user can't edit the results
        
        // action listeners
        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");

        addBtn.setActionCommand("+");
        subBtn.setActionCommand("-");
        mulBtn.setActionCommand("*");
        divBtn.setActionCommand("/");

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);

        // layout
        JPanel panel = new JPanel(new GridLayout(4, 2, 2, 4));
        panel.add(num1Label); panel.add(num1Field);
        panel.add(num2Label); panel.add(num2Field);
        panel.add(resultLabel); panel.add(resultField);
        
        JPanel btnPanel = new JPanel (new FlowLayout());
        btnPanel.add(addBtn);
        btnPanel.add(subBtn);
        btnPanel.add(mulBtn);
        btnPanel.add(divBtn);

        add(panel, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);   
    }

    // @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;

            if (e.getSource() == addBtn) result = num1 + num2;
            else if (e.getSource() == subBtn) result = num1 - num2;
            else if (e.getSource() == mulBtn) result = num1 * num2;
            else if (e.getSource() == divBtn) 
            {
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                result = num1 / num2;
            }
            resultField.setText(String.format("%.2f", result));            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!", "Input Error", JOptionPane.WARNING_MESSAGE);

        }
    }

    public static void main(String... agrs) {
        SwingUtilities.invokeLater(() -> {
            new Test().setVisible(true);
        });
    }

}