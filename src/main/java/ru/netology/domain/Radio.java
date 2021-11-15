package ru.netology.domain;

public class Radio {
    private int minStation;
    private int maxStation;
    private int minVolume;
    private int maxVolume;
    private int numberRadio;
    private int volumeRadio;

    public Radio(int minStation, int maxStation, int minVolume, int maxVolume) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    // Радиостанции

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation > maxStation) {
            newNumberStation = maxStation;
        }
        if (newNumberStation < minStation) {
            newNumberStation = minStation;
        }
        numberRadio = newNumberStation;
    }

    public void setNextStation() {
        if (numberRadio == maxStation) {
            numberRadio = minStation;
        } else numberRadio += 1;
    }

    public void setPrevStation() {
        if (numberRadio == minStation) {
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