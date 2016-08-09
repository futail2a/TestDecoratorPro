package RTC;

/**
* RTC/PointCovariance2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class PointCovariance2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PointCovariance2D value = null;

  public PointCovariance2DHolder ()
  {
  }

  public PointCovariance2DHolder (RTC.PointCovariance2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PointCovariance2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PointCovariance2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PointCovariance2DHelper.type ();
  }

}
