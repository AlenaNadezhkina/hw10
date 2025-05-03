package ru.netology.hw10.statistic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.hw10.statistic.Radio;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio rd = new Radio();
        rd.setCurrentStation(1);
        int expected = 1;
        int actual = rd.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testS0() {
        Radio rd = new Radio();
        rd.setCurrentStation(-2);
        int expected = 0;
        int actual = rd.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testS1() {
        Radio rd = new Radio();
        rd.setCurrentStation(13);
        int expected = 0;
        int actual = rd.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rd = new Radio();
        rd.setCurrentVolume(3);
        int expected = 3;
        int actual = rd.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testv0() {
        Radio rd = new Radio();
        rd.setCurrentVolume(-5);
        int expected = 0;
        int actual = rd.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testv01() {
        Radio rd = new Radio();
        rd.setCurrentVolume(115);
        int expected = 0;
        int actual = rd.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio rd = new Radio();
        rd.next(9);
        int expected = 0;
        int actual = rd.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation1() {
        Radio rd = new Radio();
        rd.next(2);
        int expected = 3;
        int actual = rd.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio rd = new Radio();
        rd.prev(0);
        int expected = 9;
        int actual = rd.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation1() {
        Radio rd = new Radio();
        rd.prev(3);
        int expected = 2;
        int actual = rd.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        Radio rd = new Radio();
        rd.maxVolume(50);
        int expected = 51;
        int actual = rd.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume1() {
        Radio rd = new Radio();
        rd.maxVolume(101);
        int expected = 0;
        int actual = rd.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio rd = new Radio();
        rd.minVolume(50);
        int expected = 49;
        int actual = rd.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume1() {
        Radio rd = new Radio();
        rd.minVolume(-4);
        int expected = 0;
        int actual = rd.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}