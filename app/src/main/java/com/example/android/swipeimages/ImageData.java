package com.example.android.swipeimages;

import java.util.ArrayList;
import java.util.List;

public class ImageData {
    public static List<Integer> imageIds = new ArrayList<>();

    public static void setImageIds(){
        imageIds.add(R.drawable.msd1);
        imageIds.add(R.drawable.msd2);
        imageIds.add(R.drawable.msd3);
    }
    public static List<Integer> getImageIds(){return imageIds;}
}
