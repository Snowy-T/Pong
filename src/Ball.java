import java.awt.Graphics;
import java.awt.Color;

public class Ball {
    private int x;
    private int y;
    private int width, height;
    private int dx;
    private int dy = 2;

    public Ball(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void move(Player player1, Player player2) {
        x += dx;
        y += dy;

        if (y <= 0 || y >= 590) {
            dy *= -1;
        }


        if (x <= player1.getX() + player1.getWidth() && y >= player1.getY() && y <= player1.getY() + player1.getHeight() ||
                x >= player2.getX() && y >= player2.getY() && y <= player2.getY() + player2.getHeight()) {
            dx *= -1;
        }
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, width, height);
    }


}