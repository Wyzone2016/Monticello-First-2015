package org.usfirst.frc.team4632.robot;

import java.util.Random;

import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;

/**
 * I LIEK ROBITS BRUHHHH!
 */
public class Robot extends SampleRobot {
	
	Joystick stick = new Joystick(1);
	Button sol1 = new JoystickButton(stick,1);
	Button c1 = new JoystickButton(stick,2);
	Button c0 = new JoystickButton(stick,2);
//	Talon AssassinsCreed = new Talon(0);
//	Talon Urhmagerd = new Talon(1);
	Talon DoUEvenLiftBro = new Talon(2);
	RobotDrive RoadRage = new RobotDrive(0, 1);
	Solenoid claw = new Solenoid(1,4);
    Compressor *c =new Compressor(0);
    
	public Robot() {

	}

	public void autonomous() {

	}

	public void operatorControl() {

		
		while (isOperatorControl()) {
			RoadRage.arcadeDrive(stick);
			if (button1) {
				
			}
			DoUEvenLiftBro.set(stick.getZ());
			
		}

	}

	public void test() {

	}
}
