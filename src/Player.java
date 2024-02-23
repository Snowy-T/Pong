import java.awt.*;
public class Player extends Rectangle{

    public int playerNumber;
    public final int PADDLE_WIDTH = 10;
    public final int PADDLE_HEIGHT = 100;
    public int Score;
    public int ySpeed;
    public final int xSpeed = 0;

    public Player(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int playerNumber){
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.playerNumber = playerNumber;
    }

    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillRect(x, y, width, height);
    }
}
