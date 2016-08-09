package RTC;


/**
* RTC/TimedCovariance2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedCovariance2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Covariance2D data = null;

  public TimedCovariance2D ()
  {
  } // ctor

  public TimedCovariance2D (RTC.Time _tm, RTC.Covariance2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedCovariance2D
