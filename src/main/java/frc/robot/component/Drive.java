package frc.robot.component;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import frc.robot.subClass.State;

public class Drive extends DifferentialDrive implements Component{
    public Drive() {
        super(new Spark(0), new Spark(1));
    }

    @Override
    public void autonomousInit() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void teleopInit() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void disabledInit() {}

    @Override
    public void testInit() {}

    @Override
    public void readSensors(State state) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void applyState(final State state) {
        // TODO Auto-generated method stub
    }
}
