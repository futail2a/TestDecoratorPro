package RTC;


/**
* RTC/TimedSize3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedSize3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Size3D data = null;

  public TimedSize3D ()
  {
  } // ctor

  public TimedSize3D (RTC.Time _tm, RTC.Size3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedSize3D
