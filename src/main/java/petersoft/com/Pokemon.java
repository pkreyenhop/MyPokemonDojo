package petersoft.com;

abstract class Pokemon implements Comparable<Pokemon> {

    private int pokeDexNumber;
    private int cp;
    private int health = 100;
    private String name = "";

    public int getPokeDexNumber() {
        return pokeDexNumber;
    }

    //todo non default constructor

    public void setPokeDexNumber(int pokeDexNumber) {
        this.pokeDexNumber = pokeDexNumber;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int compareTo(Pokemon other) {
        return Integer.compare(this.pokeDexNumber, other.pokeDexNumber);
    }


    private enum Moves {
        burp, fart, scratch, sleep;

        Moves() {
        }
    }

}
