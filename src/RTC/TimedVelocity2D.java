package RTC;


/**
* RTC/TimedVelocity2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedVelocity2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Velocity2D data = null;

  public TimedVelocity2D ()
  {
  } // ctor

  public TimedVelocity2D (RTC.Time _tm, RTC.Velocity2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedVelocity2D
