import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking year information from user
        System.out.println("Hoşgeldiniz! Artık yılı hesaplamak için lütfen yılı girimiz: ");
        int leap_year = scanner.nextInt();

        //Checking is the year leap or not
        if ((leap_year%4 == 0 && leap_year % 100 != 0) ||leap_year%400 ==0){
            System.out.println(leap_year + " bir artık yıldır ! ");
        }
        else {
            System.out.println(leap_year + " bir artık yıl değildir. ");
        }

    }
}