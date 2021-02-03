public class ComplexNumber {
    // for real and imaginary parts of complex numbers
    double real, img;

    // constructor to initialize the complex number
    ComplexNumber(double r, double i) {
        this.real = r;
        this.img = i;
    }

    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
        // creating a temporary complex number to hold the sum of two numbers
        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;

        // returning the output complex number
        return temp;
    }

    public static void main(String args[]) {
        ComplexNumber c1 = new ComplexNumber(43.2, 9);
        ComplexNumber c2 = new ComplexNumber(23.6, 5.5);
        ComplexNumber temp = sum(c1, c2);
        System.out.printf("\nSum is: " + temp.real + " + " + temp.img + "i \n");
    }
}