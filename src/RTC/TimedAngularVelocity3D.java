package RTC;


/**
* RTC/TimedAngularVelocity3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedAngularVelocity3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.AngularVelocity3D data = null;

  public TimedAngularVelocity3D ()
  {
  } // ctor

  public TimedAngularVelocity3D (RTC.Time _tm, RTC.AngularVelocity3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedAngularVelocity3D
