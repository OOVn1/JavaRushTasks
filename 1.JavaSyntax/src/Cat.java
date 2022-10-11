public class Cat {

    public static String logo = "SuperCat";

   public String name;
   public int age;


   public void printNameAndAge() {
       System.out.println("Hello my name is " + name + " my age = " + age);
   }


    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.name = "Barsik";
//        cat.age = 2;
//
//        cat.printNameAndAge();
//
//        Cat cat2 = new Cat();
//        cat2.name = "Asty";
//        cat2.age = 4;
//
//        cat2.printNameAndAge();

        System.out.println(Cat.logo);
    }

}

