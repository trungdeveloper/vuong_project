package project;

/**
 *
 * @author vuong.thai22
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        ArrayList<Human> people = new ArrayList();
        ArrayList<Book> books = new ArrayList();

        int choose = 0;
        do {

            System.out.print("            Choose the work you want to do\n\n");
            System.out.print("            1. Sign up reader\n");
            System.out.print("            2. Enter book \n");
            System.out.print("            3. Borrow book \n");
            System.out.print("            4. Give back book\n");
            System.out.print("            5. List reader\n");
            System.out.print("            6. List book\n");
            System.out.print("            7. Exist programme\n");

            Scanner input = new Scanner(System.in);
            int number;
            do {
                System.out.print("Your choice is: ");
                number = input.nextInt();
            } while (number < 0 && number > 6);

            switch (number) {
                case 1: {
                    do {

                        System.out.print("\n\t\t     ==========Sign up========\n");
                        Librarian librarian = new Librarian();
                        librarian.signUp(people);
                        System.out.println("\n-----------------------------------------------------------------------------");
                        System.out.print("Enter 1 to CONTINUE, Enter 0 to BACK ");
                        choose = input.nextInt();
                    } while (choose == 1);
                    break;
                }

                case 2: {
                    int a;
                    do {
                        Librarian librarian = new Librarian();
                        System.out.println("\t\t     ============Input book============\n");
                        System.out.println("Choose the category of books you want to import:");
                        librarian.inputBook(books);
                        System.out.println("\n-----------------------------------------------------------------------------");
                        System.out.print("Enter 1 to CONTINUE, Enter 0 to BACK ");
                        choose = input.nextInt();
                    } while (choose == 1);
                    break;
                }
                case 3: {

                }
                case 4: {

                }
                case 5: {
                    do {
                        Librarian librarian = new Librarian();
                        librarian.displayListPeople(people);
                        System.out.print("Enter 0 to BACK ");
                        choose = input.nextInt();
                    } while (choose == 1);
                    break;
                }
                case 6: {
                    do {
                        System.out.println("\n\t\t ==========List of book=========\n");
                        Librarian librarian = new Librarian();
                        librarian.displayListBook(books);
                    } while (choose == 1);
                    break;
                }
                case 7: {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("Thanks for you using the program");
                    System.exit(0);
                    break;
                }
            }
        } while (choose == 0);
    }
}
