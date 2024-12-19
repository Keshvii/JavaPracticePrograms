/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.java;


class QuadraticEqu {
    private double coef_xsqu;
    private double coef_x;
    private double const_x;

    public void setEquation(double coef_xsqu, double coef_x, double const_x) {
        this.coef_xsqu = coef_xsqu;
        this.coef_x = coef_x;
        this.const_x = const_x;
    }

    public double getCoef_xsqu() {
        return coef_xsqu;
    }

    public double getCoef_x() {
        return coef_x;
    }

    public double getConst_x() {
        return const_x;
    }

    public void print() {
        System.out.println(coef_xsqu + "x^2 + " + coef_x + "x + " + const_x);
    }

    public QuadraticEqu addEquations(QuadraticEqu equ2) {
        QuadraticEqu result = new QuadraticEqu();
        result.coef_xsqu = this.coef_xsqu + equ2.coef_xsqu;
        result.coef_x = this.coef_x + equ2.coef_x;
        result.const_x = this.const_x + equ2.const_x;
        return result;
    }

    public QuadraticEqu subtractEquations(QuadraticEqu equ2) {
        QuadraticEqu result = new QuadraticEqu();
        result.coef_xsqu = this.coef_xsqu - equ2.coef_xsqu;
        result.coef_x = this.coef_x - equ2.coef_x;
        result.const_x = this.const_x - equ2.const_x;
        return result;
    }
}

public class  quadeq{
    public static void main(String[] args) {
        QuadraticEqu equation1 = new QuadraticEqu();
        QuadraticEqu equation2 = new QuadraticEqu();

        equation1.setEquation(2, 3, 4);
        equation2.setEquation(1, 2, 1);

        System.out.println("Equation 1:");
        equation1.print();

        System.out.println("Equation 2:");
        equation2.print();

        System.out.println("\nAfter addition:");
        QuadraticEqu sumEquation = equation1.addEquations(equation2);
        sumEquation.print();

        System.out.println("\nAfter subtraction:");
        QuadraticEqu diffEquation = equation1.subtractEquations(equation2);
        diffEquation.print();
    }
}
