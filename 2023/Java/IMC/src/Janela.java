import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Janela extends JPanel {
    private JTextField edtPeso;
    private JTextField edtAltura;
    private JButton btnCalcula;
    private JLabel lblPeso;
    private JLabel lblAltura;
    private JLabel lblResultado;

    public Janela() {
        setConfig();
    }

    private void setConfig() {
        setLayout(null); // Defina o layout como nulo para posicionar manualmente os componentes

        edtPeso = new JTextField();
        edtPeso.setBounds(139, 13, 154, 27);

        edtAltura = new JTextField();
        edtAltura.setBounds(139, 54, 154, 24);

        btnCalcula = new JButton("Calcular");
        btnCalcula.setBounds(96, 104, 172, 27);

        lblPeso = new JLabel("Peso:");
        lblPeso.setBounds(80, 13, 39, 27);

        lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(80, 53, 39, 27);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
        lblResultado.setBounds(37, 162, 291, 27);

        btnCalcula.addActionListener(new EventoCalculaIMC());

        // Adicione os componentes ao JPanel
        add(lblPeso);
        add(lblAltura);
        add(edtPeso);
        add(edtAltura);
        add(lblResultado);
        add(btnCalcula);
    }

    class EventoCalculaIMC implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double peso = Double.parseDouble(edtPeso.getText());
                double altura = Double.parseDouble(edtAltura.getText());
                String resultado = Calcula.calcularIMC(peso, altura);
                lblResultado.setText(resultado);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, insira valores válidos para peso e altura.");
            } catch (ArithmeticException ar) {
                JOptionPane.showMessageDialog(null, "Erro aritmético, causa: " + ar.getMessage());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro desconhecido, causa: " + ex.getMessage());
            }
        }
    }
}
