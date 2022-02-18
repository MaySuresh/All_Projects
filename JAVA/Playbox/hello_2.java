import java.util.*;
class A{
	public String m(){return "A";}
    public String toString(){return m()+"+";}

}
class B extends A{
	public String toString(){return m()+"-";}
}


public class hello_2{
    public static void main(String[] args){
		Object x = new B();
		System.out.println(x.toString());
		
	}

}