package com.delegateinject.isa.subfeature;

import android.view.View;

/**
 * @author fangsxu
 */
public final class AppDelegate {
    private  static MapManagerInterface manager;

    public static void setManager(MapManagerInterface onClickListener){
        manager = onClickListener;
    }

    public static MapManagerInterface getManager(){
        return manager;
    }
}





