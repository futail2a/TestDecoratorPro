package RTC;

/**
* RTC/GripperStateHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class GripperStateHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.GripperState value = null;

  public GripperStateHolder ()
  {
  }

  public GripperStateHolder (RTC.GripperState initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.GripperStateHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.GripperStateHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.GripperStateHelper.type ();
  }

}
