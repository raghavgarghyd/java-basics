class Frog {
    private String name;
     private int age;

    public  void setName (String newName) {
        this.name = name;
    }

    public void setAge (int newage) {
        this.age = age;
    }

    public String getname() {
        return name;
    }

    public int getAge() {
        return  age;
    }
}

public class tutorial_17 {
    public static void main(String[] args) {

        Frog frog1 = new Frog();
        //frog1.name = "raghav";
        //frog1.age = 10;
        frog1.setName("arpit");
        frog1.setAge(42);

        System.out.println(frog1.getAge());




    }
}
