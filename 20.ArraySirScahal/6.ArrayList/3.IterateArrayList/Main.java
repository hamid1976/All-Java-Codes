import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("world");
        stringList.add("!");
		
		//using simple for loop
		for(int i=0; i<stringList.size(); i++){
			System.out.println(stringList.get(i));
		}
		
        // Iterate over the list using a foreach loop
        for (String str : stringList) {
            System.out.println(str);
        }
		
		// Iterate over the list using forEach method and lambda expression
        stringList.forEach(str -> 
			System.out.println(str)
		);
    }
}
