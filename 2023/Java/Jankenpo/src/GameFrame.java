import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GameFrame extends JFrame implements ActionListener {
    private JLabel resultLabel, winnerImageLabel;
    private JButton rockButton, paperButton, scissorsButton;
    private JPanel buttonsPanel;
    private Map<String, ImageIcon> choiceToImageMap;
    private Random random;
    private int playerWins = 0;
    private int computerWins = 0;
    private int draws = 0;
    private JLabel listWins = new JLabel("<html>Jogador: 0 vitórias <br> Computador: 0 vitórias <br> Empates: 0</html>");

    public GameFrame() {
        setTitle("Pedra, Papel e Tesoura");
        setSize(700, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setResizable(false);

        resultLabel = new JLabel("Escolha uma opção.");
        resultLabel.setBounds(52, 67, 599, 294);
        winnerImageLabel = new JLabel("", JLabel.CENTER);
        winnerImageLabel.setBounds(205, 123, 252, 173);

        buttonsPanel = new JPanel();
        buttonsPanel.setBounds(0, 0, 197, 361);

        rockButton = new JButton(resizeImageIcon(new ImageIcon("src/img/stone.png"), 80, 80));
        rockButton.setBounds(10, 10, 187, 100);
        paperButton = new JButton(resizeImageIcon(new ImageIcon("src/img/paper.png"), 80, 80));
        paperButton.setBounds(10, 127, 187, 100);
        scissorsButton = new JButton(resizeImageIcon(new ImageIcon("src/img/scissor.png"), 80, 80));
        scissorsButton.setBounds(10, 250, 187, 100);

        rockButton.addActionListener(this);
        paperButton.addActionListener(this);
        scissorsButton.addActionListener(this);
        buttonsPanel.setLayout(null);

        buttonsPanel.add(rockButton);
        buttonsPanel.add(paperButton);
        buttonsPanel.add(scissorsButton);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.add(buttonsPanel);

        JPanel textPanel = new JPanel();
        textPanel.setBounds(197, 0, 487, 361);
        textPanel.setLayout(null);
        textPanel.add(resultLabel);
        listWins.setBounds(52, 11, 599, 45);
        textPanel.add(listWins);
        textPanel.add(winnerImageLabel);
        mainPanel.add(textPanel);

        getContentPane().add(mainPanel);

        random = new Random();

        choiceToImageMap = new HashMap<>();
        choiceToImageMap.put("Pedra", resizeImageIcon(new ImageIcon("src/img/stone.png"), 100, 100));
        choiceToImageMap.put("Papel", resizeImageIcon(new ImageIcon("src/img/paper.png"), 100, 100));
        choiceToImageMap.put("Tesoura", resizeImageIcon(new ImageIcon("src/img/scissor.png"), 100, 100));
        choiceToImageMap.put("Empate", resizeImageIcon(new ImageIcon("src/img/draw.png"), 100, 100));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String userChoice = getChoiceFromButton(clickedButton);
        String computerChoice = getComputerChoice();

        String result = determineWinner(userChoice, computerChoice);

        ImageIcon winnerImage = choiceToImageMap.get(result);
        winnerImageLabel.setIcon(winnerImage);

        resultLabel.setText("<html>Você escolheu: " + userChoice + ". <br>Computador escolheu: " + computerChoice + ". <br> Vencedor: " + result + "</html>");
    }

    private String getChoiceFromButton(JButton button) {
        if (button == rockButton) {
            return "Pedra";
        } else if (button == paperButton) {
            return "Papel";
        } else if (button == scissorsButton) {
            return "Tesoura";
        }
        return "";
    }

    private String getComputerChoice() {
        int choice = random.nextInt(3);
        if (choice == 0) return "Pedra";
        if (choice == 1) return "Papel";
        return "Tesoura";
    }

    private String determineWinner(String userChoice, String computerChoice) {
        String result;
        if (userChoice.equals(computerChoice)) {
            result = "Empate";
            draws++;
        } else if (
            (userChoice.equals("Pedra") && computerChoice.equals("Tesoura")) ||
            (userChoice.equals("Papel") && computerChoice.equals("Pedra")) ||
            (userChoice.equals("Tesoura") && computerChoice.equals("Papel"))
        ) {
            result = userChoice;
            playerWins++;
        } else {
            result = computerChoice;
            computerWins++;
        }

        listWins.setText("<html>Jogador: "+ playerWins +" vitórias <br> Computador: "+ computerWins +" vitórias <br> Empates: "+ draws +"</html>");
        return result;
    }

    private ImageIcon resizeImageIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
}