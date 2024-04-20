import javax.swing.*;

public class CalculadoraInterface extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    private JButton somaButton, subButton, divButton, multButton, sairButton;

    public CalculadoraInterface() {
        setTitle("Calculadora");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel num1Label = new JLabel("Digite o primeiro valor:");
        num1Label.setBounds(20, 20, 150, 25);
        panel.add(num1Label);

        num1Field = new JTextField();
        num1Field.setBounds(180, 20, 90, 25);
        panel.add(num1Field);

        JLabel num2Label = new JLabel("Digite o segundo valor:");
        num2Label.setBounds(20, 50, 150, 25);
        panel.add(num2Label);

        num2Field = new JTextField();
        num2Field.setBounds(180, 50, 90, 25);
        panel.add(num2Field);

        somaButton = new JButton("Somar");
        somaButton.setBounds(20, 90, 90, 25);
        panel.add(somaButton);

        subButton = new JButton("Subtrair");
        subButton.setBounds(120, 90, 90, 25);
        panel.add(subButton);

        divButton = new JButton("Dividir");
        divButton.setBounds(20, 130, 90, 25);
        panel.add(divButton);

        multButton = new JButton("Multiplicar");
        multButton.setBounds(120, 130, 90, 25);
        panel.add(multButton);

        resultField = new JTextField();
        resultField.setEditable(false);
        resultField.setBounds(20, 170, 250, 25);
        panel.add(resultField);

        add(panel);

        somaButton.addActionListener(e -> {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int resultado = num1 + num2;
            resultField.setText("O resultado da soma é " + resultado);
        });

        subButton.addActionListener(e -> {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int resultado = num1 - num2;
            resultField.setText("O resultado da subtração é " + resultado);
        });

        divButton.addActionListener(e -> {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            if (num2 != 0) {
                double resultado = (double) num1 / num2;
                resultField.setText("O resultado da divisão é " + resultado);
            } else {
                resultField.setText("Erro: Divisão por zero!");
            }
        });

        multButton.addActionListener(e -> {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int resultado = num1 * num2;
            resultField.setText("O resultado da multiplicação é " + resultado);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculadoraInterface calc = new CalculadoraInterface();
            calc.setVisible(true);
        });
    }
}
