package com.checkhuaweiservices;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

import com.google.android.gms.common.GoogleApiAvailability;

import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.HuaweiApiAvailability;

/**
 * This class echoes a string called from JavaScript.
 */
public class CheckHuaweiServices extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("checkHuaweiServicesAvailability")) {
            Context context = this.cordova.getActivity().getApplicationContext();
            this.checkHuaweiServicesAvailability(context, callbackContext);
            return true;
        }
        return false;
    }

    private void checkHuaweiServicesAvailability(Context context, CallbackContext callbackContext) {
        try {
            JSONObject json = new JSONObject();
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == com.google.android.gms.common.ConnectionResult.SUCCESS) {
              json.put("status", false);
            }

            if (HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(context) == ConnectionResult.SUCCESS) {
              json.put("status", true);
            }

            json.put("status", false);

            callbackContext.success(json);
        } catch (Exception error) {
            callbackContext.error("Error validating huawei services availability");
        }
    }
}
