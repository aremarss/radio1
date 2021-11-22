package ru.netology.domain;

public class Radio {
    private int maxStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int numberRadio;
    private int volumeRadio;

    public Radio() {
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation - 1;
    }

    // Радиостанции

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation > maxStation) {
            newNumberStation = maxStation;
        }
        if (newNumberStation < 0) {
            newNumberStation = 0;
        }
        numberRadio = newNumberStation;
    }

    public void setNextStation() {
        if (numberRadio == maxStation) {
            numberRadio = 0;
        } else numberRadio += 1;
    }

    public void setPrevStation() {
        if (numberRadio == 0) {
            numberRadio = maxStation;
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