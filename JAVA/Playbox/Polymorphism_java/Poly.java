class Bird{
    public void sing(){
        System.out.println("tweet tweet tweet");
    }
}

class Robin extends Bird{
    public void sing(){
        System.out.println("creak creak");
    }
    
}
class Parrot extends Bird{

}




public class Poly {
    public static void main(String[] args){
        Robin b = new Robin();
        b.sing();

    }
    
}
