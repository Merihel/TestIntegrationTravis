package com.amiltone.ci.model.pojo;

import java.util.List;

/**
 * Created by amiltonedev_lt027 on 01/11/2016.
 */

public interface BLEDevice {
    int OFFLINE = 0;
    int AVAILABLE = 1;
    int CONNECTED = 2;

    int getStatus();
    String getLastValue();
    List<String> getLastValues();
    boolean pairConnectDevice();
}