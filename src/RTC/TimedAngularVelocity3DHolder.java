package RTC;

/**
* RTC/TimedAngularVelocity3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedAngularVelocity3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedAngularVelocity3D value = null;

  public TimedAngularVelocity3DHolder ()
  {
  }

  public TimedAngularVelocity3DHolder (RTC.TimedAngularVelocity3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedAngularVelocity3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedAngularVelocity3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedAngularVelocity3DHelper.type ();
  }

}
