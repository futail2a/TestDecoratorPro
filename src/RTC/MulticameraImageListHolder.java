package RTC;


/**
* RTC/MulticameraImageListHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef MulticameraImageList
     */
public final class MulticameraImageListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.CameraImage value[] = null;

  public MulticameraImageListHolder ()
  {
  }

  public MulticameraImageListHolder (RTC.CameraImage[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.MulticameraImageListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.MulticameraImageListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.MulticameraImageListHelper.type ();
  }

}
