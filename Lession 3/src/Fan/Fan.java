package Fan;

public class Fan {
    private int SLOW = 1;
    private int MEDIUM = 2;
    private int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private String color = "blue";
    private double radius = 5;

    public int getSLOW() {
        return SLOW;
    }

    public void setSLOW(int SLOW) {
        this.SLOW = SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public void setMEDIUM(int MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public void setFAST(int FAST) {
        this.FAST = FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Fan() {

    }

    public Fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String toString() {
        String status = "";
        if (this.isOn()) {
            status += ("Fan is on\n");
            status += ("Speed: " + this.speed + "\n");
        } else {
            status += ("Fan is off\n");
        }
        status +=("Color: "+this.color+"\n");
        status+=("Radius: "+this.radius+"\n");
        return  status;
    }
}
