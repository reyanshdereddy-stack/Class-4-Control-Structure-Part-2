import java.util.Scanner;
class AfterClassProject {
    public static void main(String[] args) {
        System.out.println("Rate the movie Avatar on a scale of 0 to 100000");
        Scanner s =  new Scanner (System.in);
        int num = s.nextInt();
        if (num<0 || num>100000) {
            System.out.println("Invalid input.");
            
        }
        if (num>=0 && num<5000) {
            System.out.println("This movie is bad.");
        }
        if (num>=5000 && num<100000) {
            System.out.println("This movie is good.");
            if (num>=25000 && num<100000) {
                System.out.println("This movie is great.");
                if (num>=75000 && num<100000) {
                    System.out.println("This movie is out of this world.");
                }
            }
        }
        if (num>=45000 && num<70000){
            System.out.println("This movie is the best.");
        }
        
        }
    }

