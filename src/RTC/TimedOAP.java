package RTC;


/**
* RTC/TimedOAP.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedOAP implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.OAP data = null;

  public TimedOAP ()
  {
  } // ctor

  public TimedOAP (RTC.Time _tm, RTC.OAP _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedOAP
