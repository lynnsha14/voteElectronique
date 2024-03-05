package Scrutin;

public class Vote {
	
private String text;
final static Vote Oui = new Vote("oui");
final static Vote Non = new Vote("non");
final static Vote Blanc = new Vote("blanc");
final static Vote Null= new Vote("null");


public Vote(String text)
{
	this.text=text;
		
}

public String getText()
{
	return this.text;
}

@Override 

public String toString() 
{
	return("vote"+ getText());
}

public boolean equals(Object o)
{
	if(!(o instanceof Vote))
	{
		return false;
	}
	
/*	if(Vote v= (Vote o))
	{
		return v.getText();
	}
	}
	????? j'arrive pas à implementer la methode equals
*/
	
	
	
public int Hashcode()
{
	return (object.hash(text));
	text.hashCode();
}
	
	
	
	
	
	
	
	
	
	
	
}