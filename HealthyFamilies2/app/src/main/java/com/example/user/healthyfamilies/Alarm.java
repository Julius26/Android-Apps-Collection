package com.example.user.healthyfamilies;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v4.app.NotificationCompat;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by User on 7/23/2017.
 */

public class Alarm extends BroadcastReceiver {



    EditText set;
    @Override
    public void onReceive(Context context, Intent intent) {


       Toast.makeText(context,"...ALARM",Toast.LENGTH_LONG).show();
       Vibrator vibrator=(Vibrator) context.getSystemService(context.VIBRATOR_SERVICE);
       vibrator.vibrate(4000);



       /* NotificationManager notificationManager= (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        Intent repeating=new Intent(context,Repeating.class);
        repeating.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent=PendingIntent.getActivity(context,100,repeating,PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder builder=new NotificationCompat.Builder(context)
                .setContentIntent(pendingIntent)
                .setSmallIcon(R.drawable.dot)
                .setContentTitle("Healthy families")
                .setContentText("Remember to follow your diet")
                .setAutoCancel(true);

        notificationManager.notify(100,builder.build());*/
    }
}
