package com.example.sbt.mycanvas2;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class Convert {


    public static float convertPixelsToDp(float px, Context context){
        return px / ((float) context.getResources().getDisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }
}
