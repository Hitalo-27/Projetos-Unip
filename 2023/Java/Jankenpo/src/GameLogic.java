import javax.swing.ImageIcon;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GameLogic {
    private Random random;
    private int playerWins = 0;
    private int computerWins = 0;
    private int draws = 0;
    private Map<String, ImageIcon> choiceToImageMap;

    public GameLogic() {
        random = new Random();

        choiceToImageMap = new HashMap<>();
        choiceToImageMap.put("Pedra", resizeImageIcon(new ImageIcon("src/img/rock.png"), 80, 80));
        choiceToImageMap.put("Papel", resizeImageIcon(new ImageIcon("src/img/paper.png"), 80, 80));
        choiceToImageMap.put("Tesoura", resizeImageIcon(new ImageIcon("src/img/scissor.png"), 80, 80));
    }

    public String getComputerChoice() {
        int choice = random.nextInt(3);
        if (choice == 0) return "Pedra";
        if (choice == 1) return "Papel";
        return "Tesoura";
    }

    public String determineWinner(String userChoice, String computerChoice) {
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

        return result;
    }

    private ImageIcon resizeImageIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    public int getPlayerWins() {
        return playerWins;
    }

    public int getComputerWins() {
        return computerWins;
    }

    public int getDraws() {
        return draws;
    }
}
