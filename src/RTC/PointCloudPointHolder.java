package RTC;

/**
* RTC/PointCloudPointHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class PointCloudPointHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PointCloudPoint value = null;

  public PointCloudPointHolder ()
  {
  }

  public PointCloudPointHolder (RTC.PointCloudPoint initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PointCloudPointHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PointCloudPointHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PointCloudPointHelper.type ();
  }

}
