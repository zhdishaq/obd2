package io.zhdishaq.obdII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;
import com.jetbridge.reactobd2.ReactNativeOBD2Module;

public class CBObdiiPackage implements ReactPackage {
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {


        List<NativeModule> modules = new ArrayList<>();
        modules.add(new ReactNativeOBD2Module(reactContext));
        modules.add(new CBObdiiModule(reactContext));

        return  modules;

    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}
