package RTC;


/**
* RTC/TimedVector3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedVector3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Vector3D data = null;

  public TimedVector3D ()
  {
  } // ctor

  public TimedVector3D (RTC.Time _tm, RTC.Vector3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedVector3D
