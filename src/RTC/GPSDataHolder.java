package RTC;

/**
* RTC/GPSDataHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class GPSDataHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.GPSData value = null;

  public GPSDataHolder ()
  {
  }

  public GPSDataHolder (RTC.GPSData initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.GPSDataHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.GPSDataHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.GPSDataHelper.type ();
  }

}
