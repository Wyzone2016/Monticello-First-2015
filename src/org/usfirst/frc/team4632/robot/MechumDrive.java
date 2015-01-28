package org.usfirst.frc.team4632.robot;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;

public class MechumDrive {

	Jaguar id1;
	Jaguar id2;
	Jaguar id3;
	Jaguar id4;

	public MechumDrive(int id1, int id2, int id3, int id4) {

		this.id1 = new Jaguar(id1);
		this.id2 = new Jaguar(id2);
		this.id3 = new Jaguar(id3);
		this.id4 = new Jaguar(id4);

	}

	public void Drive(Joystick stick) {

		double x = stick.getX();
		double z = stick.getZ();
		double y = stick.getY();
		double[] motorval = new double[4];
		motorval[0] = x + z;
		motorval[1] = x + -z;
		motorval[2] = -x + z;
		motorval[3] = -x - z;
		if (y >= 0) {
			maths.clamp(motorval, y, 0-(1-y));
		} else {
			maths.clamp(motorval, 0+y, 0+(-1-y));
		}
		id1.set(motorval[0]);
		id2.set(motorval[1]);
		id3.set(motorval[2]);
		id4.set(motorval[3]);

	}

}
