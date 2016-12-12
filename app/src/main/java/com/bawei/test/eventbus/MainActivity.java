package com.bawei.test.eventbus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.bawei.test.eventbus.ebus.AnyEventType;

import org.greenrobot.eventbus.EventBus;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.tv);

    }

    public void but(View view){
        EventBus.getDefault().postSticky(
                new AnyEventType("FirstEvent btn clicked"));
        startActivity(new Intent(MainActivity.this,TwoActivity.class));
    }

}
