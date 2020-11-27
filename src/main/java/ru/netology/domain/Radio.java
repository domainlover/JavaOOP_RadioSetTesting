package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void previousStation() {
        if (currentStation == 0) {
            this.currentStation = 9;
            return;
        }
        this.currentStation = currentStation - 1;
    }


    public void nextStation() {
        if (currentStation == 9) {
            this.currentStation = 0;
            return;
        }
        this.currentStation = currentStation + 1;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        this.volume = volume;
    }

    public void volumePlus() {
        if (volume == 10) {
            this.volume = volume;
        }
        if (volume < 10) {
            this.volume = volume + 1;
        }
    }

    public void volumeMinus() {
        if (volume == 0) {
            this.volume = volume;
        }
        if (volume > 0) {
            this.volume = volume - 1;
        }
    }
}






