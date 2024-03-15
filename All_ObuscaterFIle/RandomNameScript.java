import java.util.Random;

class RandomNameScript{
static String ramdomNameGenerate(){
    
    String aToZ="aBCDExGHsJKsassASdKJDSADhYZ";
    Random rnd=new Random();
        
    StringBuilder res=new StringBuilder();
    for (int i = 0; i < aToZ.length(); i++) {
    
          //int index = (int)  (rnd.nextFloat() * aToZ.length());
        int randIndex=rnd.nextInt(aToZ.length()); 
         res.append(aToZ.charAt(randIndex));            
        }
      return res.toString();
     }
}


