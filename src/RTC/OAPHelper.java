package RTC;


/**
* RTC/OAPHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

abstract public class OAPHelper
{
  private static String  _id = "IDL:RTC/OAP:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.OAP that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.OAP extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = RTC.Vector3DHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "orientation",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Vector3DHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "approach",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Vector3DHelper.type ();
          _members0[2] = new org.omg.CORBA.StructMember (
            "position",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.OAPHelper.id (), "OAP", _members0);
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

  public static RTC.OAP read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.OAP value = new RTC.OAP ();
    value.orientation = RTC.Vector3DHelper.read (istream);
    value.approach = RTC.Vector3DHelper.read (istream);
    value.position = RTC.Vector3DHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.OAP value)
  {
    RTC.Vector3DHelper.write (ostream, value.orientation);
    RTC.Vector3DHelper.write (ostream, value.approach);
    RTC.Vector3DHelper.write (ostream, value.position);
  }

}
