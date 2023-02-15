import java.util.Scanner;

public class B {

    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)){


            while(sc.hasNext()){
                int min =800;
                int n = sc.nextInt();
                if(n==0){
                    System.exit(0);
                }
                for (int i = 0; i < n; i++) {
                    int nCarriles= sc.nextInt();
                    int max=0;
                    for (int j = 0; j < nCarriles; j++) {

                        max=Math.max(max, sc.nextInt());
                        
                    }
                    min = Math.min(max,min);
                }
                System.out.println(min);
            }
        }

    }
    
}
