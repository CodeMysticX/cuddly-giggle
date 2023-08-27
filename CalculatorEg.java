import java.awt.*;
import java.awt.dnd.DragSource;
import java.awt.event.*;
public class CalculatorEg {
    private Frame frame;
    private TextField textField;
    private String operator;
    private double operand1;
    private boolean isOperatorClicked;

    public CalculatorEg() {
        frame = new Frame("Calculator");
        textField = new TextField();
        operator = "";
        operand1 = 0.0;
        isOperatorClicked = false;
    }
    public void createUI() {
        frame.setLayout(new BorderLayout());
        textField.setEditable(false);
        frame.add(textField, BorderLayout.NORTH);
        Panel buttonPanel = new Panel(new GridLayout(4, 4));
        frame.add(buttonPanel, BorderLayout.CENTER);
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button btnPlus = new Button("+");
        Button btnMinus = new Button("-");
        Button btnMultiply = new Button("*");
        Button btnDivide = new Button("/");
        Button btnEquals = new Button("=");
        Button btnClear = new Button("C");

        buttonPanel.add(btn7);
        buttonPanel.add(btn8);
        buttonPanel.add(btn9);
        buttonPanel.add(btnDivide);
        buttonPanel.add(btn4);
        buttonPanel.add(btn5);
        buttonPanel.add(btn6);
        buttonPanel.add(btnMultiply);
        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);
        buttonPanel.add(btnMinus);
        buttonPanel.add(btn0);
        buttonPanel.add(btnClear);
        buttonPanel.add(btnEquals);
        buttonPanel.add(btnPlus);
       
        frame.pack();
        frame.setVisible(true);
       
 // Event Listeners
        ActionListener numberListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Button btn = (Button) e.getSource();
                String buttonText = btn.getLabel();
                textField.setText(textField.getText() + buttonText);
            }
        };
	 ActionListener operatorListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Button btn = (Button) e.getSource();
                String buttonText = btn.getLabel();
                if (isOperatorClicked) {
                    evaluate();
                } else {
                    operand1 = Double.parseDouble(textField.getText());
                }
                operator = buttonText;
                isOperatorClicked = true;
                textField.setText("");
            }
        };
        ActionListener equalsListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evaluate();
                operator = "";
                isOperatorClicked = false;
            }
        };
        ActionListener clearListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand1 = 0.0;
                operator = "";
                isOperatorClicked = false;
                textField.setText("");
            }
        };
        btn0.addActionListener(numberListener);
        btn1.addActionListener(numberListener);
        btn2.addActionListener(numberListener);
        btn3.addActionListener(numberListener);
        btn4.addActionListener(numberListener);
        btn5.addActionListener(numberListener);
        btn6.addActionListener(numberListener);
        btn7.addActionListener(numberListener);
        btn8.addActionListener(numberListener);
        btn9.addActionListener(numberListener);
        btnPlus.addActionListener(operatorListener);
        btnMinus.addActionListener(operatorListener);
        btnMultiply.addActionListener(operatorListener);
        btnDivide.addActionListener(operatorListener);
        btnEquals.addActionListener(equalsListener);
        btnClear.addActionListener(clearListener);
    }
  

  private void evaluate() {
        double operand2 = Double.parseDouble(textField.getText());
        double result = 0.0;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    textField.setText("Error: Division by zero");
                    return;
                }
                break;
        }
        textField.setText(Double.toString(result));
    }

    public static void main(String[] args) {
        CalculatorEg calculator = new CalculatorEg();
        calculator.createUI();
    }
}
