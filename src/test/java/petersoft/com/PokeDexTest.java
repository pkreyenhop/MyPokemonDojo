package petersoft.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Created by peterkreyenhop on 4/10/16.
 */
public class PokeDexTest {

    private void addSomePokemonToDex(PokeDex myDex, int numberOfPokemonToAdd, Class pokemonType) throws IllegalAccessException, InstantiationException {

        for (int c = 1; c <= numberOfPokemonToAdd; c++) {
            Object apokemon = pokemonType.newInstance();
            myDex.addToDeck((Pokemon) apokemon);
        }

    }


    @Test
    public void addingPokemonToDex() throws Exception {
        PokeDex myDex = new PokeDex();
        assertTrue(myDex.pokemonSet.isEmpty());
        addSomePokemonToDex(myDex, 1, Pidgey.class);
        assertTrue(myDex.pokemonSet.size() == 1);
        myDex.printPokedex();
        addSomePokemonToDex(myDex, 1, Pikachu.class);
        assertTrue(myDex.pokemonSet.size() == 2);
        addSomePokemonToDex(myDex, 1, Vulpex.class);
        assertTrue(myDex.pokemonSet.size() == 3);

        addSomePokemonToDex(myDex, 2, Pikachu.class);
        assertTrue(myDex.pokemonSet.size() == 3); //we already have Pikachu
        //Todo find a way to make the test more self explaining

    }

    @org.junit.Test
    public void removingPokemonFromDex() throws Exception {
        PokeDex myDeck = new PokeDex();
        assertTrue(myDeck.pokemonSet.isEmpty());
        addSomePokemonToDex(myDeck, 1, Pidgey.class);
        //ToDo add test for removal - too tired...

    }
}



