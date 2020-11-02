package Pr10;

import Pr10.Complex;
import Pr10.ComplexAbstractFactory;
import Pr10.ConcreteFactory;


public class Main {
    public static void main(String[] args)
    {
        Complex a=new Complex(65,4);
        System.out.println(a);

        ComplexAbstractFactory b = new ConcreteFactory();
        Complex c = b.CreateComplex(545, 365);
        System.out.println(c);

        ConcreteFactory d = new ConcreteFactory();
        Complex f = d.CreateComplex(1, 1);
        System.out.println(f);
    }
}
