package day08_inheritance2;

// super
class Song{
	// Field
	String title;
	String genre;
	double playTime;
	
	// Constructor
	Song(String title, String genre, double playTime){
		this.title = title;
		this.genre = genre;
		this.playTime = playTime;
	}
	
	// Method
	void printSong() {
		System.out.println("노래제목 : " + title + "\n장르 : " + genre + " (" + playTime + "분)");
	}
}

class Singer extends Song{
	// Field
	String name;
	String company;
	
	// Constructor
	Singer(String name, String company, String title, String genre, double playTime){
		super(title, genre, playTime);
		this.name = name;
		this.company = company;
	}
	
	// Method
	void printSinger() {
		System.out.println("가수이름 : " + name);
		System.out.println("소속사 : " + company);
		printSong();
		System.out.println("-----------------------");		
	}
}

public class Ex03_Singer {
	public static void main(String[] args) {
		
		Singer singer = new Singer("뉴진스", "HYBE", "Ditto", "Baltimore Club Dance Music", 3.1);
		
		singer.printSinger();
		
	}
}
