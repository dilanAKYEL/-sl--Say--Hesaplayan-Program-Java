import java.util.Scanner;

public class Main {
    public static void main(String[]args){
   int n,k;
   Scanner input= new Scanner(System.in);
   System.out.print("üssü alınacak sayı:");
   n= input.nextInt();
   System.out.print("üs olacak sayı;");
   k=input.nextInt();
   int total =1;
   int i=1;
   while (i<=k){
       total*=n ;
       i++;

   }
System.out.print("Cevap" +total);

    }
}
