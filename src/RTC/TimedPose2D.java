package RTC;


/**
* RTC/TimedPose2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedPose2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Pose2D data = null;

  public TimedPose2D ()
  {
  } // ctor

  public TimedPose2D (RTC.Time _tm, RTC.Pose2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedPose2D
