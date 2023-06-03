package cwh;

import java.util.Scanner;

class Library
{
   int k=0;
   String[] NameOfBooks=new String[100];
    /*I am going to create an array of type string.The name of the array is NameOfBooks.I am not going to enter the array elements,but reserve  100 memory locations*/
    Scanner sc=new Scanner(System.in);
    public void addBook() {
        int i;
        System.out.println("Number of books to be added:");
        int n=sc.nextInt();
        sc.nextLine();

        for(i=k;i<k+n;i++)
      {
        System.out.println("Enter Book Name:");
        NameOfBooks[i]= sc.nextLine();
        System.out.println(NameOfBooks[i]+" has been added");
      }
        k=i;
    }

    public void showAvailableBooks()
    {
        System.out.println("Available books are:");
        for (int i=0;i<NameOfBooks.length;i++)
        {
            if (NameOfBooks[i]== null)
                {
                    continue;
                }
                System.out.println(NameOfBooks[i]);
            }


    }
    public void issueBook()
    {
        int count=0;
        System.out.println("Enter name of book to be issued:");
        String IssueBooks= sc.nextLine();
        for (int i=0;i<NameOfBooks.length;i++) {
            if (IssueBooks.equals(NameOfBooks[i])) {
                System.out.println(NameOfBooks[i] + " has been issued");
                NameOfBooks[i] = null;
                count++;
            }
        }

            if (count==0)
            {
                System.out.println(IssueBooks+" is not available");
            }
        }

    public void returnBook()
    {
        addBook();
    }



}
public class OnlineLibrary {
    public static void main(String[] args) {
        /*
        1.You have to implement a library using Java Class "cwh.Library"
        2.Methods: addBook, issueBook, returnBook, showAvailableBooks
        3. Properties: Array to store the available books,
         Array to store the issued books*/

        Library CentralLibrary=new Library();

        System.out.println("1.Add Book");
        System.out.println("2.Return Book");
        System.out.println("3.Issue Book");
        System.out.println("4.Show Available Books");
        System.out.println("5.Exit");

        int choice;
        do {
            System.out.println("Enter choice:");
            Scanner sc= new Scanner(System.in);
             choice =sc.nextInt();

            switch (choice) {

                case 1:
                    CentralLibrary.addBook();
                    break;
                case 2:
                    CentralLibrary.returnBook();
                    break;
                case 3:
                    CentralLibrary.issueBook();
                    break;
                case 4:
                    CentralLibrary.showAvailableBooks();
                    break;
                case 5:
                    System.out.println("Good Bye");
                    break;
            }

        } while (choice != 5);
    }
}
