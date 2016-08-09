package RTC;


/**
* RTC/TimedVector2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedVector2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Vector2D data = null;

  public TimedVector2D ()
  {
  } // ctor

  public TimedVector2D (RTC.Time _tm, RTC.Vector2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedVector2D
