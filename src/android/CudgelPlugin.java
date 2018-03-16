package org.apache.cordova.scan;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import android.util.Log;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

/**
 * Created by zhengchenxiao on 2018/3/16.
 */

public class CudgelPlugin extends CordovaPlugin {
    public static final String TAG = "Cudgel";

    @Override
    public boolean execute(String action,JSONArray args,CallbackContext context)
            throws JSONException{
        if(action.equals("mydream")){
            String msg=args.getString(0)+"'s dream is to become a "+args.getString(1);
            context.success(msg);
            return true;
        }
        return false;
    }

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        Log.e("initialize","============================");
        //activity = cordova.getActivity();
    }

}