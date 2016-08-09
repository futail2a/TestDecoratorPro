package RTC;

/**
* RTC/FeaturesHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class FeaturesHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Features value = null;

  public FeaturesHolder ()
  {
  }

  public FeaturesHolder (RTC.Features initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.FeaturesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.FeaturesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.FeaturesHelper.type ();
  }

}
