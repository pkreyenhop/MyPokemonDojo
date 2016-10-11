package petersoft.com;

abstract class Pokemon implements Comparable <Pokemon> {

    public int getPokeDexNumber() {
        return pokeDexNumber;
    }

    public void setPokeDexNumber(int pokeDexNumber) {
        this.pokeDexNumber = pokeDexNumber;
    }

    private int pokeDexNumber;
    private int cp;


    public int getHealth() {
        return health;
    }

    //todo non default constructor

    public void setHealth(int health) {
        this.health = health;
    }

    private int health = 100;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "";

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    private enum Moves {
        burp, fart, scratch, sleep;

        Moves() {
        }
    }


    public int compareTo(Pokemon other) {
        return Integer.compare(this.pokeDexNumber, other.pokeDexNumber);
    }

}
