package pkg_Stack;
import java.util.Scanner;

public class Main {
    static Fixed_stk fixStk = new Fixed_stk();
    static Growable_stk grwStk = new Growable_stk();
    public static void main(String[] args) {

        recursiveMenu();
    }

    public static void recursiveMenu() {
        // Main menu
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose sub-menu:");
        System.out.println("1. Fixed Stack");
        System.out.println("2. Growing Stack");
        System.out.println("3. Exit");
        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();

        // Sub-menu for Fixed Stack [Fixed_stk.java]
        if(choice == 1){
            System.out.println("\n\nSub-menu: Fixed Stack");
            System.out.println("Choose operation:");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Peek Element");
            System.out.println("4. Check if stack is empty");
            System.out.println("5. Check if stack is full");
            System.out.println("6. Clear stack");
            System.out.println("7. Display stack");
            System.out.println("8. Exit");
            System.out.print("\nEnter your choice: ");
            int choice_fix = sc.nextInt();

            if(choice_fix == 1){
                System.out.print("Enter element to push: ");
                int element_fix = sc.nextInt();
                fixStk.push(element_fix);
                recursiveMenu();
            }
            else if(choice_fix == 2){
                System.out.println("Popped element: " + fixStk.pop());
                recursiveMenu();
            }
            else if(choice_fix == 3){
                System.out.println("Peeked element: " + fixStk.peek());
                recursiveMenu();
            }
            else if(choice_fix == 4){
                System.out.println("Is stack empty? " + fixStk.isEmpty());
                recursiveMenu();
            }
            else if(choice_fix == 5){
                System.out.println("Is stack full? " + fixStk.isFull());
                recursiveMenu();
            }
            else if(choice_fix == 6){
                fixStk.clear();
                recursiveMenu();
            }
            else if(choice_fix == 7){
                fixStk.display();
                recursiveMenu();
            }
            else if(choice_fix == 8){
                System.exit(0);
                recursiveMenu();
            }
            else{
                System.out.println("Invalid choice");
                recursiveMenu();
            }

        }

        else if (choice == 2){
            Growable_stk grwStk = new Growable_stk();
            System.out.println("\n\nSub-menu: Growing Stack");
            System.out.println("Choose operation:");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Peek Element");
            System.out.println("4. Check if stack is empty");
            System.out.println("5. Check if stack is full");
            System.out.println("6. Clear stack");
            System.out.println("7. Display stack");
            System.out.println("8. Exit");
            System.out.print("\nEnter your choice: ");
            int choice_grow = sc.nextInt();

            if(choice_grow == 1){
                System.out.println("Enter element to push: ");
                int element_grow = sc.nextInt();
                grwStk.push(element_grow);
                recursiveMenu();
            }

            else if(choice_grow == 2){
                System.out.println("Popped element: " + grwStk.pop());
                recursiveMenu();
            }

            else if(choice_grow == 3){
                System.out.println("Peeked element: " + grwStk.peek());
                recursiveMenu();
            }

            else if(choice_grow == 4){
                System.out.println("Is stack empty? " + grwStk.isEmpty());
                recursiveMenu();
            }

            else if(choice_grow == 5){
                System.out.println("Is stack full? " + grwStk.isFull());
                recursiveMenu();
            }

            else if(choice_grow == 6){
                grwStk.clear();
                recursiveMenu();
            }

            else if(choice_grow == 7){
                grwStk.display();
                recursiveMenu();
            }

            else if(choice_grow == 8){
                System.exit(0);
                recursiveMenu();
            }

            else{
                System.out.println("Invalid choice");
                recursiveMenu();
            }


        }

        else if (choice == 3){
            System.exit(0);
        }

        else{
            System.out.println("Invalid choice");
            recursiveMenu();
        }
        sc.close();
    }
}