package petersoft.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by peterkreyenhop on 6/10/16.
 */
class PokemonTest {
    @Test
    void CpAndHealthTests() {
        Pokemon myPokemon = new Pidgey();
        assertTrue(myPokemon.getName().equals("Pidgey"));
        assertTrue(myPokemon.getHealth() == 100);
        myPokemon.setHealth(99);
        assertTrue(myPokemon.getHealth() == 99);
        assertTrue(myPokemon.getCp() == 10);
        myPokemon.setHealth(100);
        assertEquals(myPokemon.getHealth(), 100);
    }

}