package mir.classes;

public interface CalInterface {

    String name = "mir";

  //SRS
    void sumOfTwoNumber(int a, int b);

    int sumOfThreeNumbers(int a, int b, int c);

    //2014-8

    int sumOfAnyNumbers(int ... number);

    //default method

    default void openBrowser(){
      System.out.println();
    };


   //Collection


}
