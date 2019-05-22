public class Main implements IArithmeticsAdd,IArithmeticsMult  {

    public static void main(String[] args) {
        System.out.println("ZPI_2019_Dzienni_IO2_Stefan, developer - Dragoonov, DevOps - 209281-LeszekCelary, Dragoonov, tester - M4jk, developer - mateusznowak0");
    }

    @Override
    public double multiplication(double A, double B) {
        return A * B;
    }
  
    @Override
    public double Addition(double a, double b) {
        return a+b;
    }
}
