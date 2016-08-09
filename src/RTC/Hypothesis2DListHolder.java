package RTC;


/**
* RTC/Hypothesis2DListHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef Hypothesis2DList
     */
public final class Hypothesis2DListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Hypothesis2D value[] = null;

  public Hypothesis2DListHolder ()
  {
  }

  public Hypothesis2DListHolder (RTC.Hypothesis2D[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Hypothesis2DListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Hypothesis2DListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Hypothesis2DListHelper.type ();
  }

}
