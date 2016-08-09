package RTC;


/**
* RTC/TimedRGBColour.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedRGBColour implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.RGBColour data = null;

  public TimedRGBColour ()
  {
  } // ctor

  public TimedRGBColour (RTC.Time _tm, RTC.RGBColour _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedRGBColour
