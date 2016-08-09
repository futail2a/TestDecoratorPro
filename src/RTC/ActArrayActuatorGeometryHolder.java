package RTC;

/**
* RTC/ActArrayActuatorGeometryHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class ActArrayActuatorGeometryHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.ActArrayActuatorGeometry value = null;

  public ActArrayActuatorGeometryHolder ()
  {
  }

  public ActArrayActuatorGeometryHolder (RTC.ActArrayActuatorGeometry initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.ActArrayActuatorGeometryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.ActArrayActuatorGeometryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.ActArrayActuatorGeometryHelper.type ();
  }

}
