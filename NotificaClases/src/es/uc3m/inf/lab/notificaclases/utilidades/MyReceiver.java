package es.uc3m.inf.lab.notificaclases.utilidades;

import es.uc3m.inf.lab.notificaclases.Servicio;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent myIntent = new Intent(context, Servicio.class);
		context.startService(myIntent);
	}

}
