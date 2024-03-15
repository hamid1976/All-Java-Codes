class Insertion{
	public static void main(String arg[]){
		int data []={90,60,20,30,40};
		int data1[]={0};
		int item=500;
		int loc=2;
		boolean b=false;
		for(int i=0; i<data.length; i++){
			if(i==loc||b==true){
				data[i]=data1[0];//20
				//item    =data1[0];//20
				//data[i]=data1[0];//20
				data[i]=item;
				//System.out.println(data1[0]);
				data1[0] =data1[0];//500
				//data[]
				b=true;
			}
			data1[0]=data[i];
			System.out.println(data1[0]);
		}
	}
}