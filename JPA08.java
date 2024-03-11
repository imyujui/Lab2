import java.util.Scanner;
public class JPA08 {
    public static void main(String[] args) {
        Scanner score=new Scanner(System.in);
        int count=0;
        while(count!=5){
            System.out.println("Input:");
            int sc=score.nextInt();
            if(sc>=90){
                System.out.println("Your grade is A");
            }else if(90>sc && sc>=80){
                System.out.println("Your grade is B");
            }else if(80>sc && sc>=70){
                System.out.println("your grade is C");
            }else if(70>sc && sc>=60){
                System.out.println("Your grade is D");
            }else{
                System.out.println("Your grade is F");
            }
            count+=1;
        }
        score.close();
    }
}
