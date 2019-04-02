package pl.zzpj2019.solid.srp.book.solution;

public interface Printable {
    void printPage(final Book book, int pageNumber);
    String printAllPages(final Book book);
}
