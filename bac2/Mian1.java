package thang;

import java.util.Scanner;

public class Mian1 {

    public static void main(String[] args) {
        double a,b,c;
        System.out.println("Enter a,b,c: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        Equation qe = new Equation(a, b, c);
        if(qe.getDiscriminant()<0) System.out.println("The equation has no roots");
        else if(qe.getDiscriminant()==0) System.out.println("The equation has one root: "+qe.getRoot1());
        else{
            System.out.println("The equation has two roots: ");
            System.out.println("Denta is: "+qe.getDiscriminant());
            System.out.println("Root1 is: "+qe.getRoot1());
            System.out.println("Root2 is: "+qe.getRoot2());
        }
    }

}