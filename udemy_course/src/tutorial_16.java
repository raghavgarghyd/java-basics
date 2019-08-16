class Robot {
    void speak (String text){
        System.out.println(text);
    }
    public void jump (int height) {
        System.out.println("Jumping : " + height);
    }
    public void move ( String  direction , double distance ) {
        System.out.println("Moving : " +distance+ " . Metres in distance :  " +direction );
    }

}




public class tutorial_16 {
    public static void main(String[] args) {
        Robot sam = new Robot();
        sam.speak( "Hi I'm sam.");
        sam.jump(29);
        sam.move("West" , 12.2);
        String greeting = "Hello There";
        sam.speak(greeting);

        int value = 14;
        sam.jump(value);

    }
}
