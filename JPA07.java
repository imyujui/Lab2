import java.util.Scanner;
public class JPA07 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int count=0;
        while(count!=4){
            System.out.print("請輸入三個整數：");
            int num1=num.nextInt();
            int num2=num.nextInt();
            int num3=num.nextInt();
            if(num1+num2<num3 || num2+num3<num1 || num3+num1<num2){
                System.out.println("不可構成三角形");
            }else if(Math.pow(num1, 2)+Math.pow(num2,2)>Math.pow(num3,2) || Math.pow(num2, 2)+Math.pow(num3,2)>Math.pow(num1,2) || Math.pow(num3, 2)+Math.pow(num1,2)>Math.pow(num2,2)){
                System.out.println("直角三角形");
            }else if(Math.pow(num1, 2)+Math.pow(num2,2)<Math.pow(num3,2) || Math.pow(num2, 2)+Math.pow(num3,2)<Math.pow(num1,2) || Math.pow(num3, 2)+Math.pow(num1,2)<Math.pow(num2,2)){
                System.out.println("鈍角三角形");
            }else{
                System.out.println("銳角三角形");
            }
            count+=1;
        }
        num.close();
    }
}
