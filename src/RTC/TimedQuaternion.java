package RTC;


/**
* RTC/TimedQuaternion.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedQuaternion implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Quaternion data = null;

  public TimedQuaternion ()
  {
  } // ctor

  public TimedQuaternion (RTC.Time _tm, RTC.Quaternion _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedQuaternion
