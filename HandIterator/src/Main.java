import Bean.Book;
import Bean.BookShelf;
import Bean.BookShelf2;
import Interface.MyIterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("金瓶梅"));
        bookShelf.appendBook(new Book("西游记"));
        bookShelf.appendBook(new Book("水浒传"));
        bookShelf.appendBook(new Book("三国"));
        MyIterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            System.out.println(((Book)iterator.next()).getName());
        }

        //修改BookShelf实现形式之后
        BookShelf2 bookShelf2 = new BookShelf2(4);
        bookShelf2.appendBook(new Book("金瓶梅2"));
        bookShelf2.appendBook(new Book("西游记2"));
        bookShelf2.appendBook(new Book("水浒传2"));
        bookShelf2.appendBook(new Book("三国"));
        MyIterator iterator2 = bookShelf2.iterator();
        while (iterator2.hasNext()){
            System.out.println(((Book)iterator2.next()).getName());
        }
    }
}
