package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
//    сигнальный тест проверки максимальной громкости
    void radioMan() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        assertEquals(10, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(0, radio.getCurrentVolume());
        assertEquals(0, radio.getRadioStation());
        assertEquals(0, radio.getMinRadioStation());
        assertEquals(9, radio.getMaxRadioStation());
    }

    @Test
    void setVolumeMinusNull() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setVolumeMore10() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(5);
        radio.setCurrentVolume(65);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeWhenMin() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(radio.getMinVolume());
        int expected = radio.getCurrentVolume() + 1;
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeWhen5() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeWhenMax() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeWhenMin() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseVolume();
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }
    @Test
    void decreaseVolumeWhen5() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeWhenMax() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.decreaseVolume();
        assertEquals((radio.getMaxVolume()-1), radio.getCurrentVolume());
    }
    @Test
    void setRadioStationWhenNull() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setRadioStation(0);
        assertEquals(0, radio.getRadioStation());
    }

    @Test
    void setRadioStationWhen5() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setRadioStation(5);
        assertEquals(5, radio.getRadioStation());
    }

    @Test
    void setRadioStationWhenMax() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setRadioStation(radio.getMaxRadioStation());
        assertEquals(radio.getMaxRadioStation(), radio.getRadioStation());
    }
    @Test
    void setRadioStationMoreMax() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setRadioStation(10);
        assertEquals(radio.getMinRadioStation(), radio.getRadioStation());
    }

    @Test
    void setRadioStationLessMin() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setRadioStation(0);
        radio.setRadioStation(-1);
        assertEquals(9, radio.getRadioStation());
    }

    @Test
    void prevRadioStationWhenNull() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setRadioStation(radio.getMinRadioStation());
        radio.prevRadioStation();
        assertEquals(9, radio.getRadioStation());
    }
    @Test
    void prevRadioStationWhen5() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setRadioStation(5);
        radio.prevRadioStation();
        assertEquals(4, radio.getRadioStation());
    }
    @Test
    void prevRadioStationWhen9() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setRadioStation(9);
        radio.prevRadioStation();
        assertEquals(8, radio.getRadioStation());
    }
    @Test
    void nextRadioStationWhenNull() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setRadioStation(radio.getMinRadioStation());
        radio.nextRadioStation();
        assertEquals((radio.getMinRadioStation()+1), radio.getRadioStation());
    }
    @Test
    void nextRadioStationWhen5() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setRadioStation(5);
        radio.nextRadioStation();
        assertEquals(6, radio.getRadioStation());
    }
    @Test
    void nextRadioStationWhenMax() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setRadioStation(radio.getMaxRadioStation());
        radio.nextRadioStation();
        assertEquals(radio.getMinRadioStation(), radio.getRadioStation());
    }

}