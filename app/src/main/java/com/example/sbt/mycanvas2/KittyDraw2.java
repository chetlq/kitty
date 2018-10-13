package com.example.sbt.mycanvas2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;


public class KittyDraw2 extends View {

    Paint paint;
    final RectF rect;

    public KittyDraw2(Context context) {
        super(context);

        paint = new Paint();
        rect = new RectF();
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawColor(Color.WHITE);

        paint.setColor(Color.BLACK);
        paint.setTextSize(70);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);


        paint.setStrokeWidth(this.getResources().getDimension(R.dimen.size));


       // float dp2 = this.getResources().getDimension(R.dimen.name1);
        DisplayMetrics metrics = this.getResources().getDisplayMetrics();
        float k = (float) (metrics.widthPixels/1080.0);
        paint.setStrokeWidth((int)(20*k));
//        rect.set(
//                this.getResources().getDimension(R.dimen.x1),
//                this.getResources().getDimension(R.dimen.y1),
//                this.getResources().getDimension(R.dimen.x2),
//                this.getResources().getDimension(R.dimen.y2)
//        );
//
        rect.set(
                (int)(100*k),
                (int)(100*k),
                (int)(1000*k),
                (int)(1000*k)
        );

        canvas.drawRect(rect, paint);

        paint.setColor(Color.RED);
        rect.set(
                convertDpToPixel(10),
                convertDpToPixel(10),
                convertDpToPixel(300),
                convertDpToPixel(300)
        );

        canvas.drawRect(rect, paint);
    }


    private float convertDpToPixel(int dp){
        Resources resources = this.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float px = dp * (metrics.densityDpi / 160.0f);
        return  px;
    }


}
