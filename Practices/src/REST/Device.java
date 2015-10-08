package REST;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;



//*****实体类******//
@XmlRootElement (name="device")
public class Device {
	private String deviceIp;
	private int deviceStatus;
	
	public Device(){
		
	}
	
	
	public Device(String deviceIp){
		this.deviceIp = deviceIp;
	}

	@XmlAttribute
	public String getDeviceIp() {
		return deviceIp;
	}

	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}

	@XmlAttribute
	public int getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(int deviceStatus) {
		this.deviceStatus = deviceStatus;
	}
	
	
	
}
