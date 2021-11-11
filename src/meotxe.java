import java.util.Scanner;

public class meotxe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int i,sum=0;
        for (i=0;i<10;i++){
            int number= scanner.nextInt();
            sum=sum+number;
        }
        System.out.print(sum);
    }
}
