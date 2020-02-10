package com.paivadeveloper.olheiroslib;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    public static void mostraToast(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
