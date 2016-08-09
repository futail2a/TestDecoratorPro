package RTC;

/**
* RTC/GPSFixTypeHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @enum GPSFixType
     */
public final class GPSFixTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.GPSFixType value = null;

  public GPSFixTypeHolder ()
  {
  }

  public GPSFixTypeHolder (RTC.GPSFixType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.GPSFixTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.GPSFixTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.GPSFixTypeHelper.type ();
  }

}
