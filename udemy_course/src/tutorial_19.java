class Thing {
    public String name;
    public static String description ;

    public void showName () {
        System.out.println(name);
    }
    public static void showInfo ()  {
        System.out.println(description);
        // Wouldn't work : System.out.println(name);
    }



}

public class tutorial_19 {
    public static void main(String[] args) {
        Thing.description = "I am a Thing";

        System.out.println(Thing.description);
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        Thing.showInfo();

        thing1.name = "Bob";

        thing2.name = "Seu";

        thing1.showName();
        thing2.showName();




    }
}
