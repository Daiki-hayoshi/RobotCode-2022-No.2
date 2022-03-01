package frc.robot.mode;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.State;
import frc.robot.State.DriveSpeed;;

public class DriveMode extends Mode {
    
    @Override
    public void changeMode() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void changeState() {
        State.driveSpeed = DriveSpeed.s_fastDrive;
        State.driveXSpeed = driveController.getLeftY();
        State.driveZRotation = driveController.getRightX();
        
    }
    
}