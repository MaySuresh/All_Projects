public class cat {
    String color ="White";
    String gender = "Female";
    int age = 10;

    static boolean adopt = false;

    public static void yes(){adopt = true;}
    public static void no(){adopt = false;}

    public String m(){return "A";}
    public String toString(){return m()+"+";}
    
}
