package com.sheriff91.capacitor.proxy;

import com.getcapacitor.Logger;

public class ProxyDetails {

    public String echo(String value) {
        Logger.info("Echo", value);
        return value;
    }
}
