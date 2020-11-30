package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int minRadioStation;
    private int maxRadioStation;
    private int currentSoundVolume;
    private int minSoundVolume;
    private int maxSoundVolume;

    public Radio(int currentRadioStation, int minRadioStation, int maxRadioStation, int currentSoundVolume, int minSoundVolume, int maxSoundVolume) {
        this.currentRadioStation = currentRadioStation;
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.currentSoundVolume = currentSoundVolume;
        this.minSoundVolume = minSoundVolume;
        this.maxSoundVolume = maxSoundVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void onNextRadioStation() {
        if (currentRadioStation < maxRadioStation){
            this.currentRadioStation++;
        }
        if (currentRadioStation == maxRadioStation){
            this.currentRadioStation = minRadioStation;
        }
    }

    public void onPrevRadioStationBasic() {
        if (currentRadioStation > minRadioStation){
            this.currentRadioStation--;
        }
        if (currentRadioStation == minRadioStation){
            this.currentRadioStation = minRadioStation;
        }
    }

    public void onPrevRadioStation2() {
        if (currentRadioStation > minRadioStation){
            this.currentRadioStation--;
        }
        if (currentRadioStation == minRadioStation){
            this.currentRadioStation = maxRadioStation;
        }
    }

    public void onNextSoundVolume(){
        if (currentSoundVolume < maxSoundVolume){
            this.currentSoundVolume++;
        }
        if (currentSoundVolume == maxSoundVolume){
            this.currentSoundVolume = maxSoundVolume;//im
        }
    }

    public void onPrevSoundVolume() {
        if (currentSoundVolume > minSoundVolume){
            this.currentSoundVolume--;
        }
        if (currentSoundVolume == minSoundVolume) {
            this.currentSoundVolume = minSoundVolume;
        }
    }
}
