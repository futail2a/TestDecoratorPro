package RTC;

/**
* RTC/PanTiltStateHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class PanTiltStateHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PanTiltState value = null;

  public PanTiltStateHolder ()
  {
  }

  public PanTiltStateHolder (RTC.PanTiltState initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PanTiltStateHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PanTiltStateHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PanTiltStateHelper.type ();
  }

}
