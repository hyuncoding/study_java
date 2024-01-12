package anonymous;

public class Test {
	public static void main(String[] args) {
		Study study = new Study() {
			
			@Override
			public void setTopic(String topic) {
				System.out.println("주제: " + topic);
			}
		};
		
		study.setTopic("화학");
	}
}
