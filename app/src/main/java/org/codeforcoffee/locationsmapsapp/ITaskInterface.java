package org.codeforcoffee.locationsmapsapp;

import android.os.AsyncTask;

/**
 * Created by codeforcoffee on 7/24/16.
 */
public interface ITaskInterface {

    void onTaskComplete(Object obj);
    void onError(Object obj);

}
