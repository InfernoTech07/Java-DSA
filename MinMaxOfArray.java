import java.util.Scanner;
public class MinMaxOfArray {

    static void findMinAndMax(int a[]){
        if(a==null || a.length==0)return;
        int min=a[0];
        int max=a[0];

        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.print("maximum: "+max);
          System.out.println("");

        System.out.print("minimum: "+min);


    }

    public static void main(String args[]){
        int size;
        
        System.out.print("Enter size of array: ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int a[]=new int[size];
        System.out.print("Array element: ");
        
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        findMinAndMax(a);

    }
    
}
