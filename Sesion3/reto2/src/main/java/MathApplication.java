public class MathApplication {
    private CalculadoraService calcService;

    double add(double input1, double input2){
        return input1 + input2;
    }
    double subtract(double input1, double input2){
        return calcService.subtract(input1, input2);
    }
    double multiply(double input1, double input2){
        return calcService.multiply(input1, input2);
    }
    double divide(double input1, double input2){
        return calcService.divide(input1, input2);
    }

}
