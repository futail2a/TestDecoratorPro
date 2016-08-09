package RTC;

/**
* RTC/TimedCovariance2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedCovariance2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedCovariance2D value = null;

  public TimedCovariance2DHolder ()
  {
  }

  public TimedCovariance2DHolder (RTC.TimedCovariance2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedCovariance2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedCovariance2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedCovariance2DHelper.type ();
  }

}
