package RTC;

/**
* RTC/Hypothesis3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class Hypothesis3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Hypothesis3D value = null;

  public Hypothesis3DHolder ()
  {
  }

  public Hypothesis3DHolder (RTC.Hypothesis3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Hypothesis3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Hypothesis3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Hypothesis3DHelper.type ();
  }

}
