package RTC;

/**
* RTC/Hypothesis2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class Hypothesis2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Hypothesis2D value = null;

  public Hypothesis2DHolder ()
  {
  }

  public Hypothesis2DHolder (RTC.Hypothesis2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Hypothesis2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Hypothesis2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Hypothesis2DHelper.type ();
  }

}
