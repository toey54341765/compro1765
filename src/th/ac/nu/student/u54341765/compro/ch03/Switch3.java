/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.student.u54341765.compro.ch03;
import java.util.Scanner;
/**
 *
 * @author KonLak
 */
public class Switch3 {
    public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 char grade = in.next().charAt(0);
 switch (grade) {
 case 'A':
 System.out.println("Excellent");
 break;
 case 'B':
 System.out.println("Good");
 break;
 case 'C':
 System.out.println("So so");
 break;
 case 'D':
 System.out.println("Fails");
 break;
 case 'F':
 System.out.println("Get lost");
 break;
 default:
 break;

}
}
}

