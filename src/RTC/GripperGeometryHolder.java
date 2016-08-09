package RTC;

/**
* RTC/GripperGeometryHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class GripperGeometryHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.GripperGeometry value = null;

  public GripperGeometryHolder ()
  {
  }

  public GripperGeometryHolder (RTC.GripperGeometry initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.GripperGeometryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.GripperGeometryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.GripperGeometryHelper.type ();
  }

}
