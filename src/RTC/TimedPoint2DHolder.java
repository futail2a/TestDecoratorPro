package RTC;

/**
* RTC/TimedPoint2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedPoint2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedPoint2D value = null;

  public TimedPoint2DHolder ()
  {
  }

  public TimedPoint2DHolder (RTC.TimedPoint2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedPoint2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedPoint2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedPoint2DHelper.type ();
  }

}
