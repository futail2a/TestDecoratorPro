package RTC;


/**
* RTC/PoseVel3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class PoseVel3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Pose3D pose = null;
  public RTC.Velocity3D velocities = null;

  public PoseVel3D ()
  {
  } // ctor

  public PoseVel3D (RTC.Pose3D _pose, RTC.Velocity3D _velocities)
  {
    pose = _pose;
    velocities = _velocities;
  } // ctor

} // class PoseVel3D
