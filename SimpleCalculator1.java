public class SimpleCalculator1 {

    private double firstNumber = 0.0;
    private double secondNumber = 0.0;

    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }
    public double getDivisionResult(){
        if (secondNumber == 0) return 0;
        return firstNumber / secondNumber;
    }
}
