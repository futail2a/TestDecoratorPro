package RTC;

/**
* RTC/TimedAngularAcceleration3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedAngularAcceleration3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedAngularAcceleration3D value = null;

  public TimedAngularAcceleration3DHolder ()
  {
  }

  public TimedAngularAcceleration3DHolder (RTC.TimedAngularAcceleration3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedAngularAcceleration3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedAngularAcceleration3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedAngularAcceleration3DHelper.type ();
  }

}
