package Bean;

import Interface.MyAggregate;
import Interface.MyIterator;

public class BookShelf implements MyAggregate {
    private Book[] books;
    private int last=0;//用于标记书籍的末尾索引
    public BookShelf(int maxSize){
        books=new Book[maxSize];
    }
    public Book getBookAt(int index){
        return books[index];
    }
    public void appendBook(Book book){
        books[last++]=book;
    }
    public int getLength(){
        return last;
    }
    @Override
    public MyIterator iterator() {
        return new BookShelfIterator(this);
    }
}
