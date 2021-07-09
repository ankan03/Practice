//Write a program to create a class Complex which has 2 data members - real and imag. It has a constructor that takes 2 integer arguments and assign them to real and imag. It has three member functions - add(), subtract() and printComplex(). add() and subtract() methods return the sum and difference of two complex numbers respectively. printComplex() displays the complex number in a specified format. For eg - If real=1 and imag=-1, then it displays (1-1j). If the real part is 0, then only imag part is displayed(But the imag part is always displayed).
//
//The program takes 4 integers as input and creates 2 complex numbers from them. Then it displays the sum and difference of these 2 complex numbers respectively in separate lines.
//
//User Input Description:
//Real part of first complex number
//Imaginary part of first complex number
//Real part of second complex number
//Imaginary part of second complex number


//2
//3
//4
//9
//(6+12j)
//(-2-6j)

package myPerfectice;

import java.util.Scanner;

class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }

    public static Complex subtract(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.imag - b.imag));
    }

    public void printComplex() {
        String sign = "";
        if (imag >= 0) {
            sign = "+";
        }
        if (real == 0) {
            System.out.println("(" + sign + imag + "j)");
        } else {
            System.out.println("(" + real + sign + imag + "j)");
        }
    }
}

public class Q11 {
    public static void main(String[] args) {
        int a1, b1, a2, b2;
        Scanner s = new Scanner(System.in);
        a1 = s.nextInt();
        b1 = s.nextInt();
        a2 = s.nextInt();
        b2 = s.nextInt();
        Complex c = new Complex(a1, b1);
        Complex d = new Complex(a2, b2);
        Complex e = Complex.add(c, d);
        Complex f = Complex.subtract(c, d);
        e.printComplex();
        f.printComplex();
    }
}
