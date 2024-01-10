import java.nio.file.attribute.UserPrincipal;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setAbilityType("Barrier");


        System.out.println("Boss health:" + boss.getHealth());
        System.out.println("Boos damage:" + boss.getDamage());
        System.out.println("Boss ability type:" + boss.getAbilityType());


    }

}