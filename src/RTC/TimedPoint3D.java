package RTC;


/**
* RTC/TimedPoint3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedPoint3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Point3D data = null;

  public TimedPoint3D ()
  {
  } // ctor

  public TimedPoint3D (RTC.Time _tm, RTC.Point3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedPoint3D
