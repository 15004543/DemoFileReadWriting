package sg.edu.rp.c347.demofilereadwriting;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    boolean started;

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("Service", "Created");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (started == false){
            started = true;
            Log.i("Service", "Started");
        } else {
            Log.i("Service", "Still running");
        }
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.i("Service", "Exited");
        super.onDestroy();
    }


}
