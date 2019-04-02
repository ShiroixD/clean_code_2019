package pl.zzpj2019.solid.srp.book.solution;

import java.util.Map;

public class BookPrinter implements Printable {
    @Override
    public void printPage(final Book book, int pageNumber) {
        System.out.println(book.getPages().get(pageNumber));
    }

    @Override
    public String printAllPages(final Book book) {
        String allPages = new String();
        for(Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            allPages += (page.getKey() + " " + page.getValue());
        }
        return  allPages;
    }
}
