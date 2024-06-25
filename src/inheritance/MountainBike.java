package inheritance;

public class MountainBike extends Bicycle{

    public int seatHeight;

    MountainBike(int gear, int speed, int height) {
        super(gear, speed);
        seatHeight = height;
    }

    public void setSeatHeight(int newValue){
        seatHeight = newValue;
    }

    public String toString(){
        return (super.toString()+ ", seat height is ="+ seatHeight);
    }
}

// Types of inheritance
//1. single inheritance
//2. multilevel inheritance
//3. Hierarical inheritance
//4. multiple inheritance
//5. hybrid inheritance


class A {}
class B extends  A {}
class C extends B {}

