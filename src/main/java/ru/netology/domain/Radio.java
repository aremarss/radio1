package ru.netology.domain;

public class Radio {
    private int numberStations;
    private final int minStation = 0;
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int numberRadio;
    private int volumeRadio;

    public Radio() {
    }

    public Radio(int numberStations) {
        this.numberStations = numberStations - 1;
    }

    // Радиостанции

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation > numberStations) {
            newNumberStation = numberStations;
        }
        if (newNumberStation < minStation) {
            newNumberStation = minStation;
        }
        numberRadio = newNumberStation;
    }

    public void setNextStation() {
        if (numberRadio == numberStations) {
            numberRadio = minStation;
        } else numberRadio += 1;
    }

    public void setPrevStation() {
        if (numberRadio == minStation) {
            numberRadio = numberStations;
        } else {
            numberRadio -= 1;
        }
    }

    public int getNumberRadio() {
        return numberRadio;
    }

    // Громкость

    public void setVolume(int newVolume) {
        if (newVolume > maxVolume) {
            newVolume = maxVolume;
        }
        if (newVolume < minVolume) {
            newVolume = minVolume;
        }
        volumeRadio = newVolume;
    }

    public void setUpVolume() {
        if (volumeRadio < maxVolume) {
            volumeRadio += 1;
        }
    }

    public void setDownVolume() {
        if (volumeRadio > minVolume) {
            volumeRadio -= 1;
        }
    }

    public int getVolumeRadio() {
        return volumeRadio;
    }
}