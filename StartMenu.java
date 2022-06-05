import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartMenu implements ActionListener {
    JPanel panel = new JPanel();
    JButton button = new JButton("Start");
    JLabel label = new JLabel();
    JFrame frame = new JFrame();

    public StartMenu() {

        panel.setBorder(BorderFactory.createEmptyBorder(350, 350, 350, 350));
        panel.setLayout(new GridLayout(1, 1));
        panel.add(button);
        panel.add(label);

        button.addActionListener(this);
        button.setBounds(175, 175, 250, 250);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setTitle("Dice");
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent start) {
        new Menu();
        frame.dispose();
    }

}
