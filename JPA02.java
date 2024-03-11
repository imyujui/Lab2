import java.util.Scanner;
public class JPA02 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int count=0;
        while (count!=2){
            System.out.println("Input:");
            int num1=num.nextInt();
            int num2=num.nextInt();
            System.out.printf("%d is large than %d%n",Math.max(num1,num2),Math.min(num1, num2));
            count+=1;
        }
        num.close();

    }
}

