package RTC;

/**
* RTC/Hypotheses3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class Hypotheses3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Hypotheses3D value = null;

  public Hypotheses3DHolder ()
  {
  }

  public Hypotheses3DHolder (RTC.Hypotheses3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Hypotheses3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Hypotheses3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Hypotheses3DHelper.type ();
  }

}
