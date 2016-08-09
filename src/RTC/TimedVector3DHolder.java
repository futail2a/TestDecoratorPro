package RTC;

/**
* RTC/TimedVector3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedVector3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedVector3D value = null;

  public TimedVector3DHolder ()
  {
  }

  public TimedVector3DHolder (RTC.TimedVector3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedVector3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedVector3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedVector3DHelper.type ();
  }

}
