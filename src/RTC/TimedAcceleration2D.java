package RTC;


/**
* RTC/TimedAcceleration2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedAcceleration2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Acceleration2D data = null;

  public TimedAcceleration2D ()
  {
  } // ctor

  public TimedAcceleration2D (RTC.Time _tm, RTC.Acceleration2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedAcceleration2D
