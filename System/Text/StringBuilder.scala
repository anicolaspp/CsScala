package System.Text

import System.NotImplementedException
import java.io.StringWriter


class StringBuilder(sb:java.lang.StringBuilder) 
{
  
  def this(capacity:Int)
  {
    this(new java.lang.StringBuilder(capacity));
  }
  def this(initial:String)
  {
    this(new java.lang.StringBuilder(initial));
  }
  def this()
  {
    this(new java.lang.StringBuilder());
  }
  
  private var _writer:StringWriter = null;
  def SetStringWriter(writer:StringWriter)
  {
    _writer = writer;
  }
  
  def Append(c:Char)
  {
    sb.append(c);
  }
  def Append(s:String)
  {
    sb.append(s);
  }
  def AppendLine(s:String = null)
  {
    if (s != null)
    	sb.append(s);
    
    sb.append('\n');
  }
  def Append(i:Int)
  {
    sb.append(i);
  }
  def Append(s:String, offset:Int, len:Int)
  {
    throw new NotImplementedException();
  }
  
  def Insert(index:Int, c:Char)
  {
    sb.insert(index, c);
  }
  def Insert(index:Int, s:String)
  {
    sb.insert(index, s);
  }
  
  def Length:Int =
  {
    return sb.length();
  }
  
  override def toString():String = 
  {
    if (_writer == null)
    	return sb.toString();
    else
    	return _writer.toString();
  }
  
  def Clear()
  {
    sb.setLength(0);
  }
  
  def Remove(startAt:Int, count:Int)
  {
    sb.delete(startAt, startAt + count);
  }
  
  def apply(i:Int):Char = sb.charAt(i);
}