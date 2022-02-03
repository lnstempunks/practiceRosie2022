package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

public class Drivetrain {

//Variables

public static Spark m_frontLeft, m_backLeft, m_frontRight, m_backRight;
public static MecanumDrive m_drive;



//Methods


public Drivetrain(){
    m_frontLeft = new Spark(3);
    m_backLeft = new Spark(2);
    m_frontRight = new Spark(1);
    m_backRight = new Spark(0);
    m_backRight.setInverted(true);
    m_backLeft.setInverted(true);



m_drive = new MecanumDrive((MotorController)m_backRight,(MotorController)m_backLeft,(MotorController)m_frontRight, (MotorController)m_frontLeft);
m_drive.setExpiration(0.1);
m_drive.setSafetyEnabled(true);
}

public void drive(double y, double x, double z){
    y = Math.round(y*-100.00)/100.00;
    x = Math.round(x*-100.00)/100.00;
    z = Math.round(z*-100.00)/100.00;
    m_drive.driveCartesian(y, x, z);
} 


}
