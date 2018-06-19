package com.teamcautionrobotics.misc20XX;

import edu.wpi.first.wpilibj.VictorSP;

public class Intake{ //create motor (like drivebase)
	VictorSP intakeMotor;
	
	public Intake(int channel) {
		intakeMotor = new VictorSP(channel);
	}
	
	public void move(double inPower) {
		intakeMotor.set(inPower);
	}
	
	
}
