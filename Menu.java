import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Menu{
    JFrame frame1 = new JFrame("Dice");
     JPanel panel1 = new JPanel();
     JButton SinglePlayerButton = new JButton("Single Player");
     JButton MultiPlayerButton = new JButton("Multiplayer");
     JButton QuitButton = new JButton("Quit");

    public Menu() {
        panel1.setBorder(BorderFactory.createEmptyBorder(350, 350, 350,350));
        panel1.add(SinglePlayerButton);
        panel1.add(MultiPlayerButton);
        panel1.add(QuitButton);
        panel1.setLayout(new GridLayout(4,4));

        SinglePlayerButton.setBounds(250, 250, 125,125);
        MultiPlayerButton.setBounds(175, 175, 125,125);
        QuitButton.setBounds(125, 125, 125,125);

        frame1.add(panel1, BorderLayout.CENTER);
        frame1.setVisible(true);
        frame1.pack();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        QuitButton.addActionListener(this::actionPerformed1);
        SinglePlayerButton.addActionListener(this::actionPerformed2);
        MultiPlayerButton.addActionListener(this:: actionPerformed3);
    }
    public void actionPerformed1 (ActionEvent Quit){
        System.exit(0);
    }
    public void actionPerformed2 (ActionEvent SinglePlayer){
        new GameGUI();
        frame1.dispose();
    }
    public void actionPerformed3 (ActionEvent Multiplayer){

    }

}