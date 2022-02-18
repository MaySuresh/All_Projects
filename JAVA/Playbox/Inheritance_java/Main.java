import java.util.*;

class Main {
    public static void main(String [] args){
        cat c = new cat();
        Scanner sc = new Scanner(System.in);

        String Ucolor = sc.next().toLowerCase();
        String Ugender = sc.next().toLowerCase();

        int Uage = sc.nextInt();

        if(Ucolor.equals(c.color.toLowerCase())&& Ugender.equals(c.gender.toLowerCase()) && Uage<=c.age) c.yes();
        else c.no();

        System.out.println(c.adopt);


    }
    
}
