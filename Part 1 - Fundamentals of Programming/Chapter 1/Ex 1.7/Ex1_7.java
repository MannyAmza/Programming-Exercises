/*(Approximate pi) pi can be computed using the following formula:
pi = 4*(1-1/3+1/5-1/7+1/9-1/11+...)
Write a program that displays the result of 4*(1-1/3+1/5-1/7+1/9-1/11)
and 4*(1-1/3+1/5-1/7+1/9-1/11+1/13). Use 1.0 instead of 1 in your
program.
*/
public class Ex1_7 {
    public static void main(String[] args) {
        double pi1, pi2;
        double x1 = 1.0-(1/3)+(1/5)-(1/7)+(1/9)-(1/11);
        double x2 = 1.0-(1/3)+(1/5)-(1/7)+(1/9)-(1/11)+(1/13);
        pi1 = 4*x1;
        pi2 = 4*x2;

        System.out.println(pi1);
        System.out.println(pi2);
    }
}
