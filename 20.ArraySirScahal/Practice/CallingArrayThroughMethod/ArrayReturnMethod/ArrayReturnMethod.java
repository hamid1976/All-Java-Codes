class Test{
	int addScores(int values[]){
		int totalScore=0;
		for(int i=0; i<values.length; i++){
			totalScore=totalScore + values[i];
		}
			return totalScore;
	}
}
class ArrayReturnMethod{
	public static void main(String arg[]){
		Test ob=new Test();
		int scores[]={10,9,7,10};
		
		int a=ob.addScores(scores);
		System.out.println(a);
	}
}