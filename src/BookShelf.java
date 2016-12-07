import java.util.ArrayList;

public class BookShelf implements Aggregate {
	private ArrayList<Book> books;

	public BookShelf() {
		books = new ArrayList<Book>();
	}

	public Book getBookAt(int index) throws IndexOutOfBoundsException {
		return books.get(index);
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public int getLength() {
		return books.size();
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
