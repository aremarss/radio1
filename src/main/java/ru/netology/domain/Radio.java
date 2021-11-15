package ru.netology.domain;

public class Radio {
    private int numberRadio;
    private int volumeRadio;

    // Радиостанции

    public void setNumberStation(int newNumberStation){
        if (newNumberStation > 9){
            newNumberStation = 9;
        }
        if (newNumberStation < 0){
            newNumberStation = 0;
        }
        numberRadio = newNumberStation;
    }

    public void setNextStation(){
        if (numberRadio == 9){
            numberRadio = 0;
        }
        else numberRadio += 1;
    }

    public void setPrevStation() {
        if (numberRadio == 0){
            numberRadio = 9;
        }
        else numberRadio -= 1;
    }

    public int getNumberRadio(){
        return numberRadio;
    }

    // Громкость

    public void setVolume(int newVolume){
        if (newVolume > 10){
            newVolume = 10;
        }
        if (newVolume < 0){
            newVolume = 0;
        }
        volumeRadio = newVolume;
    }

    public void setUpVolume(){
        if (volumeRadio < 10){
            volumeRadio += 1;
        }
    }

    public void setDownVolume(){
        if (volumeRadio > 0){
            volumeRadio -= 1;
        }
    }

    public int getVolumeRadio() {
        return volumeRadio;
    }
}