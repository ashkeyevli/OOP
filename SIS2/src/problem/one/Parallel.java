package problem.one;

public class Parallel extends Circuit{
	protected Circuit a;
	protected Circuit b;
		
	public Parallel(Circuit a, Circuit b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double getResistance() {
		return (a.getResistance() * b.getResistance())/(a.getResistance() + b.getResistance());
	}

	@Override
	public double getPotentialDiff() {
		return a.getPotentialDiff();
	}

	@Override
	public void applyPotentialDiff(double v) {	
		a.applyPotentialDiff(v);
		b.applyPotentialDiff(v);
	}

}
