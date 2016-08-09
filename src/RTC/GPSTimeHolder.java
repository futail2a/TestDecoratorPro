package RTC;

/**
* RTC/GPSTimeHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class GPSTimeHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.GPSTime value = null;

  public GPSTimeHolder ()
  {
  }

  public GPSTimeHolder (RTC.GPSTime initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.GPSTimeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.GPSTimeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.GPSTimeHelper.type ();
  }

}
