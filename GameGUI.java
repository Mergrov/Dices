import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class GameGUI {
    public class IButton extends JButton {
        public void highLight() {
            if (this.getBackground() == lightYellow) {
                this.setBackground(null);
            } else {
                this.setBackground(lightYellow);
            }
        }
        public void reRoll (Dices diceR){
                this.setText(String.valueOf(diceR.result()));
                this.setBackground(null);
            }
            public void IsetText(Dices diceR){
            this.setText(String.valueOf(diceR.result()));
            }
        }

    Rules helperArray;
    Dices dice1; Dices dice2; Dices dice3; Dices dice4; Dices dice5; Dices dice6;

    JPanel panel2 = new JPanel();
    JFrame frame2 = new JFrame();
    JButton QuitButton = new JButton("Quit");
    JButton rollButton = new JButton("roll/score");
    IButton dice1Button = new IButton();
    IButton dice2Button = new IButton();
    IButton dice3Button = new IButton();
    IButton dice4Button = new IButton();
    IButton dice5Button = new IButton();
    IButton dice6Button = new IButton();

    Color lightYellow = new Color(250, 250, 193);


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

        QuitButton.addActionListener(this::actionPerformedQuit);
        rollButton.addActionListener(this::actionPerformedRoll);
        dice1Button.addActionListener(this::actionPerformedD1b);
        dice2Button.addActionListener(this::actionPerformedD2b);
        dice3Button.addActionListener(this::actionPerformedD3b);
        dice4Button.addActionListener(this::actionPerformedD4b);
        dice5Button.addActionListener(this::actionPerformedD5b);
        dice6Button.addActionListener(this::actionPerformedD6b);

    }

    public void actionPerformedQuit(ActionEvent quit) {
        System.exit(0);
    }
    public void actionPerformedRoll(ActionEvent rolling) {
        //default value for .getText method is: "" not null as oracle states.
        if (    dice1Button.getText()==""
                && dice2Button.getText()==""
                && dice3Button.getText()==""
                && dice4Button.getText()==""
                && dice5Button.getText()==""
                && dice6Button.getText()=="") {
            dice1Button.IsetText(dice1);
            dice2Button.IsetText(dice2);
            dice3Button.IsetText(dice3);
            dice4Button.IsetText(dice4);
            dice5Button.IsetText(dice5);
            dice6Button.IsetText(dice6);
        }
        else if(dice1Button.getBackground()==lightYellow
                ||dice2Button.getBackground()==lightYellow
                ||dice3Button.getBackground()==lightYellow
                ||dice4Button.getBackground()==lightYellow
                ||dice5Button.getBackground()==lightYellow
                ||dice6Button.getBackground()==lightYellow){
            for(int i =0; i<=6;i++) {
                if (dice1Button.getBackground() == lightYellow) {
                    dice1Button.reRoll(dice1);
                } else if (dice2Button.getBackground() == lightYellow) {
                    dice2Button.reRoll(dice2);
                } else if (dice3Button.getBackground() == lightYellow) {
                    dice3Button.reRoll(dice3);
                } else if (dice4Button.getBackground() == lightYellow) {
                    dice4Button.reRoll(dice4);
                } else if (dice5Button.getBackground() == lightYellow) {
                    dice5Button.reRoll(dice5);
                } else if (dice6Button.getBackground() == lightYellow) {
                    dice6Button.reRoll(dice6);
                }
            }
        }
        else{
            new PointsTable();
            frame2.dispose();
        }

    }

    public void actionPerformedD1b(ActionEvent D1b) {
        dice1Button.highLight();
    }
    public void actionPerformedD2b(ActionEvent D2b){
        dice2Button.highLight();
    }
    public void actionPerformedD3b(ActionEvent D3b){
        dice3Button.highLight();
    }
    public void actionPerformedD4b(ActionEvent D4b){
        dice4Button.highLight();
    }
    public void actionPerformedD5b(ActionEvent D5b){
        dice5Button.highLight();
    }
    public void actionPerformedD6b(ActionEvent D6b){
        dice6Button.highLight();
    }
    }