package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void onNextRadioStation() {
        Radio radio = new Radio(0, 0,10,50,0,100);
        radio.onNextRadioStation();
        assertEquals(1,radio.getCurrentRadioStation());//comm
    }

    @Test
    public void onPrevRadioStation() {
        Radio radio = new Radio(1, 0, 10, 50,0,100);
        radio.onPrevRadioStationBasic();
        assertEquals(0,radio.getCurrentRadioStation());
    }

    @Test
    public void onNextRadioStationAfterMax() {
        Radio radio = new Radio(10, 0,10,50,0,100);
        radio.onNextRadioStation();
        assertEquals(0,radio.getCurrentRadioStation());
    }

    @Test
    public void onPrevRadioStationBeforeMin() {
        Radio radio = new Radio(0, 0,10,50,0,100);
        radio.onPrevRadioStation2();
        assertEquals(10,radio.getCurrentRadioStation());
    }

    @Test
    public void onNextSoundVolume() {
        Radio radio = new Radio(4, 0,10,50,0, 100);
        radio.onNextSoundVolume();
        assertEquals(51,radio.getCurrentSoundVolume());
    }

    @Test
    public void onPrevSoundVolume() {
        Radio radio = new Radio(4, 0,10,1,0,100);
        radio.onPrevSoundVolume();
        assertEquals(0,radio.getCurrentSoundVolume());
    }

    @Test
    public void onNextSoundVolumeAfterMax() {
        Radio radio = new Radio(4, 0,10,100,0,100);
        radio.onNextSoundVolume();
        assertEquals(100,radio.getCurrentSoundVolume());
    }

    @Test
    public void onPrevSoundVolumeBeforeMin() {
        Radio radio = new Radio(4, 0,10,0,0,100);
        radio.onPrevSoundVolume();
        assertEquals(0,radio.getCurrentSoundVolume());
    }
    
}


