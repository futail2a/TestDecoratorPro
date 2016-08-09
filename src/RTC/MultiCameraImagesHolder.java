package RTC;

/**
* RTC/MultiCameraImagesHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class MultiCameraImagesHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.MultiCameraImages value = null;

  public MultiCameraImagesHolder ()
  {
  }

  public MultiCameraImagesHolder (RTC.MultiCameraImages initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.MultiCameraImagesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.MultiCameraImagesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.MultiCameraImagesHelper.type ();
  }

}
