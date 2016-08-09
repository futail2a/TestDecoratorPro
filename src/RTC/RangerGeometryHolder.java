package RTC;

/**
* RTC/RangerGeometryHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class RangerGeometryHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.RangerGeometry value = null;

  public RangerGeometryHolder ()
  {
  }

  public RangerGeometryHolder (RTC.RangerGeometry initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.RangerGeometryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.RangerGeometryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.RangerGeometryHelper.type ();
  }

}
