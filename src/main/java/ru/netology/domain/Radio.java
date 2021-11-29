package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int numberStations = 5;
    private int minStation = 0;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int numberRadio;
    private int volumeRadio;

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
}