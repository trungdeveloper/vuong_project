package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Librarian extends Human {

    public Librarian() {
        this.career = "Librarian";
    }

    public Librarian(String name, int age, String address, String phone) {
        super(name, age, address, phone);
        this.career = "Librarian";
    }

    public void signUp(ArrayList<Human> people) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("You are:");
            System.out.println("1.Teacher\n2.Student\n");
            System.out.print("Your choice is: ");
            number = input.nextInt();
        } while (number < 0 && number > 2);

        String name, address, phone;
        int age;

        System.out.print("Enter name: ");
        name = new Scanner(System.in).nextLine();
        System.out.print("Enter phone number: ");
        phone = new Scanner(System.in).nextLine();
        System.out.print("Enter age: ");
        age = new Scanner(System.in).nextInt();
        System.out.print("Enter address: ");
        address = new Scanner(System.in).nextLine();

        Human person = null;

        switch (number) {
            case 1: {
                String faculty;
                System.out.print("Enter the faculty: ");
                faculty = new Scanner(System.in).nextLine();
                
                person = new Teacher(name, age, address, phone, faculty);
                break;
            }

            case 2: {
                String className;
                System.out.print("Enter your class: ");
                className = new Scanner(System.in).nextLine();
                
                person = new Student(name, age, address, phone, className);
                break;
            }
        }
        
        try {
            people.add(person);
        } catch (Exception e) {
            System.out.println("Opps, something went wrong! Please try again!");
            this.signUp(people);
        }

    }

    public void displayReader(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        System.out.println("\n\t\t ----------XEM DANH SACH BAN DOC----------\n");
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("List:");
            System.out.println("1.Teacher \n2.student \n");
            System.out.print("Your choice is : ");
            number = input.nextInt();
        } while (number < 0 && number > 2);

        switch (number) {
            case 1: {
                System.out.println("ID | Name       | Faculty       | Phone number    | Age");
                System.out.println("-------------------------------------------------------------------------");
                for (int i = 0; i < teachers.size(); i++) {
                    System.out.println(teachers.get(i).getId() + "  |" + teachers.get(i).getName() + "        |"
                            + "|" + teachers.get(i).getFaculty() + "        |" + teachers.get(i).getPhone() + "      |" + teachers.get(i).getAge());
                }
            }
            break;
            case 2: {
                System.out.println("ID | Name       | Class       | Phone number     | Age ");
                System.out.println("-------------------------------------------------------------------------");
                for (int i = 0; i < students.size(); i++) {
                    System.out.println(students.get(i).getId() + " |" + students.get(i).getName() + " |"
                            + "|" + students.get(i).getClassName() + students.get(i).getPhone() + " |" + students.get(i).getAge());
                }
            }
            break;
        }
    }

    public void inputBook(ArrayList<Book> books) {
        Scanner input = new Scanner(System.in);
        int number, rankNumber;
        String name, authorName, publisher, dateOfPurchase;
        double price;

        do {
            System.out.println("1.Reference book\n2.Newspaper\n3.Comics book");
            System.out.println("Your choice is:");
            number = input.nextInt();
        } while (number >= 1 && number <= 3);

        System.out.println("Enter the name of the book: ");
        name = new Scanner(System.in).nextLine();
        System.out.println("Enter the author of the book: ");
        authorName = new Scanner(System.in).nextLine();
        System.out.println("Enter the Publisher of the book: ");
        publisher = new Scanner(System.in).nextLine();
        System.out.println("Date is: ");
        dateOfPurchase = new Scanner(System.in).nextLine();
        System.out.println("Price is: ");
        price = new Scanner(System.in).nextDouble();
        System.out.println("Rack is: ");
        rankNumber = new Scanner(System.in).nextInt();

        Book book = null;

        switch (number) {
            case 1: {
                book = new Reference(name, authorName, publisher, price, dateOfPurchase, rankNumber);
                break;
            }
            case 2: {
                book = new Newspaper(name, authorName, publisher, price, dateOfPurchase, rankNumber);
                break;
            }
            case 3: {
                book = new Comic(name, authorName, publisher, price, dateOfPurchase, rankNumber);
                break;
            }
        }

        try {
            books.add(book);
        } catch (Exception e) {
            System.out.println("Opps, something went wrong! Please try again!");
            this.inputBook(books);
        }
    }

    public void displayListBook(ArrayList<Book> books) {
        for (Book book : books) {
            book.display();
        }
    }

    public void displayListPeople(ArrayList<Human> people) {
        for (Human human : people) {
            human.display();
        }
    }

}
