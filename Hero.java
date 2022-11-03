import java.util.*;

public class Hero {
    static int deathCount;
    String name;
    int hp;
    int power;
    int attack;
    char []heros={'A','B','C','D','E','F','G','H','I','J'};
    char hero;

    Hero(int hp,int power,int attack,char[] heros){
        this.hp=hp;
        this.power=power;
        this.attack=attack;
     

    }
    public int attack(){
        Random rand=new Random();
        attack=rand.nextInt(49)+100;
        return attack;
    }
    Random rand=new Random();
    String showInfo(){
       for(int i=0;i<heros.length;i++){
      hero=heros[i];
      this.hp=rand.nextInt(69)+31;
      power=rand.nextInt(49)+51;
      System.out.printf("%c(hp:%d,power:%d)",hero,hp,power);
      System.out.println();
       }
      return name;
    }
    Demon dn=new Demon(hp, attack);
    int lightning=dn.lightning();
    void beAttacked(){
        for(int i=0;i<heros.length;i++){
        this.hp-=lightning;
        System.out.printf("%sは%dのダメージを受けた(hp:%d)",heros[i],lightning,this.hp);
        System.out.println();
        if(this.hp<=0){
            System.out.printf("%sは力尽きた。",heros[i]);
            deathCount++;
            System.out.println();
        }
        }
       
    
    }
  

    }
    

