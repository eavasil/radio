package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int radioStation;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getMaxVolume() {

        return maxVolume;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        }
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume - 1;
        }
    }

    public int getRadioStation() {

        return radioStation;
    }

    public int getMaxRadioStation() {

        return maxRadioStation;
    }

    public int getMinRadioStation() {

        return minRadioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation > maxRadioStation) {
            radioStation = minRadioStation;
        }
        if (radioStation < minRadioStation) {
            radioStation = maxRadioStation;
        }
        this.radioStation = radioStation;
    }

    public void prevRadioStation() {
        if (radioStation == minRadioStation) {
            setRadioStation(maxRadioStation);
            return;
        }
        this.radioStation = radioStation - 1;
    }

    public void nextRadioStation() {
        if (radioStation == maxRadioStation) {
            setRadioStation(minRadioStation);
            return;
        }
        this.radioStation = radioStation + 1;
    }
}