import java.util.*;

class ArtificialDoctor{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("\n1.Fever \n2.Head Pain \n3.Stomic Pain");
		
		System.out.print("\nEnter Selection ");
		int medicines=as.nextInt();
		
		if(medicines==1){
				System.out.print("\n1.Malaria Fever \n2.Typhoid Fever \n3.Normal Fever");
			
			System.out.print("\nEnter Selection ");
			int fever=as.nextInt();
			
			if(fever==1)
				System.out.print("\nChloroquine");
			
			if(fever==2)
				System.out.print("\nVoltral");
			
			if(fever==3)
				System.out.print("\nPenadol");
		}	
		
		
			if(medicines==2){
				System.out.print("\n1.Head pain \n2.Migraine");
				
				System.out.print("\nEnter Selection ");
				int headpain=as.nextInt();
				
				if(headpain==1)
					System.out.print("\nAspirin");
				
				if(headpain==2)
					System.out.print("\nStress reliever");
				
			}
				if(medicines==3){
					System.out.print("\n1.Diarrhea \n2.Stomic pain");
					
					System.out.print("\nEnter Selection ");
					int stomic=as.nextInt();
					
					if(stomic==1)
						System.out.print("\nDiprofloxacin");
					
					if(stomic==2)
						System.out.print("\nENO");
					
					
				}
					
					
				
				
				
			
			
			
		
		
	}
}