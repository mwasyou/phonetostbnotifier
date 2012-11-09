/**
 *
 * @author Achraf Gazdar
 */
package com.phonetostbapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 *
 * @author Achraf Gazdar
 */
public class BootReceiver extends BroadcastReceiver {
  @Override
  public void onReceive(Context context, Intent intent) {
        Intent serviceIntent = new Intent(toSTBnotifierService.class.getName());
        context.startService(serviceIntent); 
  }
}
