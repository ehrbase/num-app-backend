package org.ehrbase.numappbackend.opt.openereactcarecomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_CODED_TEXT")
public class Covid19ExposureRiskFactorDvcodedtextCareHomeHasSuspectedConfirmedCovid192 implements Covid19ExposureRiskFactorChoice {
  @Path("|defining_code")
  private RiskFactorDefiningcode riskFactorDefiningcode;

  public void setRiskFactorDefiningcode(RiskFactorDefiningcode riskFactorDefiningcode) {
     this.riskFactorDefiningcode = riskFactorDefiningcode;
  }

  public RiskFactorDefiningcode getRiskFactorDefiningcode() {
     return this.riskFactorDefiningcode ;
  }
}
