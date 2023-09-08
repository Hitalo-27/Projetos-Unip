import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Janela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValorTotal;
	private JTextField txtDesconto;
	private JTextField txtTotalDsc;
	private JTextField txtValorP;
	private JTextField txtTroco;


	public Janela() {
		DecimalFormat df = new DecimalFormat("0.00");
		DateTimeFormatter dataF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 535, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel datalabel = new JLabel("blankdata");
		datalabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		datalabel.setBounds(10, 11, 156, 14);
		contentPane.add(datalabel);
		datalabel.setText("DATA: " + dataF.format(now));
		
		JLabel labelcaixa = new JLabel("CAIXA");
		labelcaixa.setFont(new Font("Arial Black", Font.PLAIN, 14));
		labelcaixa.setBounds(201, 13, 156, 14);
		contentPane.add(labelcaixa);
		
		JLabel LblValorTotal = new JLabel("Valor Total");
		LblValorTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		LblValorTotal.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LblValorTotal.setBounds(10, 70, 168, 23);
		contentPane.add(LblValorTotal);
		
		JLabel lblDesconto = new JLabel("Desconto");
		lblDesconto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDesconto.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDesconto.setBounds(10, 118, 168, 23);
		contentPane.add(lblDesconto);
		
		JLabel LblValorP = new JLabel("Valor Pago");
		LblValorP.setHorizontalAlignment(SwingConstants.RIGHT);
		LblValorP.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LblValorP.setBounds(10, 201, 168, 23);
		contentPane.add(LblValorP);
		
		JLabel LblTotalDsc = new JLabel("Total com Desconto");
		LblTotalDsc.setHorizontalAlignment(SwingConstants.RIGHT);
		LblTotalDsc.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LblTotalDsc.setBounds(10, 161, 168, 23);
		contentPane.add(LblTotalDsc);
		
		JLabel LblTroco = new JLabel("Troco");
		LblTroco.setHorizontalAlignment(SwingConstants.RIGHT);
		LblTroco.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LblTroco.setBounds(10, 241, 168, 23);
		contentPane.add(LblTroco);
		
		txtValorTotal = new JTextField();
		txtValorTotal.setBounds(201, 72, 86, 20);
		contentPane.add(txtValorTotal);
		txtValorTotal.setColumns(10);
		
		txtDesconto = new JTextField();
		txtDesconto.setColumns(10);
		txtDesconto.setBounds(201, 120, 86, 20);
		contentPane.add(txtDesconto);
		
		txtTotalDsc = new JTextField();
		txtTotalDsc.setColumns(10);
		txtTotalDsc.setBounds(201, 163, 86, 20);
		contentPane.add(txtTotalDsc);
		
		txtValorP = new JTextField();
		txtValorP.setColumns(10);
		txtValorP.setBounds(201, 203, 86, 20);
		contentPane.add(txtValorP);
		
		txtTroco = new JTextField();
		txtTroco.setColumns(10);
		txtTroco.setBounds(201, 243, 86, 20);
		contentPane.add(txtTroco);
		
		JButton btncalcular = new JButton("");
		btncalcular.setIcon(new ImageIcon("src/img/calc.png"));
		btncalcular.setBounds(356, 38, 115, 115);
		contentPane.add(btncalcular);
		
		JButton btnlimpar = new JButton("");
		btnlimpar.setBounds(356, 169, 115, 115);
		btnlimpar.setIcon(new ImageIcon("src/img/vass.png"));
		contentPane.add(btnlimpar);
		
		btncalcular.addActionListener(e -> {
			int V = Integer.parseInt(txtValorTotal.getText());
			int dsc = Integer.parseInt(txtDesconto.getText());
			double dscDecimal = dsc/100.0;
			double dscR = 1 - dscDecimal;
			double Totaldsc = V * dscR;
			String TotaldscS = String.valueOf(df.format(Totaldsc));
			txtTotalDsc.setText(TotaldscS);
			
			int VP = Integer.parseInt(txtValorP.getText());
			double Troco = VP - Totaldsc;
			String TrocoR = String.valueOf(df.format(Troco));
			txtTroco.setText(TrocoR);
			
			
		});
		
		btnlimpar.addActionListener(e -> {
			txtValorTotal.setText("");
			txtDesconto.setText("");
			txtTotalDsc.setText("");
			txtValorP.setText("");
			txtTroco.setText("");
		});
		
		this.setLocationRelativeTo(null);
		
	}
}
