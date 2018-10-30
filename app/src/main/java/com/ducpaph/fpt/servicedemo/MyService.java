package com.ducpaph.fpt.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String str = intent.getStringExtra("data");
//      int cou=0;
//       for (int i = 0;i<str.length()-1;i++){
//         char a = str.charAt(0);
//        if()
//     }
        int len = str.length();
        Map<Character, Integer> numChars = new HashMap<>(Math.min(len, 26));

        for (int i = 0; i < len; ++i)
        {
            char charAt = str.charAt(i);

            if (!numChars.containsKey(charAt))
            {
                numChars.put(charAt, 1);
            }
            else
            {
                numChars.put(charAt, numChars.get(charAt) + 1);
            }
        }

        Log.e("String",""+numChars);
        Log.e("HELLO!!","HELLO THỊNH CUTE!!!");
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.

        Log.e("HELLO!!","HELLO BABE!!!");
        throw new UnsupportedOperationException("Not yet implemented");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("HELLO!!","I LOVE U!");
    }
}
