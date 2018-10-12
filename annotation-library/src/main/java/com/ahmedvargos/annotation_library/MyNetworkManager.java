package com.ahmedvargos.annotation_library;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;

public class MyNetworkManager {

    private static Context context;

    public static void init(Context context){
        MyNetworkManager.context = context;
    }

    public static boolean isConnected (){
        ConnectivityManager connMgr = (ConnectivityManager) MyNetworkManager.context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        return (networkInfo != null && networkInfo.isConnected());
    }

}
