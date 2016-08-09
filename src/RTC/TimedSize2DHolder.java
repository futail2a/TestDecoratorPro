package RTC;

/**
* RTC/TimedSize2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedSize2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedSize2D value = null;

  public TimedSize2DHolder ()
  {
  }

  public TimedSize2DHolder (RTC.TimedSize2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedSize2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedSize2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedSize2DHelper.type ();
  }

}
