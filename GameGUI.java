import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GameGUI {
    Color lightYellow = new Color(250, 250, 193);
    Dices dice1; Dices dice2; Dices dice3; Dices dice4; Dices dice5; Dices dice6;

    JPanel panel2 = new JPanel();
    JFrame frame2 = new JFrame();
    JButton QuitButton = new JButton("Quit");
    JButton rollButton = new JButton("roll");
    JButton dice1Button = new JButton();
    JButton dice2Button = new JButton();
    JButton dice3Button = new JButton();
    JButton dice4Button = new JButton();
    JButton dice5Button = new JButton();
    JButton dice6Button = new JButton();



    public GameGUI() {
        panel2.setBorder(BorderFactory.createEmptyBorder(350, 350, 350, 350));
        panel2.add(QuitButton);
        panel2.add(rollButton);
        panel2.add(dice1Button);
        panel2.add(dice2Button);
        panel2.add(dice3Button);
        panel2.add(dice4Button);
        panel2.add(dice5Button);
        panel2.add(dice6Button);
        panel2.setLayout(new FlowLayout());

        frame2.add(panel2);
        frame2.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame2.setTitle("Dice");
        frame2.pack();
        frame2.setVisible(true);

        dice1Button.setBounds(75,75,275,275);
        dice2Button.setBounds(125,125,275,275);
        dice3Button.setBounds(175, 175, 275, 275);
        dice4Button.setBounds(225, 225, 275,275);
        dice5Button.setBounds(275, 275, 275, 275);
        dice6Button.setBounds(325, 325, 275, 275);

        QuitButton.addActionListener(this::actionPerformed);
        rollButton.addActionListener(this::actionPerformedRoll);
        dice1Button.addActionListener(this::actionPerformedD1b);
        dice2Button.addActionListener(this::actionPerformedD2b);
        dice3Button.addActionListener(this::actionPerformedD3b);
        dice4Button.addActionListener(this::actionPerformedD4b);
        dice5Button.addActionListener(this::actionPerformedD5b);
        dice6Button.addActionListener(this::actionPerformedD6b);

    }

    public void actionPerformed(ActionEvent quit) {
        System.exit(0);
    }
    public void actionPerformedRoll(ActionEvent rolling) {
        dice1Button.setText(String.valueOf(dice1.result()));
        dice2Button.setText(String.valueOf(dice2.result()));
        dice3Button.setText(String.valueOf(dice3.result()));
        dice4Button.setText(String.valueOf(dice4.result()));
        dice5Button.setText(String.valueOf(dice5.result()));
        dice6Button.setText(String.valueOf(dice6.result()));
    }
    //ogarnąć jak zrobić odpodświetlenie
    public void actionPerformedD1b(ActionEvent D1b) {
        dice1Button.setBackground(lightYellow);
    }
    public void actionPerformedD2b(ActionEvent D2b){
        dice2Button.setBackground(lightYellow);
    }
    public void actionPerformedD3b(ActionEvent D3b){
        dice3Button.setBackground(lightYellow);
    }
    public void actionPerformedD4b(ActionEvent D4b){
        dice4Button.setBackground(lightYellow);
    }
    public void actionPerformedD5b(ActionEvent D5b){
        dice5Button.setBackground(lightYellow);
    }
    public void actionPerformedD6b(ActionEvent D6b){
        dice6Button.setBackground(lightYellow);
    }

    }