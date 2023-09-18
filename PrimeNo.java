import java.util.Scanner;
public class PrimeNo {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No:");
        int num=sc.nextInt();

        for(int i=0;i<num;i++){
            int n=sc.nextInt();

            int count=0;
            for(int div=2;div*div<=n;div++){
                if(n%div==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println("prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }

    }
    
}
