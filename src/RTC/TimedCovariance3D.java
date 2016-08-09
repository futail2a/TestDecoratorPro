package RTC;


/**
* RTC/TimedCovariance3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedCovariance3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Covariance3D data = null;

  public TimedCovariance3D ()
  {
  } // ctor

  public TimedCovariance3D (RTC.Time _tm, RTC.Covariance3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedCovariance3D
