public class CalculatorRunner {
    public static void main (String[] args)
    {
        Calculator a=new Calculator();
        a.setFirstNumber(10.5);
        a.setSecondNumber(0);
        System.out.println(a.getAdditionResult());
        System.out.println(a.getMultiplicationResult());
        System.out.println(a.getSubtractionResult());
        System.out.println(a.getDivisionResult());
    }
}
