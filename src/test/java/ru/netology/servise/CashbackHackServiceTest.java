package ru.netology.servise;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldRemainWhenAmountLessThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);

        assertEquals(expected, actual);
    }

    @Test
    void shouldRemainWhenAmountMoreThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(2100);

        assertEquals(expected, actual);
    }
    @Test
    void shouldRemainWhenAmountMultipleHalfThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 500;
        int actual = service.remain(2500);

        assertEquals(expected, actual);
    }
}


