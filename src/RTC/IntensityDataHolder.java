package RTC;

/**
* RTC/IntensityDataHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class IntensityDataHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.IntensityData value = null;

  public IntensityDataHolder ()
  {
  }

  public IntensityDataHolder (RTC.IntensityData initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.IntensityDataHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.IntensityDataHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.IntensityDataHelper.type ();
  }

}
