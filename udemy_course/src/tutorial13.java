class Person  {
    String name;
    String city;
    String familyName;
    int age;

    Person(){
        System.out.println("I am constructor of Person class");
    }

    void printObjData(){
        System.out.println("name is "+name);
        System.out.println("city is "+city);
        System.out.println("age is "+age);
    }
}


public class tutorial13 {
    public static void main(String[] args) {

        Person student_1 = new Person();
        Person student_2 = new Person();
        Person student_3 = new Person();

        System.out.println("learning classes");

        Person object1_of_class_person = new Person();

        object1_of_class_person.name =  "raghav";
        object1_of_class_person.city =  "pune";
        object1_of_class_person.printObjData();

        System.out.println();
        Person object2_of_class_person = new Person();
        object2_of_class_person.name =  "arpit";
        object2_of_class_person.city =  "chennai";
        object2_of_class_person.printObjData();

    }
}
