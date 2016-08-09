package RTC;


/**
* RTC/PointCloudPointListHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef PointCloudPointList
     */
abstract public class PointCloudPointListHelper
{
  private static String  _id = "IDL:RTC/PointCloudPointList:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.PointCloudPoint[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.PointCloudPoint[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = RTC.PointCloudPointHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (RTC.PointCloudPointListHelper.id (), "PointCloudPointList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static RTC.PointCloudPoint[] read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.PointCloudPoint value[] = null;
    int _len0 = istream.read_long ();
    value = new RTC.PointCloudPoint[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = RTC.PointCloudPointHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.PointCloudPoint[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      RTC.PointCloudPointHelper.write (ostream, value[_i0]);
  }

}
