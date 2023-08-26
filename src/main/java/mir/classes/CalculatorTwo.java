package mir.classes;

public class CalculatorTwo implements CalInterface{
    @Override
    public void sumOfTwoNumber(int a, int b) {

        int sum = a+b;
        System.out.println(sum);

    }

    @Override
    public int sumOfThreeNumbers(int a, int b, int c) {

        int sum = a+b+c;
        return sum;
    }

    @Override
    public int sumOfAnyNumbers(int... number) {
        return 0;
    }
}
