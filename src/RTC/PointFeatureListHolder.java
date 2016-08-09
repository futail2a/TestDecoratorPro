package RTC;


/**
* RTC/PointFeatureListHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef PointFeatureList
     */
public final class PointFeatureListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PointFeature value[] = null;

  public PointFeatureListHolder ()
  {
  }

  public PointFeatureListHolder (RTC.PointFeature[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PointFeatureListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PointFeatureListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PointFeatureListHelper.type ();
  }

}
