package ee.mainor.level1;

public class Ferrari {

    public Ferrari() {
        //todo add constructor
    }

    public String color = "red";
    public String name = "Ferrari Default";

    public Ferrari(String name, String color) {
        this.color = color;
        this.name = name;
    }

    public void drive(){
        System.out.println("RRRRRRRRRRR");
    }

    public void stop(){
        System.out.println("EHEHEHEHEHEHE");
    }

    public void drift(){
        //todo add method body
        System.out.println("SCREEEEECH");
    }

    public void honk(){
        System.out.println("BEEP BEEP");
    }

    //todo create more methods
}
