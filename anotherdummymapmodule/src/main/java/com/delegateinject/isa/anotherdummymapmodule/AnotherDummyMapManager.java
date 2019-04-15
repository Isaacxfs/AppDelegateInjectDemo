package com.delegateinject.isa.anotherdummymapmodule;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.delegateinject.isa.subfeature.MapManagerInterface;

/**
 * @author fangsxu
 */
public class AnotherDummyMapManager implements MapManagerInterface {
    private Context context;

    public AnotherDummyMapManager(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(context, context.getString(R.string.another),Toast.LENGTH_SHORT).show();
    }
}
