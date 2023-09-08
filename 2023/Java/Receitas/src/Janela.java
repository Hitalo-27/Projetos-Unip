import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Janela extends JFrame {
    private JTextField nomeReceitaTextField;
    private JTextArea ingredientesTextArea;
    private JButton cadastrarButton;
    private JTextArea receitasCadastradasTextArea;
    private List<String> receitas;

    public Janela() {
        setTitle("Livro de Receitas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(2, 1));
        contentPanel.setBackground(new Color(240, 240, 240)); 

        JPanel insercaoPanel = new JPanel();
        insercaoPanel.setLayout(new GridLayout(3, 2));
        insercaoPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel nomeReceitaLabel = new JLabel("Nome da Receita:");
        nomeReceitaTextField = new JTextField();
        JLabel ingredientesLabel = new JLabel("Ingredientes:");
        ingredientesTextArea = new JTextArea(5, 20);
        JScrollPane ingredientesScrollPane = new JScrollPane(ingredientesTextArea);
        
        cadastrarButton = new JButton("Cadastrar");
        JPanel centralizarButtonPanel = new JPanel();
        centralizarButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        centralizarButtonPanel.add(cadastrarButton);

        insercaoPanel.add(nomeReceitaLabel);
        insercaoPanel.add(nomeReceitaTextField);
        insercaoPanel.add(ingredientesLabel);
        insercaoPanel.add(ingredientesScrollPane);
        insercaoPanel.add(new JLabel());
        insercaoPanel.add(centralizarButtonPanel);

        JPanel exibicaoPanel = new JPanel();
        exibicaoPanel.setLayout(new BorderLayout());
        exibicaoPanel.setBackground(new Color(255, 255, 255)); 
        exibicaoPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); 

        JLabel receitasLabel = new JLabel("Últimas Receitas Cadastradas:");
        receitasCadastradasTextArea = new JTextArea(10, 40);
        receitasCadastradasTextArea.setEditable(false);
        JScrollPane receitasScrollPane = new JScrollPane(receitasCadastradasTextArea);
        exibicaoPanel.add(receitasLabel, BorderLayout.NORTH);
        exibicaoPanel.add(receitasScrollPane, BorderLayout.CENTER);

        contentPanel.add(insercaoPanel);
        contentPanel.add(exibicaoPanel);

        receitas = new ArrayList<>();

        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarReceita();
            }
        });

        add(contentPanel);

        setLocationRelativeTo(null);
    }

    private void cadastrarReceita() {
        String nomeReceita = nomeReceitaTextField.getText();
        String ingredientes = ingredientesTextArea.getText();

        receitas.add(nomeReceita + "\nIngredientes:\n" + ingredientes);

        nomeReceitaTextField.setText("");
        ingredientesTextArea.setText("");

        atualizarReceitasCadastradas();
    }

    private void atualizarReceitasCadastradas() {
        receitasCadastradasTextArea.setText("");
        for (String receita : receitas) {
            receitasCadastradasTextArea.append(receita + "\n\n");
        }
    }
 
}
