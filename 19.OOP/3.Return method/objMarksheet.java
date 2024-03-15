
class marksheet{
	int java ,vb,orcale,eng,cpp,Total,P;
	void set(int a,int b,int c,int d,int e){
		java = a;
		vb =b;
		orcale =c;
		eng=d;
		cpp= e;
	}
	void obtain(){
		System.out.println("java   :"+java);
		System.out.println("vb     :"+vb);
		System.out.println("orcle  :"+orcale);
		System.out.println("English:"+eng);
		System.out.println("cpp    :"+cpp+"\n");
		System.out.println("obtain mark "+(java+vb+orcale+eng+cpp));
	}
	void percentage(){
		  Total = 500;
          System.out.println("Total Mark "+ Total);
          P = (java+vb+orcale+eng+cpp)*100/Total;
          System.out.println("percentage :"+ P+"%");

	}
	void Grade(){
		if (P>=90 && P<=100)
		System.out.print("A-1 Grade "+"\n");
	    else
			if (P>=80 && P<=89)
		System.out.print("A Grade "+"\n");
	    else
			if (P>=70 && P<=79)
		System.out.print("B Grade "+"\n");
	    else 
			if (P>=60 && P<=69)
		System.out.print("C Grade "+"\n");
	    else 
			if (P>=50 && P<=59)
		System.out.print("D Grade "+"\n\n");
	    else  
			if (P>=40 && P<=49)
		System.out.print("E Grade "+"\n");
	    else 
		System.out.print("fale "+"\n");
	}
}
		
class objMarksheet{
	public static void main(String arg []){
		marksheet ob1=new marksheet();
		marksheet ob2=new marksheet();
		
		ob1.set(56,56,57,58,59);
		ob2.set(96,86,77,68,70);
		
        ob1.obtain();
		ob1.percentage();
		ob1.Grade();
		
		ob2.obtain();
		ob2.percentage();
		ob2.Grade();
	}
}
	