package de.uni_stuttgart.vis.vowl.owl2vowl.model.nodes.datatypes;

import de.uni_stuttgart.vis.vowl.owl2vowl.model.Constants;

public class RdfsDatatype extends BaseDatatype {
	public RdfsDatatype() {
		setType(Constants.TYPE_DATATYPE);
		setID();
	}

	@Override
	protected void setID() {
		id = "datatype" + counterObjects;
		counterObjects++;
	}
}
