package com.sheriff91.capacitor.proxy;

import com.getcapacitor.Logger;

public class ProxyDetails {

    public String log(String value) {
        Logger.info("ProxyDetailsPlugin getProxy:::", value);
        return value;
    }

    public int log(int value) {
        Logger.info("ProxyDetailsPlugin getProxy:::", String.valueOf(value));
        return value;
    }
}
