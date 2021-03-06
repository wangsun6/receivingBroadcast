package com.wangsun.receiverapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

/**
 * Created by WANGSUN on 05-Apr-19.
 */
class MyReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        println("Action: ${intent?.action}")

        if(intent?.action!=null){
            Toast.makeText(context,"Received broadcast: ${intent.action}",Toast.LENGTH_SHORT).show()

            if(intent.action==Constants.Actions.RECEIVER_ACTION_USER_ID){
                Toast.makeText(context,"Received Uid: ${intent.getStringExtra(Constants.IntentKey.UID_KEY)}",Toast.LENGTH_SHORT).show()
            }
        }

    }
}