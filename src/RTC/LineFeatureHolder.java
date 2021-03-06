package RTC;

/**
* RTC/LineFeatureHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class LineFeatureHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.LineFeature value = null;

  public LineFeatureHolder ()
  {
  }

  public LineFeatureHolder (RTC.LineFeature initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.LineFeatureHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.LineFeatureHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.LineFeatureHelper.type ();
  }

}
