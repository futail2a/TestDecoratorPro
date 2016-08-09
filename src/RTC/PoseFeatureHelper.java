package RTC;


/**
* RTC/PoseFeatureHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

abstract public class PoseFeatureHelper
{
  private static String  _id = "IDL:RTC/PoseFeature:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.PoseFeature that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.PoseFeature extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[0] = new org.omg.CORBA.StructMember (
            "probability",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Pose2DHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "position",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Covariance2DHelper.type ();
          _members0[2] = new org.omg.CORBA.StructMember (
            "covariance",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.PoseFeatureHelper.id (), "PoseFeature", _members0);
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

  public static RTC.PoseFeature read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.PoseFeature value = new RTC.PoseFeature ();
    value.probability = istream.read_double ();
    value.position = RTC.Pose2DHelper.read (istream);
    value.covariance = RTC.Covariance2DHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.PoseFeature value)
  {
    ostream.write_double (value.probability);
    RTC.Pose2DHelper.write (ostream, value.position);
    RTC.Covariance2DHelper.write (ostream, value.covariance);
  }

}
