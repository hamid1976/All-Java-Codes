import java.util.*;
class RemoveMatchesFor{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		ArrayList<String> words = new ArrayList<String>();
		
		while(ob.hasNext()){
			words.add(ob.nextString());
		}
		
		for(int i=0; i<words.size();  i++){
			
			String word=words.get(i);
			if(word.length()<4){
				words.remove(i);
			}
		}
		System.out.print(words);
	}
}