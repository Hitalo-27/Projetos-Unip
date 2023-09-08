import java.awt.*;


public class Principal extends Canvas{

	public static void main(String[] args) {
	Frame frame = new Frame("Desenho do Mickey");
	Canvas canvas = new Principal();
	frame.add(canvas);
	frame.setSize(400,400);
	frame.setVisible(true);
	frame.setLocationRelativeTo(null);
	Janela trataEvento = new Janela();
	frame.addWindowListener(trataEvento);
	}

	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(133, 150, 133, 133);
		g.fillOval(100, 120, 66, 66);
		g.fillOval(233, 120, 66, 66);
		
	}
}
