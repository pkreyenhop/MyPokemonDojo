package petersoft.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Created by peterkreyenhop on 4/10/16.
 */
public class PokeDexTest {

    private void addSomePokemonToDex(PokeDex myDeck, int numberOfPokemonToAdd, Class pokemonType) throws IllegalAccessException, InstantiationException {

        for (int c = 1; c <= numberOfPokemonToAdd; c++) {
            Object apokemon = pokemonType.newInstance();
            myDeck.addToDeck((Pokemon) apokemon);
        }

    }


    @Test
    public void addingAndRemovingPokemonFromDex() throws Exception {
        PokeDex myDeck = new PokeDex();
        assertTrue(myDeck.pokemonSet.isEmpty());
        addSomePokemonToDex(myDeck, 1, Pidgey.class);
        assertTrue(myDeck.pokemonSet.size() == 1);
        myDeck.printPokedex();
        addSomePokemonToDex(myDeck, 1, Pikachu.class);
        assertTrue(myDeck.pokemonSet.size() == 2);
        myDeck.removeFromDeck(1);
        assertTrue(myDeck.pokemonSet.size() == 1);
        addSomePokemonToDex(myDeck, 100, Pikachu.class);
        assertTrue(myDeck.pokemonSet.size() == 99);
    }



    @Test
    public void testIndexOutOfBoundsException() throws InstantiationException, IllegalAccessException {
        PokeDex myDex = new PokeDex();
        assertThrows(IllegalStateException.class, () -> {
            addSomePokemonToDex(myDex, 1000, Pidgey.class);
        });
    }
}