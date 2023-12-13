// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ManipulatorConstants;

public class Indexer extends SubsystemBase {
 
  private Victor indexerMotor = new Victor(ManipulatorConstants.kIndexerPort);
  /** Creates a new Indexer. */
  public Indexer() {}

  public void rawIndexer(double power) {
    indexerMotor.set(power);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
