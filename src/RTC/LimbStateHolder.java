package RTC;

/**
* RTC/LimbStateHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class LimbStateHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.LimbState value = null;

  public LimbStateHolder ()
  {
  }

  public LimbStateHolder (RTC.LimbState initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.LimbStateHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.LimbStateHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.LimbStateHelper.type ();
  }

}
