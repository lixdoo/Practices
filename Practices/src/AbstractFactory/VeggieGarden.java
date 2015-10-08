package AbstractFactory;

public class VeggieGarden extends Garden{

	@Override
	public Plant getCenter() {
		// TODO Auto-generated method stub
		return new Plant("Broccoli");
	}

	@Override
	public Plant getBorder() {
		// TODO Auto-generated method stub
		return new Plant("Peas");
	}

	@Override
	public Plant getShade() {
		// TODO Auto-generated method stub
		return new Plant("Corn");
	}

}
