package RTC;

/**
* RTC/OGMapConfigHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class OGMapConfigHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.OGMapConfig value = null;

  public OGMapConfigHolder ()
  {
  }

  public OGMapConfigHolder (RTC.OGMapConfig initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.OGMapConfigHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.OGMapConfigHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.OGMapConfigHelper.type ();
  }

}
