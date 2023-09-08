import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Questions extends JFrame {

    private JPanel contentPane;
    int score = 0;
    int rounds = 1;
    String titleButon;
   

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Questions frame = new Questions();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    public Questions() {
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 546, 300);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        ButtonGroup buttonGroup = new ButtonGroup();

        JRadioButton answer1 = new JRadioButton("Estrela");
        answer1.setBounds(48, 44, 335, 23);
        contentPane.add(answer1);

        JRadioButton answer2 = new JRadioButton("Planeta");
        answer2.setBounds(48, 85, 336, 23);
        contentPane.add(answer2);

        JRadioButton answer3 = new JRadioButton("Galaxia");
        answer3.setBounds(48, 134, 335, 23);
        contentPane.add(answer3);

        JRadioButton answer4 = new JRadioButton("Gigante vermelho");
        answer4.setBounds(48, 179, 335, 23);
        contentPane.add(answer4);
        
        buttonGroup.add(answer1);
        buttonGroup.add(answer2);
        buttonGroup.add(answer3);
        buttonGroup.add(answer4);

        if (rounds <= 4) {
            titleButon = "Próximo";
        } else {
            titleButon = "Ver resultado";
        }

        JButton nextButon = new JButton(titleButon);
        nextButon.setBounds(145, 227, 144, 23);
        contentPane.add(nextButon);

        JLabel lblNewLabel = new JLabel("O Sol é uma:");
        lblNewLabel.setBounds(10, 11, 510, 26);
        contentPane.add(lblNewLabel);

        nextButon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rounds == 1) {
                    if (answer1.isSelected()) {
                        score = score + 1;
                        
                        FrameNextStep nextStep  = new FrameNextStep("Você acertou!", "Próximo");
                        nextStep.setVisible(true);
                    } else {
                    	FrameNextStep nextStep  = new FrameNextStep("Você errou!", "Próximo");
                        nextStep.setVisible(true);
                    }
                    
                    rounds = rounds + 1;
                    
                    lblNewLabel.setText("O que é uma singularidade?");
                    answer1.setText("Um ponto de matéria negra no universo");
                    answer2.setText("A união de duas supernovas");
                    answer3.setText("A planeta de gravidade zero");;
                    answer4.setText("Um ponto de massa infinito em uma área nula");
                    
                    return;
                }   
                
                if (rounds == 2) {
                    if (answer4.isSelected()) {
                        score = score + 1;
                        
                        FrameNextStep nextStep  = new FrameNextStep("Você acertou!", "Próximo");
                        nextStep.setVisible(true);
                    } else {
                    	FrameNextStep nextStep  = new FrameNextStep("Você errou!", "Próximo");
                        nextStep.setVisible(true);
                    }
                    
                    rounds = rounds + 1;
                    
                    lblNewLabel.setText("O que causa as estações do ano na Terra?");
                    answer1.setText("A atividade solar");
                    answer2.setText("A distância da Terra ao Sol");
                    answer3.setText("A rotação da Lua ao redor da Terra");;
                    answer4.setText("A inclinação do eixo da Terra em relação ao plano de sua órbita");
          
                    return;
                }
                
                if (rounds == 3) {
                    if (answer4.isSelected()) {
                        score = score + 1;
                        
                        FrameNextStep nextStep  = new FrameNextStep("Você acertou!", "Próximo");
                        nextStep.setVisible(true);
                    } else {
                    	FrameNextStep nextStep  = new FrameNextStep("Você errou!", "Próximo");
                        nextStep.setVisible(true);
                    }
                    
                    rounds = rounds + 1;
                    
                    lblNewLabel.setText("Qual é processo pelo qual as estrelas convertem hidrogênio em hélio e liberam energia?");
                    answer1.setText("Fissão nuclear");
                    answer2.setText("Fusão nuclear");
                    answer3.setText("Sublimação");;
                    answer4.setText("Combustão");
                    
                    return;
                }
                
                if (rounds == 4) {
                    if (answer2.isSelected()) {
                        score = score + 1;
                        
                        FrameNextStep nextStep  = new FrameNextStep("Você acertou!", "Próximo");
                        nextStep.setVisible(true);
                    } else {
                    	FrameNextStep nextStep  = new FrameNextStep("Você errou!", "Próximo");
                        nextStep.setVisible(true);
                    }
                    
                    rounds = rounds + 1;
                    
                    lblNewLabel.setText("Qual é a galáxia mais próxima da Via Láctea?");
                    answer1.setText("Galáxia de Andrômeda");
                    answer2.setText("Galáxia do Triângulo");
                    answer3.setText("Galáxia de Sombrero");;
                    answer4.setText("Galáxia do Redemoinho");
                    
                    return;
                }
                
                if (rounds == 5) {
                    if (answer1.isSelected()) {
                        score = score + 1;
                        
                        FrameNextStep nextStep  = new FrameNextStep("Você acertou!", "Próximo");
                        nextStep.setVisible(true);
                    } else {
                    	FrameNextStep nextStep  = new FrameNextStep("Você errou!", "Próximo");
                        nextStep.setVisible(true);
                    }
                    
                    FrameScore finished = new FrameScore(score);
                    finished.setVisible(true);
                    
                    return;
                }
            }
        });
    }
}
