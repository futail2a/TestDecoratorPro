package RTC;


/**
* RTC/ActArrayActuatorGeometryListHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef ActArrayActuatorGeometryList
     * @brief List of ActArrayActuatorGeometry elements.
     */
public final class ActArrayActuatorGeometryListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.ActArrayActuatorGeometry value[] = null;

  public ActArrayActuatorGeometryListHolder ()
  {
  }

  public ActArrayActuatorGeometryListHolder (RTC.ActArrayActuatorGeometry[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.ActArrayActuatorGeometryListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.ActArrayActuatorGeometryListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.ActArrayActuatorGeometryListHelper.type ();
  }

}
