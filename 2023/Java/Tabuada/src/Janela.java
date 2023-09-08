import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;


public class Janela extends JFrame {

	private JTextField numeroTextField;
    private JTextArea tabuadaTextArea;

    public Janela() {
        setTitle("Calculadora de Tabuada");
        setSize(250, 331);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        JLabel numeroLabel = new JLabel("Número:");
        numeroLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        numeroTextField = new JTextField(10);

        inputPanel.add(numeroLabel);
        inputPanel.add(numeroTextField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton calcularButton = new JButton("Tabuada");
        calcularButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        JButton limparButton = new JButton("Limpar");
        limparButton.setFont(new Font("Tahoma", Font.BOLD, 14));

        calcularButton.addActionListener(new CalcularButtonListener());
        limparButton.addActionListener(new LimparButtonListener());

        buttonPanel.add(calcularButton);
        buttonPanel.add(limparButton);

        tabuadaTextArea = new JTextArea(10, 17);
        tabuadaTextArea.setFont(new Font("Arial", Font.BOLD, 14));
        JScrollPane scrollPane = new JScrollPane(tabuadaTextArea);
        
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        getContentPane().add(mainPanel);
    }

    private class CalcularButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            tabuadaTextArea.setText("");

            try {
                int numero = Integer.parseInt(numeroTextField.getText());

                for (int i = 1; i <= 10; i++) {
                    int resultado = numero * i;
                    tabuadaTextArea.append(numero + " x " + i + " = " + resultado + "\n");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(Janela.this, "Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class LimparButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numeroTextField.setText("");
            tabuadaTextArea.setText("");
        }
    }

    

}
