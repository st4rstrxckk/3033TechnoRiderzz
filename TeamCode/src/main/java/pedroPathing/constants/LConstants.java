package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;

public class LConstants {
    static {
        //TODO: obtained from forward and lateral localizer tuner
        TwoWheelConstants.forwardTicksToInches = 0.019326879598472665; //PERFECT
        TwoWheelConstants.strafeTicksToInches = 0.021878477704554238; //ALSO PERFECT im lying actually

        //TODO: dist of odo pods from center of rotation
        TwoWheelConstants.forwardY = 1;
        TwoWheelConstants.strafeX = -2.5;

        //TODO: change motor port names with the respective odo encoders attached vv
        TwoWheelConstants.forwardEncoder_HardwareMapName = "hang"; //forward
        TwoWheelConstants.strafeEncoder_HardwareMapName = "hang2"; //sideways idk the port numbers
        TwoWheelConstants.forwardEncoderDirection = Encoder.REVERSE;
        TwoWheelConstants.strafeEncoderDirection = Encoder.REVERSE;


        TwoWheelConstants.IMU_HardwareMapName = "imu";
        //TODO: set imu direction
        TwoWheelConstants.IMU_Orientation = new RevHubOrientationOnRobot(RevHubOrientationOnRobot.LogoFacingDirection.UP, RevHubOrientationOnRobot.UsbFacingDirection.LEFT);

    } 
}




