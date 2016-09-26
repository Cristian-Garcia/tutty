package com.garciacristian.tutty;

import android.graphics.Canvas;
import android.view.MotionEvent;

/**
 * Created by CristianG on 9/20/2016.
 */
public interface Scene {

    public void update();
    public void draw(Canvas canvas);
    public void terminate();
    public void recieveTouch(MotionEvent event);

}
