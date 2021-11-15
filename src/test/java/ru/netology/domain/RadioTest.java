package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio boxRadio = new Radio();

    @Test
    public void setStationUnderLimit() {

        boxRadio.setNumberStation(9);

        int expected = 9;
        int actual = boxRadio.getNumberRadio();

        assertEquals(expected, actual);
    }

    @Test
    public void setStationOverLimit() {

        boxRadio.setNumberStation(10);

        int expected = 9;
        int actual = boxRadio.getNumberRadio();

        assertEquals(expected, actual);
    }

    @Test
    public void setStationUnderZero() {

        boxRadio.setNumberStation(0);

        int expected = 0;
        int actual = boxRadio.getNumberRadio();

        assertEquals(expected, actual);
    }

    @Test
    public void setStationOverZero() {

        boxRadio.setNumberStation(-1);

        int expected = 0;
        int actual = boxRadio.getNumberRadio();

        assertEquals(expected, actual);
    }

    @Test
    public void setNextStation() {


        Radio boxRadio = new Radio();

        boxRadio.setNumberStation(9);

        boxRadio.setNextStation();

        int expected = 0;
        int actual = boxRadio.getNumberRadio();

        assertEquals(expected, actual);
    }

    @Test
    public void setNext2Station() {

        boxRadio.setNextStation();

        int expected = 1;
        int actual = boxRadio.getNumberRadio();

        assertEquals(expected, actual);
    }

    @Test
    public void setPrevStation() {

        boxRadio.setNumberStation(1);
        boxRadio.setPrevStation();

        int expected = 0;
        int actual = boxRadio.getNumberRadio();

        assertEquals(expected, actual);
    }

    @Test
    public void setPrev2Station() {

        boxRadio.setPrevStation();

        int expected = 9;
        int actual = boxRadio.getNumberRadio();

        assertEquals(expected, actual);
    }

    @Test
    public void indicationUnderVolume() {

        boxRadio.setVolume(10);

        boxRadio.setUpVolume();

        int expected = 10;
        int actual = boxRadio.getVolumeRadio();

        assertEquals(expected, actual);
    }

    @Test
    public void indicationOverVolume() {

        boxRadio.setVolume(11);

        boxRadio.setUpVolume();

        int expected = 10;
        int actual = boxRadio.getVolumeRadio();

        assertEquals(expected, actual);
    }

    @Test
    public void setUpVolumeOne() {

        boxRadio.setUpVolume();

        int expected = 1;
        int actual = boxRadio.getVolumeRadio();

        assertEquals(expected, actual);
    }

    @Test
    public void indicationUnderZeroVolume() {

        boxRadio.setVolume(0);

        boxRadio.setDownVolume();

        int expected = 0;
        int actual = boxRadio.getVolumeRadio();

        assertEquals(expected, actual);
    }

    @Test
    public void indicationOverZeroVolume() {

        boxRadio.setVolume(-1);

        boxRadio.setDownVolume();

        int expected = 0;
        int actual = boxRadio.getVolumeRadio();

        assertEquals(expected, actual);
    }

    @Test
    public void setDownVolumeOne() {

        boxRadio.setVolume(1);

        boxRadio.setDownVolume();

        int expected = 0;
        int actual = boxRadio.getVolumeRadio();

        assertEquals(expected, actual);
    }
}