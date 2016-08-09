package RTC;

/**
* RTC/TimedOrientation3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedOrientation3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedOrientation3D value = null;

  public TimedOrientation3DHolder ()
  {
  }

  public TimedOrientation3DHolder (RTC.TimedOrientation3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedOrientation3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedOrientation3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedOrientation3DHelper.type ();
  }

}
