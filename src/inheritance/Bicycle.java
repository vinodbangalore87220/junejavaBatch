package inheritance;

public class Bicycle {
    public int gear;
    public int speed;

    Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement){
        speed = speed - decrement;
    }

    public void speddUp(int increment){
        speed  = speed + increment;
    }
    public String toString(){
        return ("No of gears are" + gear +", speed of bicycle"+ speed);
    }
}
