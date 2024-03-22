package day09_static;

// data class : Document
class Document{
	
	// static 필드
	static int cnt = 0;
	
	// non-static 필드
	String filename;
	
	// Constructor
	Document(){ filename = "새 텍스트 문서" + (++cnt) + ".txt"; }
	Document(String filename){ this.filename = filename; }
	
	// Method
	void printDoc() { System.out.println(filename); }
}

public class Ex04_Document {
	public static void main(String[] args) {
		
		Document doc1 = new Document();
		Document doc2 = new Document();
		Document doc3 = new Document();
		Document doc4 = new Document("자바.txt");
		Document doc5 = new Document();
		
		doc1.printDoc();
		doc2.printDoc();
		doc3.printDoc();
		doc4.printDoc();
		doc5.printDoc();
		
	}
}
