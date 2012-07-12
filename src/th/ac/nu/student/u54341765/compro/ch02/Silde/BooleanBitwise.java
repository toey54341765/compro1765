/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.student.u54341765.compro.ch02.Silde;

/**
 *
 * @author KonLak
 */
public class BooleanBitwise {
  public static void main(String[] args) {
finalint A = 1234;
finalint B = 9876;
System.out.println("A = " + Integer.toBinaryString(A));
System.out.println("B = " + Integer.toBinaryString(B));
System.out.println("A & B = " + Integer.toBinaryString(A & B));
System.out.println("A | B = " + Integer.toBinaryString(A | B));
System.out.println("A ^ B = " + Integer.toBinaryString(A ^ B));
System.out.println("A >> 4 = " + Integer.toBinaryString(A >> 4));
System.out.println("A << 4 = " + Integer.toBinaryString(A << 4));
System.out.println("~A = " + Integer.toBinaryString(~A));
System.out.println("-A = " + Integer.toBinaryString(-A));
System.out.println("-A >> 4 = " + Integer.toBinaryString(-A >> 4));
System.out.println("-A >>> 4 = " + Integer.toBinaryString(-A >>> 4));
 }
  
}
