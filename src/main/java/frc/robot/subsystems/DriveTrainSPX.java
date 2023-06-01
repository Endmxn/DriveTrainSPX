// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrainSPX extends SubsystemBase {
  /** Creates a new DriveTrainSPX. */
  private PWMVictorSPX frontLeft;
  private PWMVictorSPX frontRight;
  private PWMVictorSPX rearLeft;
  private PWMVictorSPX rearRight; 
  private MotorControllerGroup leftMotors;
  private MotorControllerGroup rightMotors; 
  private DifferentialDrive robotDrive;

  public DriveTrainSPX() {
    frontLeft = new PWMVictorSPX(4);
    frontRight = new PWMVictorSPX(1);
    rearLeft = new PWMVictorSPX (2);
    rearRight = new PWMVictorSPX(3);  

    leftMotors = new MotorControllerGroup(frontLeft, rearLeft);
    rightMotors = new MotorControllerGroup(frontRight, rearRight); 

    rightMotors.setInverted(true);  
    robotDrive = new DifferentialDrive(leftMotors, rightMotors); 
    

  }
public void arcadeDrive(double speed, double rotation){ 
     robotDrive.arcadeDrive(speed, rotation);

}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
