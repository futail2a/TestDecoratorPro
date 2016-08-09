package RTC;


/**
* RTC/TimedFloat.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

public final class TimedFloat implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public float data = (float)0;

  public TimedFloat ()
  {
  } // ctor

  public TimedFloat (RTC.Time _tm, float _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedFloat
