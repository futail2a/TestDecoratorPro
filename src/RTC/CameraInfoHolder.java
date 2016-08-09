package RTC;

/**
* RTC/CameraInfoHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class CameraInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.CameraInfo value = null;

  public CameraInfoHolder ()
  {
  }

  public CameraInfoHolder (RTC.CameraInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.CameraInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.CameraInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.CameraInfoHelper.type ();
  }

}
