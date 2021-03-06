package com.codenjoy.dojo.battlecity.services;

import com.codenjoy.dojo.services.EventListener;
import com.codenjoy.dojo.services.GameType;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * User: sanja
 * Date: 14.12.13
 * Time: 7:41
 */
public class BattlecityGameTest {
    @Test
    public void testNoNPE() {
        GameType gameType = new BattlecityGame();
        assertEquals(34, gameType.getBoardSize().getValue().intValue());

        gameType.newGame(mock(EventListener.class));
        assertEquals(34, gameType.getBoardSize().getValue().intValue());
    }
}
