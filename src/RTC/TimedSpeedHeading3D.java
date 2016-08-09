package RTC;


/**
* RTC/TimedSpeedHeading3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedSpeedHeading3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.SpeedHeading3D data = null;

  public TimedSpeedHeading3D ()
  {
  } // ctor

  public TimedSpeedHeading3D (RTC.Time _tm, RTC.SpeedHeading3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedSpeedHeading3D
