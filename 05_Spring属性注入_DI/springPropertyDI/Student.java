package springPropertyDI;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	private String name;

	private Address addr;  //引用对象注入

	private String[] books;  //数组注入

	private List<String> hobbies;  //List注入

	private Map<String, String> cards;  //Map注入

	private Set<String> games; //Set注入

	private String wife;  //空对象注入

	private Properties info;  //Property注入

	public void show() {
		System.out.println("name=" + name + "  addr=" + addr.getAddress());
		System.out.println("books=");
		for (int i = 0; i < books.length; i++) {
			System.out.print(books[i] + "  ");
		}
		System.out.println();
		System.out.println("hobbies=" + hobbies);
		System.out.println("cards=" + cards);
		System.out.println("games=" + games);
		System.out.println("wife=" + wife);
		System.out.println("info=" + info);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public void setBooks(String[] books) {
		this.books = books;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public void setCards(Map<String, String> card) {
		this.cards = card;
	}

	public void setGames(Set<String> games) {
		this.games = games;
	}

	public void setWife(String wife) {
		this.wife = wife;
	}

	public void setInfo(Properties info) {
		this.info = info;
	}

}
