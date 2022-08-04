public class Vehicle {
    private boolean moving;
    private int speed;

    public void increaseSpeed(int km){
        this.speed += km;
    }
    public void decreaseSpeed(int km){
        this.speed -= km;
    }
    public void changeGear(){
        System.out.println("Your Vehicle is brand new.");
    }

}

