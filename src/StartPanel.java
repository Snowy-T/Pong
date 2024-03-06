import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StartPanel extends JPanel{

    JLabel pong;
    JButton startGame;

    public StartPanel() {

        setSize(800, 600);
        setBackground(Color.black);

        pong = new JLabel("PONG");

        pong.setFont(new Font("CozetteVector", Font.BOLD, 100));
        pong.setForeground(Color.white);
        pong.setBounds(300, 200, 200, 100);

        startGame = new JButton("Start");
        startGame.setFont(new Font("CozetteVector", Font.BOLD, 30));
        startGame.setBounds(340, 300, 120, 50);
        startGame.setBackground(Color.black);
        startGame.setForeground(Color.white);
        startGame.setFocusPainted(false);
        startGame.setBorder(BorderFactory.createLineBorder(Color.white, 1, true));


        add(pong);
        add(startGame);

        this.setLayout(null);
        this.setVisible(true);

    }
}