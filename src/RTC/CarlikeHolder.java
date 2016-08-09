package RTC;

/**
* RTC/CarlikeHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

public final class CarlikeHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Carlike value = null;

  public CarlikeHolder ()
  {
  }

  public CarlikeHolder (RTC.Carlike initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.CarlikeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.CarlikeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.CarlikeHelper.type ();
  }

}
