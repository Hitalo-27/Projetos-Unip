import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame {
    private JTextField cpfTextField;
    private JTextField nomeTextField;
    private JTextField idadeTextField;
    private JTextField cursoTextField;
    private JButton cadastrarButton;

    public Janela() {
        setTitle("CdE");
        setSize(253, 222);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel contentPanel = new JPanel();

        JLabel cpfLabel = new JLabel("CPF:");
        cpfLabel.setBounds(10, 11, 106, 32);
        cpfLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cpfTextField = new JTextField();
        cpfTextField.setBounds(106, 11, 106, 32);
        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setBounds(10, 43, 106, 32);
        nomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nomeTextField = new JTextField();
        nomeTextField.setBounds(106, 43, 106, 32);
        JLabel idadeLabel = new JLabel("Idade:");
        idadeLabel.setBounds(10, 75, 106, 32);
        idadeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        idadeTextField = new JTextField();
        idadeTextField.setBounds(106, 75, 106, 32);
        JLabel cursoLabel = new JLabel("Curso:");
        cursoLabel.setBounds(10, 107, 106, 32);
        cursoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cursoTextField = new JTextField();
        cursoTextField.setBounds(106, 107, 106, 32);
        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setBounds(106, 139, 106, 32);
        contentPanel.setLayout(null);
    
        contentPanel.add(cpfLabel);
        contentPanel.add(cpfTextField);
        contentPanel.add(nomeLabel);
        contentPanel.add(nomeTextField);
        contentPanel.add(idadeLabel);
        contentPanel.add(idadeTextField);
        contentPanel.add(cursoLabel);
        contentPanel.add(cursoTextField);
        JLabel label = new JLabel();
        label.setBounds(0, 128, 106, 32);
        contentPanel.add(label);
        contentPanel.add(cadastrarButton);

        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarEstudante();
            }
        });
        getContentPane().add(contentPanel);

        setVisible(true);
    }

    private void cadastrarEstudante() {
        String cpf = cpfTextField.getText();
        String nome = nomeTextField.getText();
        String idade = idadeTextField.getText();
        String curso = cursoTextField.getText();
        JOptionPane.showMessageDialog(this, "Estudante cadastrado:\nCPF: " + cpf + "\nNome: " + nome + "\nIdade: " + idade + "\nCurso: " + curso);
        cpfTextField.setText("");
        nomeTextField.setText("");
        idadeTextField.setText("");
        cursoTextField.setText("");
    }
}
