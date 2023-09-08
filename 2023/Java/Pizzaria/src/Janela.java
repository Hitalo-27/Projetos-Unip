import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame{
	
	JLabel labelTopping;
	JCheckBox queijo;
	JCheckBox pepperoni;
	JCheckBox cogumelo;
	JCheckBox frango;
	JCheckBox catupiri;
	JCheckBox cebola;

	public Janela() {
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,1));
		panel.add(labelTopping = new JLabel("Selecione os ingredientes:"));
		panel.add(queijo = new JCheckBox("Queijo"));
		panel.add(pepperoni = new JCheckBox("Pepperoni"));
		panel.add(cogumelo = new JCheckBox("Cogumelo"));
		panel.add(frango = new JCheckBox("Frango"));
		panel.add(catupiri = new JCheckBox("Catupiri"));
		panel.add(cebola = new JCheckBox("Cebola"));

		JButton botao = new JButton("Fazer Pedido");
		
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StringBuilder orderDetails = new StringBuilder("Pedido: \n");
				if (queijo.isSelected()) {
					orderDetails.append("Queijo\n");
				}
				if (pepperoni.isSelected()) {
					orderDetails.append("Pepperoni\n");
				}
				if (cogumelo.isSelected()) {
					orderDetails.append("Cogumelo\n");
				}
				if (frango.isSelected()) {
					orderDetails.append("Frango\n");
				}
				if (catupiri.isSelected()) {
					orderDetails.append("Catupiri\n");
				}
				if (cebola.isSelected()) {
					orderDetails.append("Cebola\n");
				}
				if (orderDetails.toString().equals("Pedido: ")) {
					orderDetails.append("Nenhum ingrediente selecionado");
				}
				JOptionPane.showMessageDialog(panel,orderDetails.toString()); // // // // // // // // // // // // // // // // // // // // // // 
			}
		});
		
		this.setLayout(new BorderLayout());
		this.add(panel, BorderLayout.CENTER);
		this.add(botao, BorderLayout.SOUTH);
		
		this.add(panel);
		this.setSize(400,300);
		this.setTitle("Sistemas de Pedidos da Pizzaria");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
	
}
