package RTC;


/**
* RTC/TimedVelocity3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedVelocity3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Velocity3D data = null;

  public TimedVelocity3D ()
  {
  } // ctor

  public TimedVelocity3D (RTC.Time _tm, RTC.Velocity3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedVelocity3D
