package RTC;

/**
* RTC/TimedSpeedHeading2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedSpeedHeading2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedSpeedHeading2D value = null;

  public TimedSpeedHeading2DHolder ()
  {
  }

  public TimedSpeedHeading2DHolder (RTC.TimedSpeedHeading2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedSpeedHeading2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedSpeedHeading2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedSpeedHeading2DHelper.type ();
  }

}
