package RTC;


/**
* RTC/FOLLOWER_STATEHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/MobileRobot.idlから
* 2016年8月9日 12時30分07秒 JST
*/

abstract public class FOLLOWER_STATEHelper
{
  private static String  _id = "IDL:RTC/FOLLOWER_STATE:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.FOLLOWER_STATE that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.FOLLOWER_STATE extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (RTC.FOLLOWER_STATEHelper.id (), "FOLLOWER_STATE", new String[] { "FOLLOWER_STOPPED", "FOLLOWER_FOLLOWING", "FOLLOWER_SUSPEND", "FOLLOWER_ERROR", "FOLLOWER_UNKNOWN"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static RTC.FOLLOWER_STATE read (org.omg.CORBA.portable.InputStream istream)
  {
    return RTC.FOLLOWER_STATE.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.FOLLOWER_STATE value)
  {
    ostream.write_long (value.value ());
  }

}
