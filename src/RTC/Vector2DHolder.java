package RTC;

/**
* RTC/Vector2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class Vector2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Vector2D value = null;

  public Vector2DHolder ()
  {
  }

  public Vector2DHolder (RTC.Vector2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Vector2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Vector2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Vector2DHelper.type ();
  }

}
