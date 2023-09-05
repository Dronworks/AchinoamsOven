package org.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        Oven achinoamsOven = new Oven();
        achinoamsOven.setTemperatureInCelsius(180); // TODO change to better place
        achinoamsOven.setTimeToBakeInMinutes(10); // TODO change to good place

        Bread bread = new Bread();
        SliceOfBread sliceOfBread = bread.getSliceOfBread();


        achinoamsOven.bakeSliceOfBread(sliceOfBread);

    }

}