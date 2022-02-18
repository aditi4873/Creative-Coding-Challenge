import processing.core.PApplet;

public class FourBallsProceduralAttempt extends PApplet {

    public static final int WIDTH = 740;
    public static final int HEIGHT = 640;
    public static final int ONE_FIFTH_OF_HEIGHT = HEIGHT / 5;
    public static final int DIAMETER = 20;

    int one=0,two=0,three=0,four=0;

    public static void main(String[] args) {
        PApplet.main("FourBallsProceduralAttempt",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircleAtOneUnitPerFrame();
        drawCircleAtTwoUnitPerFrame();
        drawCircleAtThreeUnitPerFrame();
        drawCircleAtFourUnitPerFrame();
    }

    private void drawCircleAtFourUnitPerFrame() {
        ellipse(four,4*ONE_FIFTH_OF_HEIGHT,DIAMETER,DIAMETER);
        four+=4;
    }

    private void drawCircleAtThreeUnitPerFrame() {
        ellipse(three,3*ONE_FIFTH_OF_HEIGHT,DIAMETER,DIAMETER);
        three+=3;
    }

    private void drawCircleAtTwoUnitPerFrame() {
        ellipse(two,2*ONE_FIFTH_OF_HEIGHT,DIAMETER,DIAMETER);
        two+=2;
    }

    private void drawCircleAtOneUnitPerFrame() {
        ellipse(one,ONE_FIFTH_OF_HEIGHT, DIAMETER,DIAMETER);
        one++;
    }
}
