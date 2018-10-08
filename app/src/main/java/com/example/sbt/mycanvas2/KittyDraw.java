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


public class KittyDraw extends View {

    private static final int START_X = 40;
    private static final int START_Y = 40;
    private static final int WIDTH_PX = 300;
    private static final int HEIGHT_PX = 300;

    Paint paint;
    final RectF rect;
//    Bitmap image ;
//    Bitmap newBitmap;

    public KittyDraw(Context context) {
        super(context);

        paint = new Paint();
        rect = new RectF();

//        image = BitmapFactory.decodeResource(getResources(), R.drawable.kitty);
//
//        newBitmap = Bitmap.createBitmap( image,
//                convertDpToPixel(START_X),
//                convertDpToPixel(START_Y),
//                convertDpToPixel(WIDTH_PX),
//                convertDpToPixel(HEIGHT_PX),
//                null, false);
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawColor(Color.WHITE);

        paint.setColor(Color.BLACK);
        paint.setTextSize(70);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
       // рисуем  кота
//        canvas.drawBitmap(newBitmap,
//                convertDpToPixel(40),
//                convertDpToPixel(80),
//                null);
//        // подписываем
//        canvas.drawText("Kitty",
//                convertDpToPixel(150),
//                convertDpToPixel(330),
//                paint);

        paint.setStrokeWidth(this.getResources().getDimension(R.dimen.size));

//        rect.set(
//                convertDpToPixel(60),
//                convertDpToPixel(100),
//                convertDpToPixel(260),
//                convertDpToPixel( 300));
        float dp2 = this.getResources().getDimension(R.dimen.name1);
        DisplayMetrics metrics = this.getResources().getDisplayMetrics();
//
//        rect.set(
//                this.getResources().getDimension(R.dimen.x1),
//                this.getResources().getDimension(R.dimen.y1),
//                this.getResources().getDimension(R.dimen.x2),
//                this.getResources().getDimension(R.dimen.y2)
//        );
//
        rect.set(
                100,
                100,
                700,
                800
        );

        canvas.drawRect(rect,paint);
     //   canvas.draw
        // чертим овал
//        canvas.drawArc(rect, -90, 360, true, paint);
    }

    private int convertDpToPixel(int dp){
        Resources resources = this.getResources();
//        float dp2 = resources.getDimension(R.dimen.name1);
//        Log.w("TAG", "dp2: "+ dp2);
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float px = dp * ((float)metrics.density +0.5f);
        return (int) px;
    }
}
