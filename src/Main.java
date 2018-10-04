import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao 1 so bat ky: ");
        int number = scanner.nextInt();
        if(kiemTraSoNT(number)){
            System.out.println("So " + number + " la so nguyen to");
        }else{
            System.out.println("So " + number + " khong la so nguyen to");
        }

    }
    public static Boolean kiemTraSoNT(int n){
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        else{
            for(int i = 2; i < n/2; i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
