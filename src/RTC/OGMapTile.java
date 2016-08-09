package RTC;


/**
* RTC/OGMapTile.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

public final class OGMapTile implements org.omg.CORBA.portable.IDLEntity
{

  /// X coordinate of the (0, 0) cell of this tile in the whole map.
  public int column = (int)0;

  /// Y coordinate of the (0, 0) cell of this tile in the whole map.
  public int row = (int)0;

  /// Number of cells along the x axis in this tile;
  public int width = (int)0;

  /// Number of cells along the y axis in this tile;
  public int height = (int)0;

  /// Tile cells in (row, column) order.
  public byte cells[] = null;

  public OGMapTile ()
  {
  } // ctor

  public OGMapTile (int _column, int _row, int _width, int _height, byte[] _cells)
  {
    column = _column;
    row = _row;
    width = _width;
    height = _height;
    cells = _cells;
  } // ctor

} // class OGMapTile
