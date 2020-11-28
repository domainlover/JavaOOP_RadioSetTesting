package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Radio {
    private int currentRadioStation;
    private int minRadioStation;
    private int maxRadioStation;
    private int currentSoundVolume;
    private int minSoundVolume;
    private int maxSoundVolume;


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

    public void onPrevRadioStation() {
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
