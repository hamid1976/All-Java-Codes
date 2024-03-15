import java.util.*;

class ArtificialDoctor{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("1.Fever \n2.Head Pain \n3.Stomic Pain");
		
		System.out.print("Enter Selection ");
		int medicines=as.nextInt();
		
		if(medicines==1){
			System.out.print("1.Malaria Fever \n2.Typhoid Fever \n3.Normal Fever");
			
			System.out.print("Enter Selection ");
			int fever=as.nextInt();
			
			if(fever==1){
				System.out.print("Chloroquine");
			}
			if(fever==2){
				System.out.print("Voltral");
			}
			if(fever==3){
				System.out.print("Penadol");
			}
			
			if(medicines==2){
				System.out.print("1.Head pain \n2.Migraine");
				
				System.out.print("Enter Selection");
				int headpain=as.nextInt();
				
				if(headpain==1){
					System.out.print("Aspirin");
				}
				if(headpain==2){
					System.out.print("Stress reliever");
				}
				if(medicines==3){
					System.out.print("1.Diarrhea \n2.Stomic pain");
					
					System.out.print("Enter Selection");
					int stomic=as.nextInt();
					
					if(stomic==1){
						System.out.print("Diprofloxacin");
					}
					if(stomic==2){
						System.out.print("ENO");
					}
					
					
					
					
				}
				
				
			}
			
			
		}
		
	}
}