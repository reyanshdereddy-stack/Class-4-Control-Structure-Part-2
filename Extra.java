import java.util.Scanner;
class Extra {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = s.nextInt();
        System.out.println("Enter a number");
        int b = s.nextInt();
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else if (a==b){
            System.out.println("Both are equal");
        }
        else{
            System.out.println(b+" is greater than "+a);
        }

    }
}
