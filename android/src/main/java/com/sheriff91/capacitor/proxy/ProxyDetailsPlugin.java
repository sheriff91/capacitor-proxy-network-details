package com.sheriff91.capacitor.proxy;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "ProxyDetails")
public class ProxyDetailsPlugin extends Plugin {

    private ProxyDetails implementation = new ProxyDetails();

    @PluginMethod
    public void getProxy(PluginCall call) {
        ConnectivityManager cm = (ConnectivityManager) getContext().getSystemService(Context.CONNECTIVITY_SERVICE);

        if (cm == null) {
            call.reject("ConnectivityManager not available");
            return;
        }

        ProxyInfo proxyInfo = cm.getDefaultProxy();

        if (proxyInfo == null || proxyInfo.getHost() == null) {
            JSObject result = new JSObject();
            implementation.log("No proxy configured for the active network");
            result.put("host", null);
            result.put("port", null);
            call.resolve(result);
            return;
        }

        JSObject result = new JSObject();
        result.put("host", implementation.log(proxyInfo.getHost()));
        result.put("port", implementation.log(proxyInfo.getPort()));

        call.resolve(result);
    }
}
