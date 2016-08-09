package RTC;


/**
* RTC/Hypothesis3DListHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef Hypothesis3DList
     */
public final class Hypothesis3DListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Hypothesis3D value[] = null;

  public Hypothesis3DListHolder ()
  {
  }

  public Hypothesis3DListHolder (RTC.Hypothesis3D[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Hypothesis3DListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Hypothesis3DListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Hypothesis3DListHelper.type ();
  }

}
