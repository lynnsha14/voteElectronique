package Scrutin;

import java.util.HashMap;
import java.util.Map;

public class MajoriteAbsolue {
	
 private Map <Vote,Integer>resulat = new HashMap<>();
 private boolean estclos;
 public int nbreinscrit;
 
 
  public MajoriteAbsolue()
  {

}
  
  public Set<Vote>getVotesPossible()
  {
	  return resultat.keySet();
  }
  
  
  public void ajouterVote(Vote v)
  {
	  if(estclos)
	  {
		  throw new close Exception();
	  }
	  if(!resultat.containsKey(v))
		  
	  {
		  resultat.put(Vote.Null,resultat.get(Vote.Null)+1);
	  }
	  else
		 ( resultat.put(v),resultat.get(v)+1);
		  
	  }		  
		  
  public void afficherResulat()
  { if(!estclos)
  {
	  throw new close Exception();
  }
	 for(Vote v:this.getVotesPossible())
	 {
		 System.out.println(v+"\n nbre de vote " + resultat.get(v) );
	 }
	    
	  
  }
  
  public void cloturer()
  
  {
	  this.estclos=true;
	  afficherResulatat()
  }

}