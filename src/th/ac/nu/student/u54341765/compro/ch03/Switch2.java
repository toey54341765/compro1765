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
public class Switch2 {
    public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 char grade = in.next().charAt(0);
 switch (grade) {
 case 'A':
 case 'B':
 case 'C':
 System.out.println("Passes");
 break;
 case 'D':
 case 'F':
 System.out.println("Fail");
 break;
 default:
 System.out.println("Invalid");
 break;
 }
 }
 }


