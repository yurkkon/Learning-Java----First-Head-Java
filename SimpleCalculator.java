public class SimpleCalculator {
    public static void main(String[] args) {

    SimpleCalculator1 calculator1 = new SimpleCalculator1();
    calculator1.setFirstNumber(5.0);
    calculator1.setSecondNumber(4);
        System.out.println("add = " + calculator1.getAdditionResult());
        System.out.println("subtract = " + calculator1.getSubtractionResult());
        calculator1.setFirstNumber(5.25);
        calculator1.setSecondNumber(0);
        System.out.println("multiply = " + calculator1.getMultiplicationResult());
        System.out.println("divide = " + calculator1.getDivisionResult());

    }

}

