import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseballPlayerTest {
    @Test
    void shouldCreateBaseballPlayer(){
        BaseballPlayer baseballPlayer = new BaseballPlayer("A-Rod", "Yankees", 45, "6'3");

        Assertions.assertAll(() -> assertEquals("A-Rod", baseballPlayer.getName()),
                () -> assertEquals("Yankees", baseballPlayer.getTeam()),
                () -> assertEquals(45, baseballPlayer.getAge()),
                () -> assertEquals("6'3", baseballPlayer.getHeight())
        );

    }
}
