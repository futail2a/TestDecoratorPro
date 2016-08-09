package RTC;


/**
* RTC/IntensityListHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef IntensityList
     */
public final class IntensityListHolder implements org.omg.CORBA.portable.Streamable
{
  public double value[] = null;

  public IntensityListHolder ()
  {
  }

  public IntensityListHolder (double[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.IntensityListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.IntensityListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.IntensityListHelper.type ();
  }

}
