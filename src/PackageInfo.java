
public class PackageInfo {

	String packageName;
	double ca;
	double ce;
	double na;
	double nc;

	public PackageInfo(double na, double nc, double ca, double ce) {
		this.ce = ce;
		this.ca = ca;
		this.na = na;
		this.nc = nc;
	}

	public double getInstability() {
		return ce / (ca + ce);
	}

	public double getAbstractness() {
		return na / nc;
	}

}
