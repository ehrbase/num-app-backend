package org.ehrbase.numappbackend.opt.openereactcarecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.util.List;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
public class LatestCovid19TestTestRequestDetailsCluster {
  @Path("/items[at0035]")
  private List<Cluster> distributionList;

  @Path("/items[at0090]")
  private Cluster requester;

  public void setDistributionList(List<Cluster> distributionList) {
     this.distributionList = distributionList;
  }

  public List<Cluster> getDistributionList() {
     return this.distributionList ;
  }

  public void setRequester(Cluster requester) {
     this.requester = requester;
  }

  public Cluster getRequester() {
     return this.requester ;
  }
}
