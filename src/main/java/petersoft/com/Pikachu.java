package petersoft.com;

public class Pikachu extends Pokemon {
    public Pikachu() {
        this.setPokeDexNumber(1);
        this.setCp(100);
        this.setName(this.getClass().getSimpleName());
    }
}
