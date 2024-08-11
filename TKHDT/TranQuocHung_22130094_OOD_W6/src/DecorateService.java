
public abstract class DecorateService extends Service{
	Service service;

	public DecorateService(int id, String ten, Service service) {
		super(id, ten);
		this.service = service;
	}

	Service getService() {
		return service;
	}

	void setService(Service service) {
		this.service = service;
	}
	

	public void checkService() {
		if (service == null) {
			this.setService(new FullService(910, "Xây trọn gói"));
		}
	}

}
