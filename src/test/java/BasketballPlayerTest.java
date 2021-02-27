import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketballPlayerTest {

    @Test
    void shouldCreateBasketballPlayer(){
        BasketballPlayer basketballPlayer = new BasketballPlayer("Lebron James", "Lakers", 35, "6'8");

        Assertions.assertAll(() -> assertEquals("Lebron James", basketballPlayer.getName()),
                             () -> assertEquals("Lakers", basketballPlayer.getTeam()),
                             () -> assertEquals(35, basketballPlayer.getAge()),
                             () -> assertEquals("6'8", basketballPlayer.getHeight())
                );

    }

}
