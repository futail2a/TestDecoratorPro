package RTC;


/**
* RTC/LimbStateHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

abstract public class LimbStateHelper
{
  private static String  _id = "IDL:RTC/LimbState:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.LimbState that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.LimbState extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = RTC.TimeHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "tm",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.OAPHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "oapMatrix",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.LimbStatusHelper.type ();
          _members0[2] = new org.omg.CORBA.StructMember (
            "status",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.LimbStateHelper.id (), "LimbState", _members0);
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

  public static RTC.LimbState read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.LimbState value = new RTC.LimbState ();
    value.tm = RTC.TimeHelper.read (istream);
    value.oapMatrix = RTC.OAPHelper.read (istream);
    value.status = RTC.LimbStatusHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.LimbState value)
  {
    RTC.TimeHelper.write (ostream, value.tm);
    RTC.OAPHelper.write (ostream, value.oapMatrix);
    RTC.LimbStatusHelper.write (ostream, value.status);
  }

}
