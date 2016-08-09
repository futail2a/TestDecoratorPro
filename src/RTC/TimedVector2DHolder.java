package RTC;

/**
* RTC/TimedVector2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedVector2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedVector2D value = null;

  public TimedVector2DHolder ()
  {
  }

  public TimedVector2DHolder (RTC.TimedVector2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedVector2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedVector2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedVector2DHelper.type ();
  }

}
