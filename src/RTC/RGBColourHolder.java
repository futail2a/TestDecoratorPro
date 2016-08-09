package RTC;

/**
* RTC/RGBColourHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class RGBColourHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.RGBColour value = null;

  public RGBColourHolder ()
  {
  }

  public RGBColourHolder (RTC.RGBColour initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.RGBColourHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.RGBColourHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.RGBColourHelper.type ();
  }

}
