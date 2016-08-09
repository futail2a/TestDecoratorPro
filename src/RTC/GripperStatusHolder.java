package RTC;

/**
* RTC/GripperStatusHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @enum GripperStatus
     * @brief Describes the status of a gripper.
     */
public final class GripperStatusHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.GripperStatus value = null;

  public GripperStatusHolder ()
  {
  }

  public GripperStatusHolder (RTC.GripperStatus initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.GripperStatusHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.GripperStatusHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.GripperStatusHelper.type ();
  }

}
