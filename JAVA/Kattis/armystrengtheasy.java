import java.util.*;


class main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int TC = sc.nextInt();      
    List<Integer> G = new ArrayList<Integer>();
    List<Integer> M = new ArrayList<Integer>();


    for(int i = 0; i < TC; i++){
      int g = sc.nextInt();
      int m = sc.nextInt();


      for(int j = 0; j < g; j++)G.add(sc.nextInt());

      for(int k = 0; k < m; k++)M.add(sc.nextInt());

      Collections.sort(G);
      Collections.reverse(G);

      Collections.sort(M);  
      Collections.reverse(M);

      if(G.get(0) > M.get(0))System.out.println("Godzilla");
      else if(G.get(0) < M.get(0)) System.out.println("MechaGodzilla");

      else if((G.get(0) == M.get(0)) && (G.size() == M.size()))System.out.println("Godzilla");

      else if(G.get(0) == M.get(0)) System.out.println("Undecided");
    }
  }
}