package RTC;


/**
* RTC/TimedSpeedHeading2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedSpeedHeading2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.SpeedHeading2D data = null;

  public TimedSpeedHeading2D ()
  {
  } // ctor

  public TimedSpeedHeading2D (RTC.Time _tm, RTC.SpeedHeading2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedSpeedHeading2D
