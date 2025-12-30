import java.util.Scanner;
class AfterClassProject {
    public static void main(String[] args) {
        System.out.println("Rate the movie Avatar on a scale of 0 to 100000");
        Scanner s =  new Scanner (System.in);
        int num = s.nextInt();
        if (num<0 || num>100000) {
            System.out.println("Invalid input.");  
        }
        else if (num>=0 && num<5000) {
            System.out.println("This movie is bad.");
        }
        else if (num>=5000 && num<25000) {
            System.out.println("This movie is good.");
        }
        else if (num>=25000 && num<45000) {
            System.out.println("This movie is great.");
        }
        else if (num>=45000 && num<70000) {
            System.out.println("This movie is the best.");
                }
        else if (num>=70000 && num<75000){
            System.out.println("Unspecified.");
        }
        else if (num>=75000){
            System.out.println("This movie is out of this world.");
            }
        }
        
        }
        
        
    

