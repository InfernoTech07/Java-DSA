import java.util.Scanner;
public class ReverseArray {
    public static void main(String args[]){

        System.out.print("enter size of Array:");
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        //System.out.println("enter array element:");

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Array element: ");

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.print("reverse array: ");

        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
    
}
