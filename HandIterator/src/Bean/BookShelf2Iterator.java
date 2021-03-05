package Bean;

import Interface.MyIterator;

public class BookShelf2Iterator implements MyIterator {
    private BookShelf2 bookShelf2;
    private int index=0;
    @Override
    public boolean hasNext() {
        if (index>=bookShelf2.getLength()){
            return false;
        }else{
            return true;
        }
    }
    public BookShelf2Iterator(BookShelf2 bookShelf2){
        this.bookShelf2=bookShelf2;
    }
    @Override
    public Object next() {
        Book book=bookShelf2.getBookAt(index);
        index++;
        return book;
    }
}
