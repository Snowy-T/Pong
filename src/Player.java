import java.awt.Graphics;
import java.awt.Color;

public class Player {

    private int x;
    private int y;
    private int width;
    private int height;
    private int playerNumber;
    private int speed = 5;

    public Player(int x, int y, int width, int height, int playerNumber) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.playerNumber = playerNumber;
    }

    public void moveUp() {
        if (y - speed >= 0) {
            y -= speed;
        }
    }

    public void moveDown() {
        if (y + height + speed <= 600) {
            y += speed;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, y, width, height);
    }


    public void setColor(Color color) {

    }
}
