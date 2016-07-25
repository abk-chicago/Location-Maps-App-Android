package org.codeforcoffee.locationsmapsapp;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.support.v7.graphics.Palette;
import android.util.Log;

/**
 * Created by codeforcoffee on 7/24/16.
 */
public class ExtractMaterialColoursTask extends AsyncTask<BitmapDrawable, Void, Palette> implements ITaskInterface {

    private Bitmap mBitmap;
    private Palette mPalette;
    private final String TAG = "PaletteTask";

    /*private int mDarkColour;
    private int mDarkMutedColour;
    private int mLightColour;
    private int mLightMutedColor;*/

    /***
     * Usage:
     * mColoursTask = new ExtractMaterialColoursTask();
     * mColoursTask.execute(new BitmapDrawable());
     * @param bitmapDrawables
     * @return
     */
    @Override
    protected Palette doInBackground(BitmapDrawable... bitmapDrawables) {
        mBitmap = bitmapDrawables[0].getBitmap();
        mPalette = Palette.generate(mBitmap);
        if (mPalette != null) {
            return  mPalette;
        }
        return null;
    }

    @Override
    protected void onPostExecute(Palette palette) {
        onTaskComplete(palette);
    }

    @Override
    public void onTaskComplete(Object obj) {
        Log.i(TAG, obj.toString());
    }

    @Override
    public void onError(Object obj) {
        Log.i(TAG, obj.toString());
    }
}
