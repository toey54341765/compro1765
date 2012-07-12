
package th.ac.nu.student.u54341765.compro.ch02.Silde;

/**
 *
 * @author KonLak
 */
public class Associativity {
    public static void main(String[] args) {
int x, y, z;
 x = y = z = 1;
System.out.println("x = " + x + ", y = " + y + ", z = " + z);
System.out.println(32 % 7 % 3); // 1
System.out.println((32 % 7) % 3); // 1
System.out.println(32 % (7 % 3)); // 0
 }

}
