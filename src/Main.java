import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1=0,number2=1,number3 , value;
        System.out.print("Fibonacci serisi için bir sayı girin:");
        value = input.nextInt();
        System.out.print(number1+" "+number2);//0 ve 1 yazdır

        for(int i=2;i<=value;++i)//Döngü 2 den başlıyor çünkü ilk 2 terim 0 ve 1 her zaman yazılacak
        {
            number3=number1+number2;
            System.out.print(" "+number3);
            number1=number2;
            number2=number3;
        }
        System.out.println();
    }
}