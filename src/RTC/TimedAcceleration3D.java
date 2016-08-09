package RTC;


/**
* RTC/TimedAcceleration3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedAcceleration3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Acceleration3D data = null;

  public TimedAcceleration3D ()
  {
  } // ctor

  public TimedAcceleration3D (RTC.Time _tm, RTC.Acceleration3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedAcceleration3D
