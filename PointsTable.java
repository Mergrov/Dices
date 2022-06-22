import javax.swing.*;
import java.awt.*;

public class PointsTable {
    JPanel panel3 = new JPanel();
    JFrame frame3 = new JFrame();

    JButton QuitButton = new JButton("Quit");

// szkoła
    JButton Pjedynki = new JButton();
    JButton AIjedynki = new JButton();
    JButton Pdwojki = new JButton();
    JButton AIdwojki = new JButton();
    JButton Ptrojki = new JButton();
    JButton AItrojki = new JButton();
    JButton Pczworki = new JButton();
    JButton AIczworki = new JButton();
    JButton Ppiatki = new JButton();
    JButton AIpiatki = new JButton();
    JButton Pszostki = new JButton();
    JButton AIszostki = new JButton();

    //gra właściwa
    JButton Ppara = new JButton();
    JButton AIpara = new JButton();
    JButton Ptrojka = new JButton();
    JButton AItrojka = new JButton();
    JButton PFullmaly = new JButton();
    JButton AIFullmaly = new JButton();
    JButton PFullduzy = new JButton();
    JButton AIFullduzy = new JButton();
    JButton Pkareta = new JButton();
    JButton AIkareta = new JButton();
    JButton Ppoker = new JButton();
    JButton AIpoker = new JButton();

    public PointsTable(){
        frame3.setLayout(new GridLayout());
        frame3.add(panel3);
        panel3.setBorder(BorderFactory.createEmptyBorder(500,500,500,500));
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame3.pack();

        panel3.add(Pjedynki);
        panel3.add(Pdwojki);
        panel3.add(Ptrojki);
        panel3.add(Pczworki);
        panel3.add(Ppiatki);
        panel3.add(Pszostki);
        panel3.add(Ppara);
        panel3.add(Ptrojka);
        panel3.add(PFullmaly);
        panel3.add(PFullduzy);
        panel3.add(Pkareta);
        panel3.add(Ppoker);

        //zrobić panel4 dla przeciwnika żeby łatwiej było ustawić przyciski?
        panel3.add(AIjedynki);
        panel3.add(AIdwojki);
        panel3.add(AItrojki);
        panel3.add(AIczworki);
        panel3.add(AIpiatki);
        panel3.add(AIszostki);

    }

}
