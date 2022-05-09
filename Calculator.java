public class Calculator {
    int x;
    int y;

    public Calculator (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int sum() {
        int result1;
        result1 = x + y;
        return result1;
    }

    public int subtract() {
        int result2;
        result2 = x - y;
        return result2;
    }

    public static void main (String[] args) {
        Calculator calculator = new Calculator(10, 5);
        int tempSum = 0;
        int tempSubtract = 0;
        tempSum = calculator.sum();
        tempSubtract = calculator.subtract();
        System.out.println("Sum of " + calculator.getX() + " and " + calculator.getY() + " is: " + tempSum);
        System.out.println("Subtraction of " + calculator.getX() + " and " + calculator.getY() + " is: " + tempSubtract);

    }
}