import java.util.Random;

/**
 * DemonApp
 */
public class DemonApp {

    public static void main(String[] args) {
        Demon dn=new Demon(0, 0);
        Random rand=new Random();

        int hp=rand.nextInt(199)+801;
        System.out.printf("デーモンが現れた。(Hp:%d)",hp);
        System.out.println();
        System.out.println("ヒーローが集まった。");
        Hero hero=new Hero(hp, hp, hp, null);
        String info=hero.showInfo();
        int lightning=dn.lightning();
        System.out.printf("デーモンが稲妻(%d)を放った",lightning);
        System.out.println();

        hero.beAttacked();  
        if(hero.deathCount>10){
            System.out.println("ヒーローたちは全滅した。");
        }  
    }

}