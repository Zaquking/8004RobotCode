/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class DriveTrain extends SubsystemBase {
  private TalonSRX motorLeft1 = new TalonSRX(Constants.MOTOR_LEFT_1_ID);
  private TalonSRX motorLeft2 = new TalonSRX(Constants.MOTOR_LEFT_2_ID);
  private TalonSRX motorRight1 = new TalonSRX(Constants.MOTOR_RIGHT_1_ID);
  private TalonSRX motorRight2 = new TalonSRX(Constants.MOTOR_RIGHT_2_ID);



  /**
   * Creates a new DriveTrain.
   */
  public DriveTrain() {

    Robot.initTalon(motorLeft1);
    Robot.initTalon(motorLeft2);
    Robot.initTalon(motorRight1);
    Robot.initTalon(motorRight2);

  }

  @Override
  public void periodic() {


}

public void SetLeftMotors(Double speed)
{
  motorLeft1.set(ControlMode.PercentOutput, speed);
  motorLeft2.set(ControlMode.PercentOutput, speed);
}

public void SetRightMotors(Double speed)
{
  motorRight1.set(ControlMode.PercentOutput, speed);
  motorRight2.set(ControlMode.PercentOutput, speed);
}

}
