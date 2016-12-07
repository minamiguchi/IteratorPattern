public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		// ごにょごにょ
		Iterator it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getTitle());
		}
	}
}
