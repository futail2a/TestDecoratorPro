package RTC;


/**
* RTC/LineFeatureHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

abstract public class LineFeatureHelper
{
  private static String  _id = "IDL:RTC/LineFeature:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.LineFeature that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.LineFeature extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [8];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[0] = new org.omg.CORBA.StructMember (
            "probability",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[1] = new org.omg.CORBA.StructMember (
            "rho",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[2] = new org.omg.CORBA.StructMember (
            "alpha",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.PointCovariance2DHelper.type ();
          _members0[3] = new org.omg.CORBA.StructMember (
            "covariance",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Point2DHelper.type ();
          _members0[4] = new org.omg.CORBA.StructMember (
            "start",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Point2DHelper.type ();
          _members0[5] = new org.omg.CORBA.StructMember (
            "end",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
          _members0[6] = new org.omg.CORBA.StructMember (
            "startSighted",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
          _members0[7] = new org.omg.CORBA.StructMember (
            "endSighted",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.LineFeatureHelper.id (), "LineFeature", _members0);
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

  public static RTC.LineFeature read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.LineFeature value = new RTC.LineFeature ();
    value.probability = istream.read_double ();
    value.rho = istream.read_double ();
    value.alpha = istream.read_double ();
    value.covariance = RTC.PointCovariance2DHelper.read (istream);
    value.start = RTC.Point2DHelper.read (istream);
    value.end = RTC.Point2DHelper.read (istream);
    value.startSighted = istream.read_boolean ();
    value.endSighted = istream.read_boolean ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.LineFeature value)
  {
    ostream.write_double (value.probability);
    ostream.write_double (value.rho);
    ostream.write_double (value.alpha);
    RTC.PointCovariance2DHelper.write (ostream, value.covariance);
    RTC.Point2DHelper.write (ostream, value.start);
    RTC.Point2DHelper.write (ostream, value.end);
    ostream.write_boolean (value.startSighted);
    ostream.write_boolean (value.endSighted);
  }

}
