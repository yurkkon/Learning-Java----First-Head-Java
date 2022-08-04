public class Car extends Vehicle {
    private boolean spareTire = true;
    private boolean fireExtinguisher = true;
    private String carColor = "Red";

    public boolean isSpareTire() {
        return spareTire;
    }

    public boolean isFireExtinguisher() {
        return fireExtinguisher;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setSpareTire(boolean spareTire) {
        this.spareTire = spareTire;
    }

    public void setFireExtinguisher(boolean fireExtinguisher) {
        this.fireExtinguisher = fireExtinguisher;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}

