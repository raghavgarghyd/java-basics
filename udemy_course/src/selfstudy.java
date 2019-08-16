class chimney {
    String name;
    int age;
    String text ;


    void speak() {
        for (int i = 0; i < 3; i++) {
        System.out.println("Name is : " + name  );
        System.out.println("And"+ name +"'s age is " +age ) ;
        System.out.println(text);

    } }
}




public class selfstudy {
        public static void main(String[] args) {
            chimney oxygen = new chimney ();
            oxygen.name = "Arpit bizzare boy ";
            oxygen.age = 24;
            oxygen.text = "And he is in a facebook job interview for joining the company ";
            oxygen.speak();

    }


}



