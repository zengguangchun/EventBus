package com.bawei.test.eventbus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.bawei.test.eventbus.ebus.AnyEventType;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class TwoActivity extends AppCompatActivity {

    private TextView tv_s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        tv_s = (TextView)findViewById(R.id.tv_s);
        //注册EventBus
        EventBus.getDefault().register(this);

    }
    @Subscribe(sticky = true)
    public void onEventMainThread(AnyEventType event) {

        String msg = "onEventMainThread收到了消息：" + event.getMsg();
        Log.d("harvic", msg);
        tv_s.setText(msg);
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        EventBus.getDefault().unregister(this);//反注册EventBus
    }

}
