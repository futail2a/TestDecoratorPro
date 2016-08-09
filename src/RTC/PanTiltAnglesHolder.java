package RTC;

/**
* RTC/PanTiltAnglesHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class PanTiltAnglesHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PanTiltAngles value = null;

  public PanTiltAnglesHolder ()
  {
  }

  public PanTiltAnglesHolder (RTC.PanTiltAngles initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PanTiltAnglesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PanTiltAnglesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PanTiltAnglesHelper.type ();
  }

}
