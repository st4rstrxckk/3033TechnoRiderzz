package COMPCODE;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.DcMotor; //DcMotorEx = expansion hub omg
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

//TODO: DOUBLE CHECK HARDWARE MAP PLEASEEE
@Config
public class TECHMAP {

    public DcMotor leftFront = null;
    public DcMotor rightFront = null;
    public DcMotor leftBack = null;
    public DcMotor rightBack = null;
    public DcMotor lift = null;
    public DcMotor intake = null;
    public DcMotor hang = null;
    public DcMotor hang2 = null;

    public Servo wristL = null;
    public Servo wristR = null;
    public Servo bucket = null;
    public Servo horiz = null;
  //  public Servo turn = null;

    HardwareMap hwMap  =  null;
    private ElapsedTime period  = new ElapsedTime();

    /* Constructor */
    public TECHMAP(){

    }

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        // TODO: Define and Initialize Motors
        leftFront  = hwMap.get(DcMotor.class, "frontL"); //drive stuff is in the expansion hub
        rightFront = hwMap.get(DcMotor.class, "frontR");
        leftBack  = hwMap.get(DcMotor.class, "backL");
        rightBack = hwMap.get(DcMotor.class, "backR");

        wristL = hwMap.get(Servo.class, "wristL");
        wristR = hwMap.get(Servo.class, "wristR");
        bucket = hwMap.get(Servo.class, "bucket");
        horiz = hwMap.get(Servo.class, "horiz");
      //  turn = hwMap.get(Servo.class, "RE");

        leftFront.setDirection(DcMotor.Direction.REVERSE);
        rightFront.setDirection(DcMotor.Direction.REVERSE);
        leftBack.setDirection(DcMotor.Direction.REVERSE);
        rightBack.setDirection(DcMotor.Direction.REVERSE);

        hang.setDirection(DcMotor.Direction.REVERSE);
        hang2.setDirection(DcMotor.Direction.FORWARD);
        intake.setDirection(DcMotor.Direction.REVERSE);

        horiz.setDirection(Servo.Direction.REVERSE);
        bucket.setDirection(Servo.Direction.REVERSE);
        wristL.setDirection(Servo.Direction.REVERSE);
        wristR.setDirection(Servo.Direction.FORWARD);

        leftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


        leftFront.setPower(0);
        rightFront.setPower(0);
        leftBack.setPower(0);
        rightBack.setPower(0);

//        lin.setPower(0);
//        rin.setPower(0);


        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        leftFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        leftBack.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightBack.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        lift.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//

        // Define and initialize ALL installed servos.


    }
}
