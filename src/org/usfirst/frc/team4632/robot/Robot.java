package org.usfirst.frc.team4632.robot;



import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;


/**
 * I LIEK ROBITS BRUHHHH!
 */
public class Robot extends SampleRobot {
<<<<<<< HEAD

	Joystick TheDeathOfTheEntireUniverse = new Joystick(1);
//	// Talon AssassinsCreed = new Talon(0);
//	// Talon Urhmagerd = new Talon(1);
//	Talon DoUEvenLiftBro = new Talon(2);
//	RobotDrive RoadRage = new RobotDrive(0, 1);
//	
//	Compressor AReallyBigQuantumSuperComputer = new Compressor(0);
//	Solenoid thereisntalanguageonearththathasawordforhowlittleicare = new Solenoid(0);
//	
	MechumDrive drive = new MechumDrive(0, 1, 2, 3);
	
=======
	
	Joystick stick = new Joystick(1);
	Button sol1 = new JoystickButton(stick,1);
	Button c1 = new JoystickButton(stick,2);
	Button c0 = new JoystickButton(stick,3);
//	Talon AssassinsCreed = new Talon(0);
//	Talon Urhmagerd = new Talon(1);
	Talon DoUEvenLiftBro = new Talon(2);
	RobotDrive RoadRage = new RobotDrive(0, 1);
	Solenoid claw = new Solenoid(1,4);
    Compressor *c =new Compressor(0);
    
    
>>>>>>> origin/master
	public Robot() {

	}

	public void autonomous() {
	Talon woah = new Talon(0);
	float Timer=0;	
	while(isAutonomous()){
			
			woah.set(Math.sin(Timer));
			Timer = Timer+.1f;
		}
	}

	public void operatorControl() {
	
		CameraServer server = CameraServer.getInstance();
		server.setQuality(50);
	        //the camera name (ex "cam0") can be found through the roborio web interface
	    server.startAutomaticCapture("cam0");
	        
//		AReallyBigQuantumSuperComputer.start();
		while (isOperatorControl()) {
<<<<<<< HEAD
//			RoadRage.arcadeDrive(TheDeathOfTheEntireUniverse);
//			DoUEvenLiftBro.set(TheDeathOfTheEntireUniverse.getZ());
//			if( TheDeathOfTheEntireUniverse.getRawButton(3)==true){
//				thereisntalanguageonearththathasawordforhowlittleicare.set(true);
//			}else{
//				thereisntalanguageonearththathasawordforhowlittleicare.set(false);
//			}
//		
			drive.Drive(TheDeathOfTheEntireUniverse);
=======
			RoadRage.arcadeDrive(stick);
			if (button1) {
				
			}
			if (c->set)
			DoUEvenLiftBro.set(stick.getZ());
			
>>>>>>> origin/master
		}

	}

	public void test() {

	}
}
