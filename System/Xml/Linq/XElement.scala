package System.Xml.Linq

import org.jdom2._
import System.Xml.XmlNodeType
import System.NotImplementedException

class XElement(elem:Element) extends XContainer(elem)
{
  def this(name:String)
  {
    this(new Element(name));
  }
  def Attribute(name:String):XAttribute =
  {
    
    val a = _elem.getAttribute(name);
    if (a == null)
      return null;
    else
      return new XAttribute(a);
  }
  
  def SetAttributeValue(name:String, value:String)
  {
    _elem.setAttribute(name, value);
  }
  
  def Value:String =
  {
    return _elem.getText();
  }
  
  def Name:XName = {
    return new XName(_elem.getName());
  }
  
  def NodeType:Int = XmlNodeType.Element;

  def GetDefaultNamespace():XNamespace =
  {
    throw new NotImplementedException("stub");
  }
}