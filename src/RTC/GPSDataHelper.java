package RTC;


/**
* RTC/GPSDataHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

abstract public class GPSDataHelper
{
  private static String  _id = "IDL:RTC/GPSData:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.GPSData that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.GPSData extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [12];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = RTC.TimeHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "tm",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.GPSTimeHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "timeFromGPS",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[2] = new org.omg.CORBA.StructMember (
            "latitude",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[3] = new org.omg.CORBA.StructMember (
            "longitude",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[4] = new org.omg.CORBA.StructMember (
            "altitude",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[5] = new org.omg.CORBA.StructMember (
            "horizontalError",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[6] = new org.omg.CORBA.StructMember (
            "verticalError",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[7] = new org.omg.CORBA.StructMember (
            "heading",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[8] = new org.omg.CORBA.StructMember (
            "horizontalSpeed",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[9] = new org.omg.CORBA.StructMember (
            "verticalSpeed",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ushort);
          _members0[10] = new org.omg.CORBA.StructMember (
            "numSatellites",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.GPSFixTypeHelper.type ();
          _members0[11] = new org.omg.CORBA.StructMember (
            "fixType",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.GPSDataHelper.id (), "GPSData", _members0);
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

  public static RTC.GPSData read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.GPSData value = new RTC.GPSData ();
    value.tm = RTC.TimeHelper.read (istream);
    value.timeFromGPS = RTC.GPSTimeHelper.read (istream);
    value.latitude = istream.read_double ();
    value.longitude = istream.read_double ();
    value.altitude = istream.read_double ();
    value.horizontalError = istream.read_double ();
    value.verticalError = istream.read_double ();
    value.heading = istream.read_double ();
    value.horizontalSpeed = istream.read_double ();
    value.verticalSpeed = istream.read_double ();
    value.numSatellites = istream.read_ushort ();
    value.fixType = RTC.GPSFixTypeHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.GPSData value)
  {
    RTC.TimeHelper.write (ostream, value.tm);
    RTC.GPSTimeHelper.write (ostream, value.timeFromGPS);
    ostream.write_double (value.latitude);
    ostream.write_double (value.longitude);
    ostream.write_double (value.altitude);
    ostream.write_double (value.horizontalError);
    ostream.write_double (value.verticalError);
    ostream.write_double (value.heading);
    ostream.write_double (value.horizontalSpeed);
    ostream.write_double (value.verticalSpeed);
    ostream.write_ushort (value.numSatellites);
    RTC.GPSFixTypeHelper.write (ostream, value.fixType);
  }

}
