package RTC;


/**
* RTC/MulticameraInfoListHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef MulticameraInfoList
     */
public final class MulticameraInfoListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.CameraInfo value[] = null;

  public MulticameraInfoListHolder ()
  {
  }

  public MulticameraInfoListHolder (RTC.CameraInfo[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.MulticameraInfoListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.MulticameraInfoListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.MulticameraInfoListHelper.type ();
  }

}
