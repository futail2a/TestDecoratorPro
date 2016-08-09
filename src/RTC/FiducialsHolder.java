package RTC;

/**
* RTC/FiducialsHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class FiducialsHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Fiducials value = null;

  public FiducialsHolder ()
  {
  }

  public FiducialsHolder (RTC.Fiducials initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.FiducialsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.FiducialsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.FiducialsHelper.type ();
  }

}
