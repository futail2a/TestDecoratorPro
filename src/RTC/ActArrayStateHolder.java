package RTC;

/**
* RTC/ActArrayStateHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class ActArrayStateHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.ActArrayState value = null;

  public ActArrayStateHolder ()
  {
  }

  public ActArrayStateHolder (RTC.ActArrayState initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.ActArrayStateHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.ActArrayStateHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.ActArrayStateHelper.type ();
  }

}
