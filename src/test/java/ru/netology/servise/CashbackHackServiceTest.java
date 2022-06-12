package ru.netology.servise;

import org.junit.Test;

import java.util.concurrent.Callable;

import static org.junit.Assert.*;

class CashbackHackServiceTest {

    @Test
    void shouldRemainWhenAmountLessThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);

        assertEquals(actual, expected);
    }

    @Test
    void shouldRemainWhenAmountMoreThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(2100);

        assertEquals(actual, expected);
    }

    @Test
    void shouldRemainWhenAmountMultipleHalfThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 500;
        int actual = service.remain(2500);

        assertEquals(actual, expected);
    }
    @Test
    void shouldRemainWhenAmountMultipleThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(2000);

        assertEquals(actual,expected);
    }
}


