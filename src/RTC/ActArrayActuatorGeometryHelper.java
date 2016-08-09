package RTC;


/**
* RTC/ActArrayActuatorGeometryHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

abstract public class ActArrayActuatorGeometryHelper
{
  private static String  _id = "IDL:RTC/ActArrayActuatorGeometry:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.ActArrayActuatorGeometry that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.ActArrayActuatorGeometry extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [9];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = RTC.ActArrayActuatorTypeHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "type",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[1] = new org.omg.CORBA.StructMember (
            "length",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Orientation3DHelper.type ();
          _members0[2] = new org.omg.CORBA.StructMember (
            "orientation",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Vector3DHelper.type ();
          _members0[3] = new org.omg.CORBA.StructMember (
            "axis",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[4] = new org.omg.CORBA.StructMember (
            "minRange",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[5] = new org.omg.CORBA.StructMember (
            "centre",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[6] = new org.omg.CORBA.StructMember (
            "maxRange",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[7] = new org.omg.CORBA.StructMember (
            "homePosition",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
          _members0[8] = new org.omg.CORBA.StructMember (
            "hasBrakes",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.ActArrayActuatorGeometryHelper.id (), "ActArrayActuatorGeometry", _members0);
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

  public static RTC.ActArrayActuatorGeometry read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.ActArrayActuatorGeometry value = new RTC.ActArrayActuatorGeometry ();
    value.type = RTC.ActArrayActuatorTypeHelper.read (istream);
    value.length = istream.read_double ();
    value.orientation = RTC.Orientation3DHelper.read (istream);
    value.axis = RTC.Vector3DHelper.read (istream);
    value.minRange = istream.read_double ();
    value.centre = istream.read_double ();
    value.maxRange = istream.read_double ();
    value.homePosition = istream.read_double ();
    value.hasBrakes = istream.read_boolean ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.ActArrayActuatorGeometry value)
  {
    RTC.ActArrayActuatorTypeHelper.write (ostream, value.type);
    ostream.write_double (value.length);
    RTC.Orientation3DHelper.write (ostream, value.orientation);
    RTC.Vector3DHelper.write (ostream, value.axis);
    ostream.write_double (value.minRange);
    ostream.write_double (value.centre);
    ostream.write_double (value.maxRange);
    ostream.write_double (value.homePosition);
    ostream.write_boolean (value.hasBrakes);
  }

}
