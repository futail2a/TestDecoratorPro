package RTC;

/**
* RTC/BumperArrayGeometryHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class BumperArrayGeometryHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.BumperArrayGeometry value = null;

  public BumperArrayGeometryHolder ()
  {
  }

  public BumperArrayGeometryHolder (RTC.BumperArrayGeometry initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.BumperArrayGeometryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.BumperArrayGeometryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.BumperArrayGeometryHelper.type ();
  }

}
