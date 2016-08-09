package RTC;


/**
* RTC/GripperStatusHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @enum GripperStatus
     * @brief Describes the status of a gripper.
     */
abstract public class GripperStatusHelper
{
  private static String  _id = "IDL:RTC/GripperStatus:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.GripperStatus that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.GripperStatus extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (RTC.GripperStatusHelper.id (), "GripperStatus", new String[] { "GRIPPER_STATE_OPEN", "GRIPPER_STATE_CLOSED", "GRIPPER_STATE_MOVING", "GRIPPER_STATE_UNKNOWN"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static RTC.GripperStatus read (org.omg.CORBA.portable.InputStream istream)
  {
    return RTC.GripperStatus.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.GripperStatus value)
  {
    ostream.write_long (value.value ());
  }

}
