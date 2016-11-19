package petersoft.com;

import java.util.Set;
import java.util.TreeSet;

public class PokeDex {


    Set<Pokemon> pokemonSet = new TreeSet<>(); // No Duplicates in the dex!


    public void addToDeck(Pokemon aPokemon) {
        System.out.print(pokemonSet.size());
        pokemonSet.add(aPokemon);
    }

    //todo fix remove from set
    public void removeFromDeck(Pokemon aPokemon) {
        pokemonSet.remove(aPokemon);
    }

    public void printPokedex() {
        for (Pokemon p : pokemonSet) System.out.print(p.getName() + ", ");
        System.out.print(pokemonSet.size());
        System.out.println();
    }


}
