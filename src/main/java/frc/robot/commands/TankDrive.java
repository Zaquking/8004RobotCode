/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;


public class TankDrive extends CommandBase {

  /**
   * Creates a new TankDrive.
   */
  public TankDrive() {

    addRequirements(Robot.DriveTrain);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
    final double leftStickY = Robot.robotContainer.GetDriverRawAxis(Constants.LEFT_STICK_Y);
    final double rightStickY = Robot.robotContainer.GetDriverRawAxis(Constants.RIGHT_STICK_Y);

    Robot.DriveTrain.SetLeftMotors(leftStickY*leftStickY);
    Robot.DriveTrain.SetRightMotors(rightStickY*rightStickY);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(final boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
