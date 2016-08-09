package RTC;


/**
* RTC/TimedPoint2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedPoint2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Point2D data = null;

  public TimedPoint2D ()
  {
  } // ctor

  public TimedPoint2D (RTC.Time _tm, RTC.Point2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedPoint2D
