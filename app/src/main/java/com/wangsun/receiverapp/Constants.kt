package com.wangsun.receiverapp

/**
 * Created by WANGSUN on 05-Apr-19.
 */
class Constants {
    object Actions{
        /*start activity with intent*/
        val ACTION_START_ACTIVITY = "com.kontiki.action.START_ACTIVITY"

        /*receiver*/
        val RECEIVER_ACTION_NAME = "com.kontiki.action.NAME"
        val RECEIVER_ACTION_USER_ID = "com.kontiki.action.USER_ID"

        /*broadcast*/
        val BROADCAST_ACTION_NAME2 = "com.kontiki.action.NAME2"
        val BROADCAST_ACTION_USER_ID2 = "com.kontiki.action.USER_ID2"
    }

    object IntentKey{
        /*keys*/
        val UID_KEY = "uidKey"
    }
}