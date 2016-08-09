package RTC;


/**
* RTC/TimedAngularAcceleration3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedAngularAcceleration3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.AngularAcceleration3D data = null;

  public TimedAngularAcceleration3D ()
  {
  } // ctor

  public TimedAngularAcceleration3D (RTC.Time _tm, RTC.AngularAcceleration3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedAngularAcceleration3D
