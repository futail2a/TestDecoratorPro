package RTC;


/**
* RTC/TimedPointCovariance2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedPointCovariance2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.PointCovariance2D data = null;

  public TimedPointCovariance2D ()
  {
  } // ctor

  public TimedPointCovariance2D (RTC.Time _tm, RTC.PointCovariance2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedPointCovariance2D
