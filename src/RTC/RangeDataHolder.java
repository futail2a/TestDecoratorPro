package RTC;

/**
* RTC/RangeDataHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class RangeDataHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.RangeData value = null;

  public RangeDataHolder ()
  {
  }

  public RangeDataHolder (RTC.RangeData initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.RangeDataHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.RangeDataHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.RangeDataHelper.type ();
  }

}
