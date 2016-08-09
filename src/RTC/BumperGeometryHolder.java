package RTC;

/**
* RTC/BumperGeometryHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class BumperGeometryHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.BumperGeometry value = null;

  public BumperGeometryHolder ()
  {
  }

  public BumperGeometryHolder (RTC.BumperGeometry initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.BumperGeometryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.BumperGeometryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.BumperGeometryHelper.type ();
  }

}
