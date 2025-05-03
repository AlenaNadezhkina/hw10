package ru.netology.hw10.statistic;
public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0){
            return;
        }
        if (currentStation > 9){
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0){
            return;
        }
        if (currentVolume > 100){
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void next(int CurrentStation) {
        if (CurrentStation == 9) {
            CurrentStation = 0;
        } else {
            CurrentStation++;
        }
        this.currentStation = CurrentStation;
    }

    public void prev(int CurrentStation) {
        if (CurrentStation == 0) {
            CurrentStation = 9;
        } else {
            CurrentStation--;
        }
        this.currentStation = CurrentStation;
    }

    public void maxVolume(int CurrentVolume) {
        if (CurrentVolume < 100) {
            CurrentVolume = CurrentVolume + 1;
        }
        if (CurrentVolume > 100) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }

    public void minVolume(int CurrentVolume) {
        if (CurrentVolume > 0) {
            CurrentVolume = CurrentVolume - 1;
        }
        if (CurrentVolume < 0) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }
}
