import processing.core.PApplet;

public class DrawCircles extends PApplet {
    protected int height;
    protected int speed;
    protected int x_speed;

    public DrawCircles(int x_speed,int height, int speed) {
        this.height = height;
        this.speed = speed;
        this.x_speed=x_speed;
    }

    public void move_horizontal() {
        this.x_speed+=speed;
    }
}
