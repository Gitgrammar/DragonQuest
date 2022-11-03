import java.util.*;


public class Demon {
   int hp;
   int lightning; 

   Demon(int hp,int lighting){
    this.hp=hp;
    this.lightning=lightning;

   }
   public  int lightning(){
    Random rand=new Random();
    lightning=rand.nextInt(40)+11;
  
return lightning;
   }
   
}

