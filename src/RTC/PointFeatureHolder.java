package RTC;

/**
* RTC/PointFeatureHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class PointFeatureHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PointFeature value = null;

  public PointFeatureHolder ()
  {
  }

  public PointFeatureHolder (RTC.PointFeature initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PointFeatureHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PointFeatureHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PointFeatureHelper.type ();
  }

}
