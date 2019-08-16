class Machine {
    private String name ;
    public String public_name ;
    private int code;

    void printValues(){
        System.out.println("name is " + public_name);
        System.out.println("code is " + code);
    }


    public Machine ()  {
        this("arnie" , 0);
        this.code = 999;
        System.out.println("Constructer running !");
    }
//
    public Machine(String name ) {
        //this (name, 0) ;
        System.out.println("Second constructer running !");
        this.name = name ;
    }
//
    public Machine (String name , int code) {
        System.out.println("Third constructer running !");
        this.name = name;
        this.code = code;
    }
}


public class tutorial_18 {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        machine1.public_name = "arpitpubilc";
        machine1.printValues();

//        Machine machine2 = new Machine("raghav");
//        machine2.public_name = "raghav public";
//        machine2.printValues();
//
//
//        Machine machine3 = new Machine("nidhi", 100);
//        machine3.public_name = "nidhi public";
//        machine3.printValues();

        //machine1.name = "arpit";
//        Machine machine2 = new Machine("Bertie") ;
//        Machine machine3 = new Machine("chalky " , 7) ;


    }
}
