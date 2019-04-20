package practice2;

public class roger {
	<rdf:RDF 
	 xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#" 
	 xmlns:owl="http://www.w3.org/2002/07/owl#" 
	 xmlns:ex="http://schema.org/" 
	 xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#" 
	 xmlns:xsd="http://www.w3.org/2001/XMLSchema#"> 
	 <rdfs:Class rdf:about="http://schema.org/Person"/> 
	 <rdf:Property rdf:about="http://schema.org/knows"/> 
	 <rdf:Property rdf:about="http://schema.org/career"/> 
	 <rdf:Property rdf:about="http://schema.org/country"/> 
	 <rdf:Property rdf:about="http://schema.org/address"/> 
	 <rdf:Property rdf:about="http://schema.org/hometown"/> 
	 <rdf:Property rdf:about="http://schema.org/email"/> 
	 <rdf:Property rdf:about="http://schema.org/favopposition"/> 
	 <rdf:Property rdf:about="http://schema.org/favcourttype"/> 
	 <rdf:Property rdf:about="http://schema.org/birthDate"/> 
	 <rdf:Property rdf:about="http://schema.org/no.ofcups"/> 
	 <ex:Person rdf:about="http://www.example.org/RogerFederer"> 
	 <ex:country>Switzerland</ex:country> 
	 <ex:career>Tennis Player</ex:career> 
	 <ex:knows> 
	 <ex:Person rdf:about="http://www.example.org/RafaelNadal"/> 
	 </ex:knows> 
	 <ex:email>http://www.rogerfederer.com/en/en-etanavigation/contact.html</ex:email> 
	 <ex:no.ofcups>25</ex: no.ofcups > 
	 <ex:birthDate>August 8, 1981</ex:birthDate> 
	 <ex: favopposition >RafaelNadal</ex: favopposition > 
	 <ex:address>1 Tennis Road, Basel, Swiss 88080</ex:address> 
	 <ex:gender>male</ex:gender> 
	 <ex:homeLocation>Switzerland</ex:homeLocation> 
	 </ex:Person> 
	 </rdf:RDF> 


}
