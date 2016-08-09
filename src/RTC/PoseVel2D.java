package RTC;


/**
* RTC/PoseVel2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class PoseVel2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Pose2D pose = null;
  public RTC.Velocity2D velocities = null;

  public PoseVel2D ()
  {
  } // ctor

  public PoseVel2D (RTC.Pose2D _pose, RTC.Velocity2D _velocities)
  {
    pose = _pose;
    velocities = _velocities;
  } // ctor

} // class PoseVel2D
