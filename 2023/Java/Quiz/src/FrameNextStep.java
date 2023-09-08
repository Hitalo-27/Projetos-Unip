import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class FrameNextStep extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public FrameNextStep(String title, String titleButton) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(title);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(74, 33, 291, 42);
		contentPane.add(lblNewLabel);
		
		JButton nextStepGame = new JButton(titleButton);
		nextStepGame.setBounds(141, 138, 151, 37);
		contentPane.add(nextStepGame);
		
		nextStepGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
            }
        });
	}
}
