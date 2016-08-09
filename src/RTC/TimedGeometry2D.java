package RTC;


/**
* RTC/TimedGeometry2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedGeometry2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Geometry2D data = null;

  public TimedGeometry2D ()
  {
  } // ctor

  public TimedGeometry2D (RTC.Time _tm, RTC.Geometry2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedGeometry2D
