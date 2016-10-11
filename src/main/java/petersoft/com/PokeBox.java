package petersoft.com;

import java.util.ArrayList;
import java.util.List;

public class PokeBox {


    public static final int MAX_SIZE = 100;

    List<Pokemon> pokemonList = new ArrayList<>();


    public void addToBox(Pokemon aPokemon) {
        if (pokemonList.size() == MAX_SIZE) {
            throw new IllegalStateException("You don't have any space left in your box of " + MAX_SIZE);
        }
        pokemonList.add(aPokemon);
    }


    public void removeFromBox(int index) {
        pokemonList.remove(index);
    }

    public void printPokeBox() {
        for (Pokemon p : pokemonList) System.out.print(p.getName()+ ", ");
        System.out.print(pokemonList.size());
        System.out.println();
    }


}
