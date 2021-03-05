package Bean;

import Interface.MyAggregate;
import Interface.MyIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 更改了书籍的容器形式
 */
public class BookShelf2 implements MyAggregate {
    private List<Book> books;
    private int last=0;//用于标记书籍的末尾索引
    public BookShelf2(int maxSize){
        books=new ArrayList<>(maxSize);
    }
    public int getLength(){
        return last;
    }
    public Book getBookAt(int index){
        return books.get(index);
    }
    public void appendBook(Book book){
        books.add(book);
        last++;
    }

    @Override
    public MyIterator iterator() {
        return new BookShelf2Iterator(this);
    }
}
