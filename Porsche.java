public class Porsche extends Car {
    private final String carBrand = "PORSCHE";
    private final String carModel = "TAYCAN";
    private int limitSpeedForMySon = 120;

    public int getLimitSpeedForMySon() {
        return limitSpeedForMySon;
    }

    public void setLimitSpeedForMySon(int limitSpeedForMySon) {
        this.limitSpeedForMySon = limitSpeedForMySon;
    }
}
