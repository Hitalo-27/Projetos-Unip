import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Imc extends JFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Imc frame = new Imc();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Imc() {
        setConfig();
    }

    private void setConfig() {
        this.setTitle("Calcula IMC");
        this.setSize(381, 292);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);

        // Crie uma instância da classe Janela e adicione-a ao content pane do Imc
        Janela imcGUI = new Janela();
        this.getContentPane().add(imcGUI);
    }
}
