package org.example;

import java.util.List;

public class Bread {

    private int piecesLeft;
    private String type;
    private List<SliceOfBread> sliceOfBread = List.of(new SliceOfBread(), new SliceOfBread());

    // Get a SliceOfBread from Bread
    public SliceOfBread getSliceOfBread() {
        return sliceOfBread.get(0);
    }

    public String describeBread() {
        return "bread";
    }

}
