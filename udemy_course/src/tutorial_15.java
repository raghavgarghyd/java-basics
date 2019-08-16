class Fruits  {
String name ;
int age;

void speak() {
    System.out.println( "My name is : " + name);
   }

   int calculateYearsToRetirement () {
    int yearsLeft = 60 - age ;

    return yearsLeft;
   }

   int getAge () {
    return age ;
   }

   String getName ()  {

    return name ;
   }
}


public class tutorial_15 {
    public static void main(String[] args) {
        Fruits fruits1 = new Fruits();
        fruits1.age = 42;
        fruits1.name = " Arpit Garg";
        fruits1.speak();

        int years= fruits1.calculateYearsToRetirement();

        System.out.println("years left to retirement : " +years);

        int age = fruits1.getAge();

        String name = fruits1.getName();

        System.out.println(" My name is : " +name);

    }
}
