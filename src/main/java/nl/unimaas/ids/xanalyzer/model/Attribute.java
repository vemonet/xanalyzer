package nl.unimaas.ids.xanalyzer.model;

public class Attribute extends BaseNode {

	@Override
	String getType() {
		return Attribute.class.getSimpleName();
	}
	
	@Override
	String getXPath() {
		return parent.getXPath() + "/@" + name;
	}

}
