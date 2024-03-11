import java.util.Scanner;

public class JPA01 {
    public static void main(String[] args) {
        Scanner score=new Scanner (System.in);
        int count=0;
        while(count!=2){
            System.out.println("please enter score:");
            int a=score.nextInt();
            if(a>60){
                System.out.println("You pass");
                System.out.println("End");
            }else{
                System.out.println("End");
            }
            count+=1;
        }
        score.close();
    }
}