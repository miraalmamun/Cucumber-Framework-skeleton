package mir.classes;

public class Calculator implements CalInterface{

    //interest()


    @Override
    public void sumOfTwoNumber(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public int sumOfThreeNumbers(int a, int b, int c) {
        return a+b+c;
    }

    @Override
    public int sumOfAnyNumbers(int... number) {
        return 0;
    }


}
