import { NativeModules } from 'react-native';

const { CBObdii,JetBridge_OBDII } = NativeModules;

export default JetBridge_OBDII;

class react_obd2 {
    constructor() {
    }
  
    ready() {
        JetBridge_OBDII.ready();
    }
  
    getBluetoothDeviceNameList() {
      return JetBridge_OBDII.getBluetoothDeviceName();
    }
  
    setMockUpMode(aEnabled) {
        JetBridge_OBDII.setMockUpMode(aEnabled);
    }
  
    startLiveData(aDeviceAddress) {
        JetBridge_OBDII.setRemoteDeviceAddress(aDeviceAddress);
        JetBridge_OBDII.startLiveData();
    }
  
    stopLiveData() {
      return JetBridge_OBDII.stopLiveData();
    }
  }
  
  module.exports = new react_obd2();