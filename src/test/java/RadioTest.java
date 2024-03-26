import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.object.Radio;

public class RadioTest {

    @Test
    void setMinNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expect = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void setMiddleNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expect = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void setMaxNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expect = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void setOverMaxNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expect = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

        @Test
    void setUnderMinNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expect = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void nextNumberStationIfMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expect = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void prevNumberStationIfMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expect = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void nextNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        int expect = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }


    @Test
    void prevNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();
        int expect = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void getCurrentVolume() {
        Radio radio = new Radio();
        radio.volumeUp();
        int expect = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void volumeUp() {
        Radio radio = new Radio();
        radio.volumeUp();
        int expect = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void volumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(22);
        radio.volumeDown();

        int expect = 21;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void volumeUpIfMax() {
        Radio radio = new Radio();
        for (int i = 0; i <= 100; i++) {
            radio.volumeUp();
        }
        int expect = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void volumeDownIfMin() {
        Radio radio = new Radio();
        radio.volumeDown();

        int expect = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void volumeBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expect = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void volumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expect = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }
}
