package variables;

/**
 * MultiAndDivide
 * 
 * The / operator performs interger division which returns as result
 * without the remainder
 * 
 * Any number divided by 0 will return an ArithemticException
 * 
 */
public class MultiAndDivide {

    public static void main(String[] args) {
        double subtotal = 30;
        double tax = 0.0875;
    
        double total = subtotal + (subtotal * tax);    
        System.out.println(total);

        double perPerson = total / 4;
        System.out.println(perPerson);

    }
}