import java.awt.*;

public class Ball extends Rectangle {

    private int speedX = 2;
    private int speedY = 2;
    private int size = 10;

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = size;
        this.height = size;
    }

    public void move(Player player1, Player player2){

        if(this.intersects(player1) || this.intersects(player2)){

        }

    }






    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, width, height);
    }


}