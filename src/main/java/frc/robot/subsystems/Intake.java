package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

public class Intake {
    Spark m_name = new Spark(4);
    private final DoubleSolenoid ps3SolDouble = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 2, 3);
    private boolean isUp = true;

    private void a() {
        ps3SolDouble.set(DoubleSolenoid.Value.kOff);
        ps3SolDouble.set(DoubleSolenoid.Value.kForward);
        ps3SolDouble.set(DoubleSolenoid.Value.kReverse);
 
    }

    public void intakeMove(boolean b){
        if(b){
            m_name.set(1);
        } else {
            m_name.set(0);
        }
    }
    public void upDownSol(){
        ps3SolDouble.set(kOff);
        if(isUp){
            ps3SolDouble.set(kReverse);
        } else {
            ps3SolDouble.set(kForward);
        }

        isUp = !isUp;
    }
}