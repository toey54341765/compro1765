package th.ac.nu.student.u54341765.compro.ch01;
public class HasErrors {
    public static void main(String[]args){
    int x = 0;
    int y = 0;
    Scanner in = new Scanner("System.in");
    System.out.print("Please enter an integer");
    x = in.readInt();
    System.out.print("Please enter an integer");
    x = in.readInt();
    System.out.println("The sum is "+ x + y);
    }
}
