package RTC;


/**
* RTC/FeaturesHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

abstract public class FeaturesHelper
{
  private static String  _id = "IDL:RTC/Features:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.Features that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.Features extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [4];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = RTC.TimeHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "tm",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.PointFeatureHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (RTC.PointFeatureListHelper.id (), "PointFeatureList", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "pointFeatures",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.PoseFeatureHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (RTC.PoseFeatureListHelper.id (), "PoseFeatureList", _tcOf_members0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "poseFeatures",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.LineFeatureHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (RTC.LineFeatureListHelper.id (), "LineFeatureList", _tcOf_members0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "lineFeatures",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.FeaturesHelper.id (), "Features", _members0);
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

  public static RTC.Features read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.Features value = new RTC.Features ();
    value.tm = RTC.TimeHelper.read (istream);
    value.pointFeatures = RTC.PointFeatureListHelper.read (istream);
    value.poseFeatures = RTC.PoseFeatureListHelper.read (istream);
    value.lineFeatures = RTC.LineFeatureListHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.Features value)
  {
    RTC.TimeHelper.write (ostream, value.tm);
    RTC.PointFeatureListHelper.write (ostream, value.pointFeatures);
    RTC.PoseFeatureListHelper.write (ostream, value.poseFeatures);
    RTC.LineFeatureListHelper.write (ostream, value.lineFeatures);
  }

}
