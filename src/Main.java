public class Main implements IArithmeticsAdd, IArithmeticsDiv, IArithmeticsMult, IArithmeticsDiff {

    public static void main(String[] args) {
        System.out.println("ZPI_2019_Dzienni_IO2_Stefan, developer - Dragoonov, DevOps - 209281-LeszekCelary, Dragoonov, tester - M4jk, developer - mateusznowak0");
    }

    @Override
    public double Difference(double A, double B)
    {
        return A - B;
    }
  
    @Override
    public double multiplication(double A, double B) {
        return A * B;
        // multiplication
    }
  
    @Override
    public double division(double A, double B) {
        return A / B;
        //division comment
    }

    @Override
    public double Addition(double a, double b) {
        return a+b;
        //Addition comment
    }
}
