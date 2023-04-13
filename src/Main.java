public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Thief> thiefTeam = new Team<>();
        Team<Swordmen> swordsmens = new Team<>();
        archers.addPers(new Archer("Робин", 100, new RoundShield(), new Bow(20)))
                .addPers(new Archer("Гуд", 100, new Buckler(), new Bow(15)));
        thiefTeam.addPers(new Thief("Джек", 150, new LightShield(), new Knife()))
                .addPers(new Thief("Потрошитель", 150, new Buckler(), new Knife()));
        swordsmens.addPers(new Swordmen("Ланселот", 200, new TowerShield(), new Sword()))
                .addPers(new Swordmen("Дон Кихот", 200, new TowerShield(), new Sword()));
        System.out.println(archers);
        System.out.println();
        System.out.println(thiefTeam);
        System.out.println();
        System.out.println(swordsmens);
        System.out.println();


        Archer robin = new Archer("Робин", 50, new Buckler(), new Bow(20));
        Archer gud = new Archer("Гуд", 50, new Buckler(), new Bow(50));
        Battle fight = new Battle(robin,gud);
        fight.run();
    }
}