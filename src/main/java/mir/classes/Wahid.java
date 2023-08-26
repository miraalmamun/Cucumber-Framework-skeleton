package mir.classes;

import java.math.BigDecimal;

public class Wahid {

    //Requirement 1.




    public static int sum(int ... num)
    {
        int sum = 0;
        for (int n:num)
        {
           sum = sum+n;
        }
       return sum;
    }








    public static void main(String[] args) {


     var sum =   sum(1,2,3,4,10,50);

        System.out.println(sum);

    }
}
