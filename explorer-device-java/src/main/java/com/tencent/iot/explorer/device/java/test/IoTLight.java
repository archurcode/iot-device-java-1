package test;

import server.samples.scenarized.LightSample;

public class IoTLight {

    private static final String TAG = "IoTLightFragment";

    private static LightSample mLightSample;
    // Default testing parameters
    private static String mBrokerURL = "ssl://iotcloud-mqtt.gz.tencentdevices.com:8883";
    private static String mProductID = "YOUR_PRODUCT_ID";
    private static String mDevName = "YOUR_DEV_NAME";
    private static String mDevPSK  = "null=="; //若使用证书验证，设为null

    private static String mDevCert = "";           // Cert String
    private static String mDevPriv = "";           // Priv String

    private final static String mJsonFileName = "gateway.json";
    public static void main(String[] args) {

        mLightSample = new LightSample(mBrokerURL, mProductID, mDevName, mDevPSK, mJsonFileName);
        mLightSample.online();

    }
}
