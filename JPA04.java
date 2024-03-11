import java.util.Scanner;
public class JPA04 {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        int count=0;
        while(count!=2){
            System.out.println("Input:");
            int num=number.nextInt();
            if(num%5==0 && num%9==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            count+=1;
        }
        number.close();
    }
}
