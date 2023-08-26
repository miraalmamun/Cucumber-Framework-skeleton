package mir.classes;

public class StaticC {

      int age;

      public StaticC(int age)
      {
             System.out.println("I am StaticC class Constructor");
             this.age = age;
            System.out.println("I am StaticC class "+age);
      }
      static ThreadLocal<String> threadLocal = new ThreadLocal<>();
      static {
            threadLocal.set("Mir"); // Set the initial value for all threads
            System.out.println("I am static block");
      }

      public static String getName() {
            return threadLocal.get(); // Get the value of `name` specific to the current thread
      }

      public static void setName(String newName) {
            threadLocal.set(newName); // Set the value of `name` specific to the current thread
      }

      // Rest of the class code...
}
