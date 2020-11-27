package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void currentStationUpperLimit () {
        Radio radio = new Radio();
        int currentStation = 10;
        radio.setCurrentStation(currentStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void currentStationLowerLimit () {
        Radio radio = new Radio();
        int currentStation = -1;
        radio.setCurrentStation(currentStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void previousStationFromMinValue() {
        Radio radio = new Radio();
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.previousStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void nextStationFromMaxValue() {
        Radio radio = new Radio();
        int currentStation = 9;
        radio.setCurrentStation(currentStation);
        radio.nextStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }


    @Test
    public void previousStationValue() {
        Radio radio = new Radio();
        int currentStation = 3;
        radio.setCurrentStation(currentStation);
        radio.previousStation();
        int expected = 2;
        assertEquals(expected, radio.getCurrentStation());
    }


    @Test
    public void nextStationValue() {
        Radio radio = new Radio();
        int currentStation = 5;
        radio.setCurrentStation(currentStation);
        radio.nextStation();
        int expected = 6;
        assertEquals(expected, radio.getCurrentStation());
    }


    @Test
    public void volumeUpperLimit() {
        Radio radio = new Radio();
        int volume = 11;
        radio.setVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void volumeLowerLimit() {
        Radio radio = new Radio();
        int volume = -1;
        radio.setVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void volumeNextFromMaxValue() {
        Radio radio = new Radio();
        int volume = 10;
        radio.setVolume(volume);
        radio.volumePlus();
        int expected = 10;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void volumePreviousFromMinValue() {
        Radio radio = new Radio();
        int volume = 0;
        radio.setVolume(volume);
        radio.volumeMinus();
        int expected = 0;
        assertEquals(expected, radio.getVolume());

    }


    @Test
    public void volumeNextValue() {
        Radio radio = new Radio();
        int volume = 6;
        radio.setVolume(volume);
        radio.volumePlus();
        int expected = 7;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void volumePreviousValue() {
        Radio radio = new Radio();
        int volume = 2;
        radio.setVolume(volume);
        radio.volumeMinus();
        int expected = 1;
        assertEquals(expected, radio.getVolume());

    }

}




