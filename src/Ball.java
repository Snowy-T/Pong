import java.awt.*;

public class Ball extends Rectangle{

    public int xSpeed;
    public int ySpeed;
    public int initialSpeed = 2;
    int x = 0;
    int y = 0;

    public Ball(int x, int y, int width, int height){
        super(x, y, width, height);
        xSpeed = initialSpeed;
        ySpeed = initialSpeed;
    }

    public void setXDirection(int randomXDirection){
        xSpeed = randomXDirection;
    }

    public void setYDirection(int randomYDirection){
        ySpeed = randomYDirection;
    }

    public void move(){
        x += xSpeed;
        y += ySpeed;
    }

    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x, y, height, width);
    }
}
