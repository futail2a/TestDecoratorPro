package RTC;


/**
* RTC/TimedOctetSeqHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 12時30分07秒 JST
*/

abstract public class TimedOctetSeqHelper
{
  private static String  _id = "IDL:RTC/TimedOctetSeq:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.TimedOctetSeq that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.TimedOctetSeq extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = RTC.TimeHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "tm",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_octet);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "data",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.TimedOctetSeqHelper.id (), "TimedOctetSeq", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static RTC.TimedOctetSeq read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.TimedOctetSeq value = new RTC.TimedOctetSeq ();
    value.tm = RTC.TimeHelper.read (istream);
    int _len0 = istream.read_long ();
    value.data = new byte[_len0];
    istream.read_octet_array (value.data, 0, _len0);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.TimedOctetSeq value)
  {
    RTC.TimeHelper.write (ostream, value.tm);
    ostream.write_long (value.data.length);
    ostream.write_octet_array (value.data, 0, value.data.length);
  }

}
