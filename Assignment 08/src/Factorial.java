class FactorialException extends Exception {
    private int number;

    public FactorialException(int number) {
        this.number = number;
    }

    public String toString() {
        return "FactorialException: " + number + " is out of range (0-15)";
    }
}

class Factorial {
    public static void main(String[] args) {
        int n = 0;
        int result = 1;

        try {
            for(int i = 0; i < args.length; i++) {
                n = Integer.parseInt(args[i]);
                if(n < 0 || n > 15) {
                    throw new FactorialException(n);
                }
                for(int j = n; j > 0; j--) {
                    result *= j;
                }
                System.out.println("Factorial of " + n + " is " + result);
                result = 1;
            }
        } catch(NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch(FactorialException e) {
            System.out.println(e);
        }
    }
}
