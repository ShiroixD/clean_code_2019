package pl.zzpj2019.solid.srp.book.solution;

public class BookReader implements Readable {
    private int currentPage = 0;

    @Override
    public void turnPage()  {
        currentPage ++;
    }

    @Override
    public String getCurrentPageContents(final Book book) {
        return book.getPages().get(currentPage);
    }
}
