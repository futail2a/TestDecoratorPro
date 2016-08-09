package RTC;


/**
* RTC/PointCloudPointListHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef PointCloudPointList
     */
public final class PointCloudPointListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PointCloudPoint value[] = null;

  public PointCloudPointListHolder ()
  {
  }

  public PointCloudPointListHolder (RTC.PointCloudPoint[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PointCloudPointListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PointCloudPointListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PointCloudPointListHelper.type ();
  }

}
