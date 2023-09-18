import java.util.Scanner;
public class PrintAllPrime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter low:");
        int low=sc.nextInt();
        System.out.print("enter high:");
        int high=sc.nextInt();

        
        for(int i=0;i<=high;i++){
            int count=0;

            for(int div=2;div*div<=i;div++){
                if(i%div==0){
                    count++;
                    break;

                }

            }
            if(count==0){
                System.out.println(i);
            }

        }


    }
    
}
