package RTC;

/**
* RTC/FiducialInfoHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class FiducialInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.FiducialInfo value = null;

  public FiducialInfoHolder ()
  {
  }

  public FiducialInfoHolder (RTC.FiducialInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.FiducialInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.FiducialInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.FiducialInfoHelper.type ();
  }

}
