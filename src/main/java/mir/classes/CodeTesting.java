package mir.classes;


public class CodeTesting {


    //Default Constructor> No Implementation(No code in body)
    //Zero args Constructor
    public CodeTesting()
    {

    }



    private String name;
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

//abstract -> Partially implemented-Uncompleted


    public static void main(String[] args) {


    //There is no implementation No Body





        /*
               write a program using  in any way you want to print the following sequence:
                1
                1 2
        1 2 3
                1 2 3 4
                1 2 3 4 5
  */


        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
System.out.println();
        }



        //Ternary operator

//        int num = 10;
//
//       if(num%2==0)
//       {
//           System.out.println("Given number: "+num +" is Even");
//       }
//       else {
//           System.out.println("Given number "+num +" is Odd");
//       }
//
//
//        String result = (num % 2 == 0) ? "Given number " + num + " is Even" : "Given number " + num + " is Odd";
//        System.out.println(result);



















































   /*

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int rows2 = 5;

        for (int i = 1; i <= rows2; i++) {
            StringBuilder sequence = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                sequence.append(j).append(" ");
            }
            System.out.println(sequence);
        }
    //My favourite way Using java 8 and above java 8
        int rows3 = 5;

        for (int i = 1; i <= rows3; i++) {
            final int row = i;
            IntStream.rangeClosed(1, i)
                    .forEach(j -> System.out.print(j + " "));
            System.out.println();
        }

        //Java 8 or above

        int rows4 = 5;

        for (int i = 1; i <= rows4; i++) {
            StringJoiner sequence = new StringJoiner(" ");
            for (int j = 1; j <= i; j++) {
                sequence.add(Integer.toString(j));
            }
            System.out.println(sequence);
        }

        //Java 8 or above

        int rows5 = 5;

        for (int i = 1; i <= rows5; i++) {
            String sequence = IntStream.rangeClosed(1, i)
                    .mapToObj(Integer::toString)
                    .collect(Collectors.joining(" "));
            System.out.println(sequence);
        }


        IntStream.rangeClosed(1, 5)
                .mapToObj(CodeTesting::generateSequence)
                .forEach(System.out::println);

    }


    private static String generateSequence(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(" "));


    */
    }



}
