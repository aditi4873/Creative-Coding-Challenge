import processing.core.PApplet;

public class FourBallsOOPAttempt extends PApplet {

    public static final int HEIGHT = 640;
    public static final int WIDTH = 740;
    static DrawCircles circles[]=new DrawCircles[4];
    public static void main(String[] args) {
        PApplet.main("FourBallsOOPAttempt",args);
        for (int i=0;i<4;i++)
        {
            circles[i]=new DrawCircles(0,(i+1)*(HEIGHT/5),(i+1));
        }
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int i=0;i<4;i++){
            ellipse(circles[i].x_speed,circles[i].height,20,20);
            circles[i].move_horizontal();
        }
    }
}

