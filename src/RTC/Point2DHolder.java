package RTC;

/**
* RTC/Point2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Point2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Point2D value = null;

  public Point2DHolder ()
  {
  }

  public Point2DHolder (RTC.Point2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Point2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Point2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Point2DHelper.type ();
  }

}
