package RTC;

/**
* RTC/TimedPoint3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedPoint3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedPoint3D value = null;

  public TimedPoint3DHolder ()
  {
  }

  public TimedPoint3DHolder (RTC.TimedPoint3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedPoint3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedPoint3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedPoint3DHelper.type ();
  }

}
