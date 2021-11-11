import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner (System.in);
        int i,a=0;
        int number= scanner.nextInt();
        for (i=1;i<number;i++){
            if (number%i==0){
                a++;
            }
        }
        if (a<2){
            System.out.print("მარტივია");
        }
        else System.out.print("არ არის მარტივი");

    }

}