package RTC;

/**
* RTC/Path2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class Path2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Path2D value = null;

  public Path2DHolder ()
  {
  }

  public Path2DHolder (RTC.Path2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Path2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Path2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Path2DHelper.type ();
  }

}
