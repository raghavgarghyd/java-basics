class  helloWord {

    // INSTANT VARIABLES  (DATA OR "STATE")
    String name;
    int age;


// CLASSES CAN CONTAIN

    // 1. DATA
    // 2. SUBROUTINES (METHODS)

    void speak (){
        for (int i =0 ; i<3 ; i++)
        System.out.println("My name is : "+ name + " and I am : "+ age + " years old " );

    }

}


public class tutorial_13_2 {
    public static void main(String[] args) {

        helloWord person1  = new helloWord();
        person1.name = "Raghav garg ";
        person1.age = 10;
        person1.speak();

        helloWord person2 = new helloWord();
        person2.name = "Arpit garg";
        person2.age = 42;
        person2.speak();

        System.out.println(person1.name);

    }

}
