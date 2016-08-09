package RTC;

/**
* RTC/INSDataHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class INSDataHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.INSData value = null;

  public INSDataHolder ()
  {
  }

  public INSDataHolder (RTC.INSData initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.INSDataHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.INSDataHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.INSDataHelper.type ();
  }

}
