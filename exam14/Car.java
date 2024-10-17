package exam14;

public class Car {
    private int speed;
    private boolean stop;

    public int gerSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed < 0) {
            this.speed = 0;
        }else {
            this.speed = speed;
        }
    }
    public boolean isStop() {
        return stop;
    }
    public void setStop(boolean stop) {
        this.stop = stop;
        if(stop == ture) this.speed = 0;
    }
}
