package org.vivoweb.reasoner.plugin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.ResourceFactory;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.vocabulary.RDF;
import com.hp.hpl.jena.vocabulary.RDFS;

import edu.cornell.mannlib.vitro.webapp.reasoner.ReasonerPlugin;

public class DCTitleForDocuments extends SimplePropertyAndTypeRule implements ReasonerPlugin {

	public DCTitleForDocuments() {
		super(RDFS.label.getURI(), 
		      "http://purl.org/ontology/bibo/Document", 
		      "http://purl.org/dc/terms/title");
	}
			   
}
