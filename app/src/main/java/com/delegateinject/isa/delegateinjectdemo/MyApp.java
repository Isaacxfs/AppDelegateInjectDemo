package com.delegateinject.isa.delegateinjectdemo;

import android.app.Application;

import com.delegateinject.isa.anotherdummymapmodule.AnotherDummyMapManager;
import com.delegateinject.isa.dummymapmodule.DummyMapManager;
import com.delegateinject.isa.subfeature.AppDelegate;

/**
 * @author fangsxu
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
       // AppDelegate.setManager(new DummyMapManager(getApplicationContext()));
        AppDelegate.setManager(new AnotherDummyMapManager(getApplicationContext()));
    }
}


