package RTC;


/**
* RTC/Waypoint2DListHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef Waypoint2DList
     */
public final class Waypoint2DListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Waypoint2D value[] = null;

  public Waypoint2DListHolder ()
  {
  }

  public Waypoint2DListHolder (RTC.Waypoint2D[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Waypoint2DListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Waypoint2DListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Waypoint2DListHelper.type ();
  }

}
