package RTC;

/**
* RTC/Size2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Size2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Size2D value = null;

  public Size2DHolder ()
  {
  }

  public Size2DHolder (RTC.Size2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Size2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Size2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Size2DHelper.type ();
  }

}
