import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SoccerPlayerTest {
    @Test
    void shouldCreateSoccerPlayerTest() {
        SoccerPlayer soccerPlayer = new SoccerPlayer("Lionel Messi", "Barcelona", 33, "5'7");

        Assertions.assertAll(() -> assertEquals("Lionel Messi", soccerPlayer.getName()),
                             () -> assertEquals("Barcelona", soccerPlayer.getTeam()),
                             () -> assertEquals(33, soccerPlayer.getAge()),
                             () -> assertEquals("5'7", soccerPlayer.getHeight())
                );
    }
}
