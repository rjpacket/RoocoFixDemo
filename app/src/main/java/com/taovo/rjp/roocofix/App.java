package com.taovo.rjp.roocofix;

import android.app.Application;

import com.dodola.rocoofix.RocooFix;

/**
 * @Author：RJP on 2016/9/18 15:40
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化
        RocooFix.init(this);

        RocooFix.initPathFromAssets(getApplicationContext(), "patch.jar");
    }
}
