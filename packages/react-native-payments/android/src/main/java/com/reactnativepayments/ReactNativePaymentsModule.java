package com.reactnativepayments;


import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;


public class ReactNativePaymentsModule extends ReactContextBaseJavaModule {

    public static final String REACT_CLASS = "ReactNativePayments";

    private static ReactApplicationContext reactContext = null;

    public ReactNativePaymentsModule(ReactApplicationContext context) {
        // Pass in the context to the constructor and save it so you can emit events
        // https://facebook.github.io/react-native/docs/native-modules-android.html#the-toast-module
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        // Tell React the name of the module
        // https://facebook.github.io/react-native/docs/native-modules-android.html#the-toast-module
        return REACT_CLASS;
    }



}
