package RTC;


/**
* RTC/TimedPose3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedPose3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Pose3D data = null;

  public TimedPose3D ()
  {
  } // ctor

  public TimedPose3D (RTC.Time _tm, RTC.Pose3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedPose3D
