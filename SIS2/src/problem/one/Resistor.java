package problem.one;

public class Resistor extends Circuit{
	private double resistance;
	private double potentialDiff;
	
	public Resistor(double resistance) {
		this.resistance = resistance;
	}
	
	@Override
	public double getResistance() {
		return resistance;
	}

	@Override
	public double getPotentialDiff() {
		return potentialDiff;
	}

	@Override
	public void applyPotentialDiff(double v) {
		potentialDiff = v;
	}

}
