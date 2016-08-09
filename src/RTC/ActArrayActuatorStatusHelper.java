package RTC;


/**
* RTC/ActArrayActuatorStatusHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @enum ActArrayActuatorStatus
     * @brief Describes the status of an actuator.
     */
abstract public class ActArrayActuatorStatusHelper
{
  private static String  _id = "IDL:RTC/ActArrayActuatorStatus:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.ActArrayActuatorStatus that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.ActArrayActuatorStatus extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (RTC.ActArrayActuatorStatusHelper.id (), "ActArrayActuatorStatus", new String[] { "ACTUATOR_STATUS_IDLE", "ACTUATOR_STATUS_MOVING", "ACTUATOR_STATUS_BRAKED", "ACTUATOR_STATUS_STALLED"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static RTC.ActArrayActuatorStatus read (org.omg.CORBA.portable.InputStream istream)
  {
    return RTC.ActArrayActuatorStatus.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.ActArrayActuatorStatus value)
  {
    ostream.write_long (value.value ());
  }

}
