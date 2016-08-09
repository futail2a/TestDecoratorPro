package RTC;


/**
* RTC/TimedSize2D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedSize2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Size2D data = null;

  public TimedSize2D ()
  {
  } // ctor

  public TimedSize2D (RTC.Time _tm, RTC.Size2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedSize2D
