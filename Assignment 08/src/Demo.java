class NOMATCHEXCP extends Exception {
    private String inputString;

    public NOMATCHEXCP(int lineNo, String inputString) {
        this.inputString = inputString;
        System.out.println("NOMATCHEXCP: Error at line " + lineNo + ": " + inputString + " is not equal to India");
    }
}

class Demo {
    public static void main(String[] args) {
        try {
            if(!args[0].equals("India")) {
                throw new NOMATCHEXCP(1, args[0]);
            } else {
                System.out.println("The input string is equal to India");
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch(NOMATCHEXCP e) {
            // exception message is printed in the constructor
        }
    }
}
