package petersoft.com;

import java.util.Set;
import java.util.TreeSet;

public class PokeDex {


    public static final int MAX_SIZE = 100;

    Set<Pokemon> pokemonSet = new TreeSet<>();


    public void addToDeck(Pokemon aPokemon) {
        if (pokemonSet.size() == MAX_SIZE) {
            throw new IllegalStateException("List is already at maximum size of " + MAX_SIZE);
        }
        pokemonSet.add(aPokemon);
    }

//todo fix remove from set
    public void removeFromDeck(int index) {
        pokemonSet.remove(index);
    }

    public void printPokedex() {
        for (Pokemon p : pokemonSet) System.out.print(p.getName()+ ", ");
        System.out.print(pokemonSet.size());
        System.out.println();
    }


}
