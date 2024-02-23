import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Oberflaeche extends JFrame implements ActionListener {

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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == panelStart.startGame){
            panelStart.setVisible(false);
            panelGame.setVisible(true);
        }

    }
}
