package desgin.Iterator;

import java.util.*;

public class Iterator01 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,5,6,7,8};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("++++++++++++++++++++");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("++++++++++++++++++++");
        Iterator<Integer> iterator = Arrays.stream(arr).iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
// 최고 조상
class Book{
    private String name;

    public Book(String book){
        this.name = book;
    }
    public String getName(){
        return this.name;
    }
}
//2번째 조상
class BookShelf implements Iterable<Book>{
    private ArrayList <Book> books;
    private int last = 0;

    public BookShelf(int maxsize){
        this.books = new ArrayList<>();
    }

    public Book getBookAt(int index){
        return books.get(index);
    }
    public void appendBook(Book book){
        books.add(last++, book);
    }
    public int gtLength(){
        return last;
    }

    public Iterator<Book> iterator(){
        return new BoookShelfIterator(this);
    }
}
class BoookShelfIterator implements Iterator<Book>{
    private BookShelf boookShelf;
    private int index = 0;
    public BoookShelfIterator(BookShelf boookShelf){
        this.boookShelf = boookShelf;
    }

    public boolean hasNext(){
        return index< boookShelf.gtLength();
    }

    public Book next(){
        return boookShelf.getBookAt(index++);
    }
}
class BookIterator{
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World i n 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();
        for (Book book: bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();
    }
}


class Aa{
    public static void main(String[] args) {
        List<String> str = new LinkedList<>();
        str.add("1");
        str.add("2");
        str.add("2");
        str.add("3");
        str.add("4");
        str.add("4");
        str.add("4");
        str.add("5");
        str.add("6");
        str.add("6");
        str.add("6");
        str.add("7");
        Ab ab = new Ab(str);
        while(ab.hasNext()){
            System.out.println(ab.next());
        }
    }
}
class Ab<T extends List> implements Iterator<String> {
    T arr;
    int index = 0;
    public Ab(T arr){
        this.arr = arr;
    }
    public boolean hasNext(){
        if(index < arr.size()) return true;
        else return false;
    }
    public String next(){
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        return arr.get(index++).toString() + "2134";
    }
}