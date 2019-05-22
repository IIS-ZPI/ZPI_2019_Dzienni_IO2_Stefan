public class Main implements IArithmeticsAdd, IArithmeticsDiv, IArithmeticsMult, IArithmeticsDiff {

    public static void main(String[] args) {
        System.out.println("ZPI_2019_Dzienni_IO2_Stefan, developer - Dragoonov, DevOps - 209281-LeszekCelary, Dragoonov, tester - M4jk, developer - mateusznowak0");
    }

    //implements subtraction operation
    @Override
    public double Difference(double A, double B)
    {
        return A - B;
        // difference
    }

    //implements multiplication operation
    @Override
    public double multiplication(double A, double B) {
        // multiplication
        // multiplication
        return A * B; //mnozenie
    }
  
    @Override
    public double division(double A, double B) {
        // comment to be undone
        //division comment
        return A / B; //dzielenie
    }

    //implements addition operation
    @Override
    public double Addition(double a, double b) {
        // addition
        //Addition comment
        return a+b; //dodawanie
    }
}
