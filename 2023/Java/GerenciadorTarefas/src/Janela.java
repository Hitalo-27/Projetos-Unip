import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame{
	
	JTextField textField;
	JButton addButton;
	JButton rmvButton;

	public Janela() {
		
		DefaultListModel<String> listModel = new DefaultListModel<>();
		JList<String> list = new JList<>(listModel);
		
		textField = new JTextField(20);
		addButton = new JButton("Adicionar Tarefa");
		rmvButton = new JButton("Remover Tarefa");
		
		addButton.addActionListener(e -> {
			String task = textField.getText();
			listModel.addElement(task);
			textField.setText("");
		});
		
		rmvButton.addActionListener(e -> {
			int selectedIndex = list.getSelectedIndex();
			if (selectedIndex != -1) {
				listModel.remove(selectedIndex);
			}
		});
		
		JPanel controlPanel = new JPanel();
		controlPanel.add(textField);
		controlPanel.add(addButton);
		controlPanel.add(rmvButton);
		
		
		
		this.setLayout(new BorderLayout());
		this.add(new JScrollPane(list), BorderLayout.CENTER);
		this.add(controlPanel, BorderLayout.SOUTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Gerenciador de Tarefas");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		
	}
	
}
