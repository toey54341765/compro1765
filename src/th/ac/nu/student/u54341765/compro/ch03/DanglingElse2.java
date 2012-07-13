/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.student.u54341765.compro.ch03;

/**
 *
 * @author KonLak
 */
public class DanglingElse2 {
   public static void main(String[] args) {
int x = 5;
 if (x < 5)
 if (x > 5)
 System.out.println('b');
 else
 System.out.println('a');
 }
 } 

