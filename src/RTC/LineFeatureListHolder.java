package RTC;


/**
* RTC/LineFeatureListHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef LineFeatureList
     */
public final class LineFeatureListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.LineFeature value[] = null;

  public LineFeatureListHolder ()
  {
  }

  public LineFeatureListHolder (RTC.LineFeature[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.LineFeatureListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.LineFeatureListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.LineFeatureListHelper.type ();
  }

}
