package REST;

import java.util.concurrent.ConcurrentHashMap;

public class DeviceDao {
	ConcurrentHashMap <String,Device> fakeDB = new ConcurrentHashMap<>();
	
	public DeviceDao(){
		fakeDB.put("10.11.68.90", new Device("10.11.68.90"));
		fakeDB.put("10.11.68.91", new Device("10.11.68.91"));
	}
	
	public Device getDevice(String ip){
		return fakeDB.get(ip);
	}
	
	public Device updateDevice(Device device){
		String ip = device.getDeviceIp();
		fakeDB.put(ip, device);
		return fakeDB.get(ip);
	}
	
	
}
