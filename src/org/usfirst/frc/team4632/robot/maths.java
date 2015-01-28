package org.usfirst.frc.team4632.robot;

public class maths {

	public static double[] clamp(double[] values, double min1, double max1) {
		double min = Math.min(min1, max1);
		double max = Math.max(min1, max1);

		double lmax = Math.max(Math.max(values[0], values[1]),
				Math.max(values[2], values[3]));
		double lmin = Math.min(Math.min(values[0], values[1]),
				Math.min(values[2], values[3]));
		double range = max - min;
		double lrange = lmax - lmin;
		double[] product = new double[4];
		product[0] = ((((values[0] - lmin) / lrange) * range) + min);
		product[1] = ((((values[1] - lmin) / lrange) * range) + min);
		product[2] = ((((values[2] - lmin) / lrange) * range) + min);
		product[3] = ((((values[3] - lmin) / lrange) * range) + min);

		return product;

	}

}
