package com.moon.broadcastex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private BroadcastReceiver mReceiver; //리시버 선언
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mReceiver = new BroadCast(); //생성한 BroadCast 클래스를 브로드캐스트 리시버로 정의
    }

    @Override
    protected void onResume() {
        super.onResume();

        IntentFilter filter = new IntentFilter(); //특정 액션만(충전, 충전해제) 받을 수 있게 필터정의
        filter.addAction(Intent.ACTION_POWER_CONNECTED);
        filter.addAction(Intent.ACTION_POWER_DISCONNECTED);
        registerReceiver(mReceiver, filter); //레지스트리로 리시버와 필터 지정
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(mReceiver); //앱이 일시정지되면 리시버 삭제
    }
}