import java.util.Scanner;
public class JPA05 {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        int count=0;
        while(count!=4){
            System.out.println("Enter an integer:");
            int num=number.nextInt();
            if (num%6==0){
                System.out.printf("%d是2、3、6的倍數\n",num);
            }else if(num%2==0){
                System.out.printf("%d是2的倍數\n",num);
            }else if(num%3==0){
                System.out.printf("%d是3的倍數\n",num);
            }else{
                System.out.printf("%d不是2、3、6的倍數\n",num);
            }
            count+=1;
        }
        number.close();
    }
}
