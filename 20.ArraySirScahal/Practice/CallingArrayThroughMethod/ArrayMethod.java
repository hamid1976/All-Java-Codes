class Test{
	void addScores(int[]values){
		int totalScore=0;
		for(int i=0; i<values.length; i++){
			totalScore=totalScore + values[i];
			System.out.println(totalScore);
		}
	}
}
class ArrayMethod{
	public static void main(String arg[]){
		Test ob=new Test();
		Test ob1=new Test();
		//int scores[]={10,9,7,10};
		ob.addScores(10);
		ob1.addScores(1,7,2,9);
	}
}