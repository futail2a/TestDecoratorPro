package RTC;

/**
* RTC/OAPHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class OAPHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.OAP value = null;

  public OAPHolder ()
  {
  }

  public OAPHolder (RTC.OAP initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.OAPHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.OAPHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.OAPHelper.type ();
  }

}
