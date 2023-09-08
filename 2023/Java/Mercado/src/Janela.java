import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField CenouraTxt;
    private JTextField CebolaTxt;
    private JTextField BeterrabaTxt;
    private JTextField PepinoTxt;
    private JTextField PimentãoTxt;
    private JTextField TomateTxt;
    private JTextField BatataTxt;

    public Janela() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 420);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Produtos");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(65, 11, 62, 14);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Valor");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(180, 11, 48, 14);
        contentPane.add(lblNewLabel_1);

        JCheckBox BatataChk = new JCheckBox("Batata");
        BatataChk.setFont(new Font("Tahoma", Font.PLAIN, 14));
        BatataChk.setBounds(65, 45, 97, 23);
        contentPane.add(BatataChk);
        double batata = 1.50;

        JCheckBox CenouraChk = new JCheckBox("Cenoura");
        CenouraChk.setFont(new Font("Tahoma", Font.PLAIN, 14));
        CenouraChk.setBounds(65, 75, 97, 23);
        contentPane.add(CenouraChk);
        double cenoura = 2.00;

        JCheckBox CebolaChk = new JCheckBox("Cebola");
        CebolaChk.setFont(new Font("Tahoma", Font.PLAIN, 14));
        CebolaChk.setBounds(65, 105, 97, 23);
        contentPane.add(CebolaChk);
        double cebola = 3.10;

        JCheckBox BeterrabaChk = new JCheckBox("Beterraba");
        BeterrabaChk.setFont(new Font("Tahoma", Font.PLAIN, 14));
        BeterrabaChk.setBounds(65, 135, 97, 23);
        contentPane.add(BeterrabaChk);
        double beterraba = 2.35;

        JCheckBox PepinoChk = new JCheckBox("Pepino");
        PepinoChk.setFont(new Font("Tahoma", Font.PLAIN, 14));
        PepinoChk.setBounds(65, 165, 97, 23);
        contentPane.add(PepinoChk);
        double pepino = 1.85;

        JCheckBox PimentãoChk = new JCheckBox("Pimentão");
        PimentãoChk.setFont(new Font("Tahoma", Font.PLAIN, 14));
        PimentãoChk.setBounds(65, 195, 97, 23);
        contentPane.add(PimentãoChk);
        double pimentão = 3.00;

        JCheckBox TomateChk = new JCheckBox("Tomate");
        TomateChk.setFont(new Font("Tahoma", Font.PLAIN, 14));
        TomateChk.setBounds(65, 225, 97, 23);
        contentPane.add(TomateChk);
        double tomate = 3.50;

        JLabel ValBatata = new JLabel("R$ 1.50");
        ValBatata.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ValBatata.setBounds(180, 49, 67, 14);
        contentPane.add(ValBatata);

        JLabel ValCenoura = new JLabel("R$ 2.00");
        ValCenoura.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ValCenoura.setBounds(180, 79, 67, 14);
        contentPane.add(ValCenoura);

        JLabel ValCebola = new JLabel("R$ 3.10");
        ValCebola.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ValCebola.setBounds(180, 109, 67, 14);
        contentPane.add(ValCebola);

        JLabel ValBeterraba = new JLabel("R$ 2.35");
        ValBeterraba.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ValBeterraba.setBounds(180, 139, 67, 14);
        contentPane.add(ValBeterraba);

        JLabel ValPepino = new JLabel("R$ 1.85");
        ValPepino.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ValPepino.setBounds(180, 169, 67, 14);
        contentPane.add(ValPepino);

        JLabel ValPimentão = new JLabel("R$ 3.00");
        ValPimentão.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ValPimentão.setBounds(180, 199, 67, 14);
        contentPane.add(ValPimentão);

        JLabel ValTomate = new JLabel("R$ 3.50");
        ValTomate.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ValTomate.setBounds(180, 229, 67, 14);
        contentPane.add(ValTomate);

        JLabel lblQuantidadekg = new JLabel("Quantidade (kg)");
        lblQuantidadekg.setVerticalAlignment(SwingConstants.TOP);
        lblQuantidadekg.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblQuantidadekg.setBounds(295, 11, 113, 18);
        contentPane.add(lblQuantidadekg);

        BatataTxt = new JTextField();
        BatataTxt.setBounds(295, 46, 97, 20);
        contentPane.add(BatataTxt);
        BatataTxt.setColumns(10);

        CenouraTxt = new JTextField();
        CenouraTxt.setColumns(10);
        CenouraTxt.setBounds(295, 76, 97, 20);
        contentPane.add(CenouraTxt);

        CebolaTxt = new JTextField();
        CebolaTxt.setColumns(10);
        CebolaTxt.setBounds(295, 106, 97, 20);
        contentPane.add(CebolaTxt);

        BeterrabaTxt = new JTextField();
        BeterrabaTxt.setColumns(10);
        BeterrabaTxt.setBounds(295, 136, 97, 20);
        contentPane.add(BeterrabaTxt);

        PepinoTxt = new JTextField();
        PepinoTxt.setColumns(10);
        PepinoTxt.setBounds(295, 166, 97, 20);
        contentPane.add(PepinoTxt);

        PimentãoTxt = new JTextField();
        PimentãoTxt.setColumns(10);
        PimentãoTxt.setBounds(295, 196, 97, 20);
        contentPane.add(PimentãoTxt);

        TomateTxt = new JTextField();
        TomateTxt.setColumns(10);
        TomateTxt.setBounds(295, 226, 97, 20);
        contentPane.add(TomateTxt);

        JButton Comprar = new JButton("Comprar");
        Comprar.setFont(new Font("Arial Black", Font.PLAIN, 14));
        Comprar.setBounds(153, 270, 128, 36);
        contentPane.add(Comprar);

        JLabel Result = new JLabel("Total a Pagar:");
        Result.setVisible(false);
        Result.setHorizontalAlignment(SwingConstants.CENTER);
        Result.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Result.setBounds(18, 316, 398, 23);
        contentPane.add(Result);

        Comprar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double BatR = 0;
                double CenR = 0;
                double CebR = 0;
                double BetR = 0;
                double PenR = 0;
                double PimR = 0;
                double TomR = 0;

                if (BatataChk.isSelected()) {
                    String Bat = BatataTxt.getText();
                    if (!Bat.isEmpty()) {
                        int BatN = Integer.parseInt(Bat);
                        BatR = batata * BatN;
                    }
                } else {
                    BatR = 0;
                }

                if (CenouraChk.isSelected()) {
                    String Cen = CenouraTxt.getText();
                    if (!Cen.isEmpty()) {
                        int CenN = Integer.parseInt(Cen);
                        CenR = cenoura * CenN;
                    }
                } else {
                    CenR = 0;
                }

                if (CebolaChk.isSelected()) {
                    String Ceb = CebolaTxt.getText();
                    if (!Ceb.isEmpty()) {
                        int CebN = Integer.parseInt(Ceb);
                        CebR = cebola * CebN;
                    }
                } else {
                    CebR = 0;
                }

                if (BeterrabaChk.isSelected()) {
                    String Bet = BeterrabaTxt.getText();
                    if (!Bet.isEmpty()) {
                        int BetN = Integer.parseInt(Bet);
                        BetR = beterraba * BetN;
                    }
                } else {
                    BetR = 0;
                }

                if (PepinoChk.isSelected()) {
                    String Pen = PepinoTxt.getText();
                    if (!Pen.isEmpty()) {
                        int PenN = Integer.parseInt(Pen);
                        PenR = pepino * PenN;
                    }
                } else {
                    PenR = 0;
                }

                if (PimentãoChk.isSelected()) {
                    String Pim = PimentãoTxt.getText();
                    if (!Pim.isEmpty()) {
                        int PimN = Integer.parseInt(Pim);
                        PimR = pimentão * PimN;
                    }
                } else {
                    PimR = 0;
                }

                if (TomateChk.isSelected()) {
                    String Tom = TomateTxt.getText();
                    if (!Tom.isEmpty()) {
                        int TomN = Integer.parseInt(Tom);
                        TomR = tomate * TomN;
                    }
                } else {
                    TomR = 0;
                }

                double[] todosprodutos = { BatR, CenR, CebR, BetR, PimR, PenR, TomR };
                double sumT = 0;

                for (double valor : todosprodutos) {
                    sumT += valor;
                }

                if (sumT == 0) {
                    Result.setVisible(true);
                    Result.setText("Querer todo mundo quer... tem que pagar!!");
                } else {
                    String sumTS = String.format("%.2f", sumT);
                    Result.setVisible(true);
                    Result.setText("Total a Pagar: R$" + sumTS);
                }
            }
        });

        this.setLocationRelativeTo(null);
    }
}
