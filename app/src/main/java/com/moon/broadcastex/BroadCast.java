package com.moon.broadcastex;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadCast extends BroadcastReceiver {
   // public final static String MyAction = "com.moon.broadcastex.ACTION_MY_BROADCAST";
    //MyAction은 안써서... 예제는 있던데 뭐지...
    @Override
    public void onReceive(Context context, Intent intent) {

        //intent로 받은 action이 ACTION_POWER_CONNECTED 과 같다면 if문 실행
        if(Intent.ACTION_POWER_CONNECTED.equals(intent.getAction())){
            Toast.makeText(context, "전원 연결됨", Toast.LENGTH_SHORT).show();
        }else if(Intent.ACTION_POWER_DISCONNECTED.equals(intent.getAction())){
            Toast.makeText(context, "전원 연결 해제됨", Toast.LENGTH_SHORT).show();
        }
    }
}