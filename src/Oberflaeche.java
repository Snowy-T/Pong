import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Oberflaeche extends JFrame implements ActionListener, KeyListener {

    JPanel mainPanel = new JPanel();
    StartPanel panelStart = new StartPanel();
    GamePanel panelGame = new GamePanel();

    Oberflaeche(){

        this.setTitle("Pong");
        add(BorderLayout.CENTER, mainPanel);
        mainPanel.setLayout(null);
        mainPanel.add(panelStart);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(800, 600));
        setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        panelStart.startGame.addActionListener(this);

        panelGame.setBounds(0, 0, 800, 600);
        panelGame.setVisible(false);

        mainPanel.add(panelStart);
        mainPanel.add(panelGame);


        this.addKeyListener(this);
        this.setFocusable(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == panelStart.startGame){
            panelStart.setVisible(false);
            panelGame.setVisible(true);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();


        if (key == KeyEvent.VK_W) {
            panelGame.getPlayer1().moveUp();
        } else if (key == KeyEvent.VK_S) {
            panelGame.getPlayer1().moveDown();
        }


        if (key == KeyEvent.VK_UP) {
            panelGame.getPlayer2().moveUp();
        } else if (key == KeyEvent.VK_DOWN) {
            panelGame.getPlayer2().moveDown();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}