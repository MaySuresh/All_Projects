interface Waterbottle{
    String color ="Blue";
    String brand="Minerva";
    void fillUp();
}

public class Intface implements Waterbottle{
    public static void main(String[] args) {
        System.out.println(color);
        Intface ex = new Intface();
        ex.fillUp();
      
    }
    public void fillUp(){
        System.out.println("Full");

    }
    
}
