package RTC;

/**
* RTC/TimedGeometry2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class TimedGeometry2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedGeometry2D value = null;

  public TimedGeometry2DHolder ()
  {
  }

  public TimedGeometry2DHolder (RTC.TimedGeometry2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedGeometry2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedGeometry2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedGeometry2DHelper.type ();
  }

}
