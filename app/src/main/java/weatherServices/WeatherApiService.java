package weatherServices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class WeatherApiService extends Service {
    public WeatherApiService() {

        Intent msgIntent = new Intent(this, WeatherMonitoringIntent.class);
        //msgIntent.putExtra(WeatherMonitoringIntent.PARAM_IN_MSG, strInputMsg);
        startService(msgIntent);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
