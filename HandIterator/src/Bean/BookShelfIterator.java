package Bean;

import Interface.MyIterator;
/*迭代器继承类*/
public class BookShelfIterator implements MyIterator {
    private BookShelf bookShelf;
    private int index;//表示当前书架书籍的索引号

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf=bookShelf;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        if (index >= bookShelf.getLength()) {
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        if (hasNext()){
            return bookShelf.getBookAt(index++);
        }
        return null;
    }
}
