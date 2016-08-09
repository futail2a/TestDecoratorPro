package RTC;

/**
* RTC/TimedAcceleration3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedAcceleration3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedAcceleration3D value = null;

  public TimedAcceleration3DHolder ()
  {
  }

  public TimedAcceleration3DHolder (RTC.TimedAcceleration3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedAcceleration3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedAcceleration3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedAcceleration3DHelper.type ();
  }

}
