package RTC;

/**
* RTC/TimedCovariance3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedCovariance3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedCovariance3D value = null;

  public TimedCovariance3DHolder ()
  {
  }

  public TimedCovariance3DHolder (RTC.TimedCovariance3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedCovariance3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedCovariance3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedCovariance3DHelper.type ();
  }

}
