package RTC;

/**
* RTC/Hypotheses2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class Hypotheses2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Hypotheses2D value = null;

  public Hypotheses2DHolder ()
  {
  }

  public Hypotheses2DHolder (RTC.Hypotheses2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Hypotheses2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Hypotheses2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Hypotheses2DHelper.type ();
  }

}
