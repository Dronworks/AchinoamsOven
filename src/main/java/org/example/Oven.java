package org.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Oven {

    private long timeToBakeInMinutes;
    private int temperatureInCelsius;
    private String secret = "Secret recipe";

    public long getTimeToBakeInMinutes() {
        return timeToBakeInMinutes;
    }

    public int getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(int temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public void setTimeToBakeInMinutes(long timeToBakeInMinutes) {
        this.timeToBakeInMinutes = timeToBakeInMinutes;
    }

    public SliceOfBread bakeSliceOfBread(SliceOfBread sliceOfBread) {
        log.info("Baking bread with temperature: {}, for {} minutes, with {}", temperatureInCelsius, timeToBakeInMinutes, secret);
        return sliceOfBread;
    }

}
