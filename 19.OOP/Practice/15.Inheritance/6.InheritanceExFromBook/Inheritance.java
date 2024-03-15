import java.util.*;
class Question{
	private String text;
	private String answer;
	
	 Question(){
		text="";
		answer="";
	}
	void setText(String a){
		text=a;
	}
	void setAnswer(String b){
		answer=b;
	}
	boolean checkAnswer(String c){
		return c.equals(answer);
	}
	void display(){
		System.out.println(text);
	}
}

class Inheritance{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		Question q=new Question();
		q.setText("Who was the inventor of Java:");
		q.setAnswer("James Gosling");
		
		q.display();
		System.out.print("Your answer:");
		String c=ob.nextLine();
		System.out.println(q.checkAnswer(c));
	}
}