package RTC;


/**
* RTC/TimedGeometry3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedGeometry3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Geometry3D data = null;

  public TimedGeometry3D ()
  {
  } // ctor

  public TimedGeometry3D (RTC.Time _tm, RTC.Geometry3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedGeometry3D
