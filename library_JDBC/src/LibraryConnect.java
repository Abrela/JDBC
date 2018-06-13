import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LibraryConnect {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LibraryUpdate libraryUpdate = new LibraryUpdate();
        LibraryDelete libraryDelete = new LibraryDelete();
        LibrarySave librarySave = new LibrarySave();
        LibraryRead libraryRead = new LibraryRead();

        int input;


        while (true){
            System.out.println("-----------------------------------------------------------");
            System.out.println("Wybierz opcję: \n 1 - Dodaj nowy rekord \n 2 - Wyświetl wszystkie ksiązki \n 3 - Usuwanie \n 4 - Aktualizacja");
            System.out.println("-----------------------------------------------------------");

              do{
                  input = 0;
                  input = sc.nextInt();
                    switch (input){
                        case 1:
                            System.out.println("Podaj Tytuł");
                            String title = null;
                            try {
                                title = br.readLine();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Podaj Autora");
                            String author = null;
                            try {
                                author = br.readLine();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Podaj ISBN");
                            String isbn = null;
                            try {
                                isbn = br.readLine();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Podaj rok wydania");
                            int year = 0;
                            try {
                                year = Integer.parseInt(br.readLine());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                            Book book = new Book(title,author, isbn, year);

                            librarySave.save(book);
                            System.out.println("\n");
                            System.out.println("Książka dodana!");
                            break;
                        case 2:
                            libraryRead.readAll();
                            System.out.println("\n");
                            break;
                        case 3:
                            System.out.println("Podaj id rekordu, który chcesz usunąć");
                            Long ID = 0L;
                            try {
                                ID = Long.parseLong(br.readLine());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            libraryDelete.delete(ID);

                            System.out.println("\n");
                            break;
                        case 4:
                            System.out.println("Podaj id");
                            ID = 0L;
                            try {
                                ID = Long.parseLong(br.readLine());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }


                            System.out.println("Podaj tytuł");
                            title = null;
                            try {
                                title = br.readLine();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Podaj autora");
                            author = null;
                            try {
                                author = br.readLine();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Podaj ISBN");
                            isbn = null;
                            try {
                                isbn = br.readLine();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Podaj rok wydania");
                            year = 0;
                            try {
                                year = Integer.parseInt(br.readLine());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                            book = new Book(ID,title,author, isbn, year);

                            libraryUpdate.update(book);

                            System.out.println("\n");
                            break;
                    }


                }while(input!=0);

            }

        }


    }

