// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSPX;

public class DefaultDrive extends CommandBase {
  /** Creates a new DefaultDrive. */
  private DoubleSupplier xSpeed; 
  private DoubleSupplier ySpeed;  
  private DriveTrainSPX drive;
  
  public DefaultDrive(DoubleSupplier xSpeed, DoubleSupplier ySpeed, DriveTrainSPX drive) {
    // Use addRequirements() here to declare subsystem dependencies. 
    this.xSpeed = xSpeed;  
    this.ySpeed = ySpeed; 
    this.drive = drive;  

    addRequirements(drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      drive.arcadeDrive(xSpeed.getAsDouble(), ySpeed.getAsDouble());

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
