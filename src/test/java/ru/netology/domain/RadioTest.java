package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio boxRadio = new Radio(5); // Всего 5 станций (от 0 до 4).

    @Test
    public void setStationUnderLimit() {

        boxRadio.setNumberStation(4);
        assertEquals(4, boxRadio.getNumberRadio());
    }

    @Test
    public void setStationOverLimit() {

        boxRadio.setNumberStation(5);
        assertEquals(4, boxRadio.getNumberRadio());
    }

    @Test
    public void setStationZero() {

        boxRadio.setNumberStation(0);
        assertEquals(0, boxRadio.getNumberRadio());
    }

    @Test
    public void setStationOverZero() {

        boxRadio.setNumberStation(-1);
        assertEquals(0, boxRadio.getNumberRadio());
    }

    @Test
    public void setNextStation() {

        boxRadio.setNumberStation(4);
        boxRadio.setNextStation();
        assertEquals(0, boxRadio.getNumberRadio());
    }

    @Test
    public void setNext2Station() {

        boxRadio.setNextStation();
        assertEquals(1, boxRadio.getNumberRadio());
    }

    @Test
    public void setPrevStation() {

        boxRadio.setNumberStation(1);
        boxRadio.setPrevStation();
        assertEquals(0, boxRadio.getNumberRadio());
    }

    @Test
    public void setPrev2Station() {

        boxRadio.setPrevStation();
        assertEquals(4, boxRadio.getNumberRadio());
    }

    @Test
    public void indicationUnderVolume() {

        boxRadio.setVolume(100);
        boxRadio.setUpVolume();
        assertEquals(100, boxRadio.getVolumeRadio());
    }

    @Test
    public void indicationOverVolume() {

        boxRadio.setVolume(101);
        boxRadio.setUpVolume();
        assertEquals(100, boxRadio.getVolumeRadio());
    }

    @Test
    public void setUpVolumeOne() {

        boxRadio.setUpVolume();
        assertEquals(1, boxRadio.getVolumeRadio());
    }

    @Test
    public void indicationUnderZeroVolume() {

        boxRadio.setVolume(0);
        boxRadio.setDownVolume();

        assertEquals(0, boxRadio.getVolumeRadio());
    }

    @Test
    public void indicationOverZeroVolume() {

        boxRadio.setVolume(-1);
        boxRadio.setDownVolume();
        assertEquals(0, boxRadio.getVolumeRadio());
    }

    @Test
    public void setDownVolumeOne() {

        boxRadio.setVolume(1);
        boxRadio.setDownVolume();
        assertEquals(0, boxRadio.getVolumeRadio());
    }
}