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
//			RoadRage.arcadeDrive(TheDeathOfTheEntireUniverse);
//			DoUEvenLiftBro.set(TheDeathOfTheEntireUniverse.getZ());
//			if( TheDeathOfTheEntireUniverse.getRawButton(3)==true){
//				thereisntalanguageonearththathasawordforhowlittleicare.set(true);
//			}else{
//				thereisntalanguageonearththathasawordforhowlittleicare.set(false);
//			}
//		
			drive.Drive(TheDeathOfTheEntireUniverse);
		}

	}

	public void test() {

	}
}
