package RTC;

/**
* RTC/Acceleration2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Acceleration2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Acceleration2D value = null;

  public Acceleration2DHolder ()
  {
  }

  public Acceleration2DHolder (RTC.Acceleration2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Acceleration2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Acceleration2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Acceleration2DHelper.type ();
  }

}
