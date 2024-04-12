public class PlayerProfile {
    String name;
    String username;
    int xp;
    int goldCoins;
    int userID;
    String homeGround;
    Archer archer;
    Knight knight;
    Mage mage;
    Healer healer;
    MythicalCreature mythicalCreature;

    public PlayerProfile(String name, String username, int xp, int goldCoins, int userID,String homeGround,
                         Archer archer, Knight knight, Mage mage, Healer healer, MythicalCreature mythicalCreature) {
        this.name = name;
        this.username = username;
        this.xp = xp;
        this.goldCoins = goldCoins;
        this.userID=userID;
        this.homeGround = homeGround;
        this.archer = (Archer) archer.clone();
        this.knight = (Knight) knight.clone();
        this.mage = (Mage) mage.clone();
        this.healer = (Healer) healer.clone();
        this.mythicalCreature = (MythicalCreature) mythicalCreature.clone();
    }

    public void displayPlayerProfile(){
        System.out.println("Name: " + name);
        System.out.println("Username: " + username);
        System.out.println("XP: " + xp);
        System.out.println("Archer: " + archer.getType());
        System.out.println("Knight: " + knight.getType());
        System.out.println("Mage: " + mage.getType());
        System.out.println("Healer: " + healer.getType());
        System.out.println("Mythical Creature: " + mythicalCreature.getType());
    }
}
