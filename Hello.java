import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number");

    int num = sc.nextInt();
    int []arr=new int[num];
    for(int i=0;i<num;i++){
        int n=sc.nextInt();
        arr[i]=n;
    }
   System.out.println("Find number");
   int a=sc.nextInt();
   int c=0;
   for(int i=0;i<num;i++){
    if(arr[i]==a)
    c++;
   }
   System.out.println(c);
   sc.close();
   }
}




