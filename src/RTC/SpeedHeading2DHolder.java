package RTC;

/**
* RTC/SpeedHeading2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class SpeedHeading2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.SpeedHeading2D value = null;

  public SpeedHeading2DHolder ()
  {
  }

  public SpeedHeading2DHolder (RTC.SpeedHeading2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.SpeedHeading2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.SpeedHeading2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.SpeedHeading2DHelper.type ();
  }

}
