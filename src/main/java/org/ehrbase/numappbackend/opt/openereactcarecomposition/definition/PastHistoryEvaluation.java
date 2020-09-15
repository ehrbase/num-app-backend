package org.ehrbase.numappbackend.opt.openereactcarecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.numappbackend.opt.shareddefinition.Language;

@Entity
@Archetype("openEHR-EHR-EVALUATION.clinical_synopsis.v1")
public class PastHistoryEvaluation {
  @Path("/subject")
  private PartyProxy subject;

  @Path("/data[at0001]/items[at0002]/value|value")
  private String synopsisValue;

  @Path("/language")
  private Language language;

  @Path("/protocol[at0003]/items[at0004]")
  private List<Cluster> extension;

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setSynopsisValue(String synopsisValue) {
     this.synopsisValue = synopsisValue;
  }

  public String getSynopsisValue() {
     return this.synopsisValue ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }
}
