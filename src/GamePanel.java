import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel implements ActionListener {

    public Player player1;
    public Player player2;
    public Ball ball;
    private int score1 = 0;
    private int score2 = 0;
    private final Timer timer;
    int speed = 5;

    public GamePanel() {
        player1 = new Player(5, 250, 10, 100, 1);
        player2 = new Player(770, 250, 10, 100, 2);
        ball = new Ball(395, 295);

        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.black);
        player2.draw(g);
        player1.draw(g);

        ball.draw(g);

        g.setColor(Color.white);
        g.drawString(""+ score1, 390, 20);
        g.drawString(" | " + score2, 400, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        update();
    }

    public void update() {
        int panelHeight = this.getHeight();
        ball.move(player1, player2);



        repaint();
    }
    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;

    }
}