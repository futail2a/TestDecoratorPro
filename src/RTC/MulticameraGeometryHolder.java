package RTC;

/**
* RTC/MulticameraGeometryHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class MulticameraGeometryHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.MulticameraGeometry value = null;

  public MulticameraGeometryHolder ()
  {
  }

  public MulticameraGeometryHolder (RTC.MulticameraGeometry initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.MulticameraGeometryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.MulticameraGeometryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.MulticameraGeometryHelper.type ();
  }

}
