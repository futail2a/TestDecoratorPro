package RTC;

/**
* RTC/OGMapTileHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class OGMapTileHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.OGMapTile value = null;

  public OGMapTileHolder ()
  {
  }

  public OGMapTileHolder (RTC.OGMapTile initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.OGMapTileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.OGMapTileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.OGMapTileHelper.type ();
  }

}
