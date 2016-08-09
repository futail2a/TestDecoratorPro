package RTC;


/**
* RTC/TimedOrientation3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedOrientation3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Orientation3D data = null;

  public TimedOrientation3D ()
  {
  } // ctor

  public TimedOrientation3D (RTC.Time _tm, RTC.Orientation3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedOrientation3D
