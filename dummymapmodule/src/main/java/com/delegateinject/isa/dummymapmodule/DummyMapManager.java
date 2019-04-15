package com.delegateinject.isa.dummymapmodule;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.delegateinject.isa.subfeature.MapManagerInterface;

/**
 * @author fangsxu
 */
public class DummyMapManager implements MapManagerInterface {
    private Context context;

    public DummyMapManager(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(context, context.getString(R.string.haha),Toast.LENGTH_SHORT).show();
    }
}
