package com.google.ads.a;

public enum u {
    ONLINE_USING_BUFFERED_ADS("online_buffered"),
    ONLINE_SERVER_REQUEST("online_request"),
    OFFLINE_USING_BUFFERED_ADS("offline_buffered"),
    OFFLINE_EMPTY("offline_empty");
    
    public String e;

    private u(String str) {
        this.e = str;
    }
}
