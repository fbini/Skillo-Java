package br.com.atividadesArrayList.HomeOffice.BookList;

import java.util.ArrayList;

public class MainBook {
    public static void main(String[] args) {
        Book book01 = new Book("Diário de um banana","James",2010);
        Book book02 = new Book("Eu, robô", " Isaac Asimov",2012);
        Book book03 = new Book("Fahrenheit 451","Ray Bradbury",2000);

        ArrayList<Book> listBook = new ArrayList<>();
        listBook.add(book01);
        listBook.add(book02);
        listBook.add(book03);

        for (Book book : listBook) {
            if (book.getYearPublished() >= 2010){
                System.out.println(book.getYearPublished());
            }
        }


    }
}
