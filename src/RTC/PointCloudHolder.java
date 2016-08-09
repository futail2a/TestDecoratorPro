package RTC;

/**
* RTC/PointCloudHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class PointCloudHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PointCloud value = null;

  public PointCloudHolder ()
  {
  }

  public PointCloudHolder (RTC.PointCloud initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PointCloudHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PointCloudHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PointCloudHelper.type ();
  }

}
