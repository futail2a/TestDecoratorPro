package RTC;


/**
* RTC/MulticameraGeometryListHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef MulticameraGeometryList
     */
public final class MulticameraGeometryListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Geometry3D value[] = null;

  public MulticameraGeometryListHolder ()
  {
  }

  public MulticameraGeometryListHolder (RTC.Geometry3D[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.MulticameraGeometryListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.MulticameraGeometryListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.MulticameraGeometryListHelper.type ();
  }

}
