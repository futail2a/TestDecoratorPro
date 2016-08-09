package RTC;


/**
* RTC/PoseFeatureListHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef PoseFeatureList
     */
public final class PoseFeatureListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PoseFeature value[] = null;

  public PoseFeatureListHolder ()
  {
  }

  public PoseFeatureListHolder (RTC.PoseFeature[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PoseFeatureListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PoseFeatureListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PoseFeatureListHelper.type ();
  }

}
