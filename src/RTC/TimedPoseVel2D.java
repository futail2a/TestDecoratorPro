package RTC;


/**
* RTC/TimedPoseVel2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedPoseVel2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.PoseVel2D data = null;

  public TimedPoseVel2D ()
  {
  } // ctor

  public TimedPoseVel2D (RTC.Time _tm, RTC.PoseVel2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedPoseVel2D
