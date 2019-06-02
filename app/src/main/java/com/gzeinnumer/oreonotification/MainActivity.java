package com.gzeinnumer.oreonotification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final NotificationHelper notificationHelper = new NotificationHelper(this);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificationHelper.createNotification("Notification Oreo","GZeinNumer. https://github.com/gzeinnumer");
            }
        });

    }
}
